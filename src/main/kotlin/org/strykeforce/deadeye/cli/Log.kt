package org.strykeforce.deadeye.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.multiple
import edu.wpi.first.networktables.EntryListenerFlags.*
import edu.wpi.first.networktables.NetworkTableInstance

class Log : CliktCommand() {
    private val ids by argument().multiple()

    override fun run() {
        val flags = kImmediate or kNew or kUpdate
        println("waiting for log entries...")
        val nti = NetworkTableInstance.getDefault()
        val e0 = nti.addEntryListener(
            "/Deadeye/E/0/Log",
            { t -> println(t.value.string) },
            flags
        )
        val e1 = nti.addEntryListener(
            "/Deadeye/E/1/Log",
            { t -> println(t.value.string) },
            flags
        )
        val e2 = nti.addEntryListener(
            "/Deadeye/E/2/Log",
            { t -> println(t.value.string) },
            flags
        )

        while (true) {
            Thread.sleep(500)
        }
    }
}