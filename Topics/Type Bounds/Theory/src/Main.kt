import java.io.Console
import kotlin.math.log

interface ICallbackReceiver {
    fun onBeforeAction()
    fun onAfterAction()
    fun action(function: () -> Unit) {
        onBeforeAction()
        function()
        onAfterAction()
    }
}

interface ILogger {
    fun getStubDateTime() = "03.20.2023-2:11:10"

    val format: String get() = "[${getStubDateTime()}]: "

    fun print(s: String)
}

class BasicLogger : ILogger {
    override fun print(s: String) = println(format + s)
}

class ConsoleNotifier(logger: ILogger) : ICallbackReceiver, ILogger by logger {
    val onBeforeString = "OnBefore!"
    val onAfterString = "OnAfter!"

    override fun onBeforeAction() = println(onBeforeString)

    override fun onAfterAction() = println(onAfterString)
}

class ExampleParser(notifier: ICallbackReceiver, logger: BasicLogger) : ICallbackReceiver by notifier,
    ILogger by logger {
    fun start() = action { parseFiles() }

    private fun parseFiles() {
        println("Parsing")
        // Some more fun
    }
}

fun main() {
    val loggerInstance: BasicLogger = BasicLogger()
    val dataTimeNotifier: ConsoleNotifier = ConsoleNotifier(loggerInstance)

    val simpleParser = ExampleParser(dataTimeNotifier, loggerInstance)
    simpleParser.start()
}