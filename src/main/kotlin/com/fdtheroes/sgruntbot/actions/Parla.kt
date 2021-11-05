package com.fdtheroes.sgruntbot.actions

import com.fdtheroes.sgruntbot.BotUtils
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Message

class Parla : Action {

    private val regex = Regex(
        "^!parla (.*)$",
        setOf(RegexOption.IGNORE_CASE, RegexOption.MULTILINE, RegexOption.DOT_MATCHES_ALL)
    )

    override fun doAction(message: Message) {
        val msg = regex.find(message.text)?.groupValues?.get(1)
        if (msg != null) {
            val sendMessage = SendMessage(BotUtils.chatId, "Mi dicono di dire: $msg")
            BotUtils.rispondi(sendMessage)
        }
    }
}