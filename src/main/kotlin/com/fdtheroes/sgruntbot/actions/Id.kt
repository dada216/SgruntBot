package com.fdtheroes.sgruntbot.actions

import com.fdtheroes.sgruntbot.BotUtils
import org.telegram.telegrambots.meta.api.objects.Message

class Id : Action {

    private val regex = Regex("^!id$", RegexOption.IGNORE_CASE)

    override fun doAction(message: Message) {
        if (regex.matches(message.text)) {
            BotUtils.rispondi(message, "Il tuo id: ${message.from.id}")
        }
    }
}