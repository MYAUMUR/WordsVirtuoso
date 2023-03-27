interface ILogHolder {
    fun printLog()
    fun collectLog(log: String)
    var curLog: String
}

class Logger : ILogHolder {
    override fun printLog() = println(curLog)
    override fun collectLog(log: String) = kotlin.run { curLog += "\n> $log" }
    override var curLog: String = "> Logger initialized."
}

class ErrorHandler(base: ILogHolder) : ILogHolder by base {
    private var errorMessage: String = ""
    fun getErrorMessage(msg: String) {
        errorMessage = msg
        logErrorMessage(errorMessage)
    }

    private fun logErrorMessage(msg: String) = collectLog(msg)
}

fun doSomething(handler: ErrorHandler): ErrorHandler {
    handler.getErrorMessage("Access denied")
    handler.getErrorMessage("Out of memory")
    handler.getErrorMessage("I'm not an error")
    return handler
}

fun main() = with(ErrorHandler(Logger())) { doSomething(this).printLog() }