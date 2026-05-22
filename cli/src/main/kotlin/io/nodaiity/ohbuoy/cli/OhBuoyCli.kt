package io.nodaiity.ohbuoy.cli

import io.nodaiity.ohbuoy.core.render.TraceRenderer
import io.nodaiity.ohbuoy.core.scanner.ContinuityScanner
import io.nodaiity.ohbuoy.core.scanner.ScannerMode
import java.io.PrintStream
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    System.setOut(PrintStream(System.out, true, Charsets.UTF_8))

    val mode = args.toScannerMode()

    if (mode == null) {
        println("Usage: ohbuoy [scan] <startup|login|governance|navigation>")
        exitProcess(1)
    }

    val packets = ContinuityScanner().run(mode)
    println(TraceRenderer().render(packets))
}

private fun Array<String>.toScannerMode(): ScannerMode? {
    val modeName = when {
        size == 1 -> this[0]
        size == 2 && this[0].equals("scan", ignoreCase = true) -> this[1]
        else -> return null
    }

    return when (modeName.lowercase()) {
        "startup" -> ScannerMode.STARTUP
        "login" -> ScannerMode.LOGIN
        "governance" -> ScannerMode.GOVERNANCE
        "navigation" -> ScannerMode.NAVIGATION
        else -> null
    }
}
