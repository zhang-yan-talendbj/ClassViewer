package org.glavo.viewer.util

import java.util.*

object ShutdownHook : Thread() {
    init {
        Runtime.getRuntime().addShutdownHook(this)
    }

    private val list = Collections.synchronizedList(mutableListOf<() -> Unit>())

    override fun run() {
        list.forEach {
            try {
                it()
            } catch (e: Exception) {
                Logger.warning(exception = e)
            }
        }
        Logger.info("Exit")
        LoggerUtils.exit()
        LoggerUtils.join()
    }

    operator fun plusAssign(op: () -> Unit) {
        list += op
    }
}