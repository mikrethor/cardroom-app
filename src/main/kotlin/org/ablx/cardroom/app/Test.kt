package org.ablx.cardroom.app

import win32.*
fun main(args: Array<String>) {
    MessageBoxW(null, "Привет!","标题", MB_YESNOCANCEL or MB_ICONQUESTION)
}