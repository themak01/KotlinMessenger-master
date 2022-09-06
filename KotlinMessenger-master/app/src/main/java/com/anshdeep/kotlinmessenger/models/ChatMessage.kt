package com.anshdeep.kotlinmessenger.models

/**
 * Created by aftab on 28/05/19.
 */
class ChatMessage(
        val id: String,
        val text: String,
        val fromId: String,
        val toId: String,
        val timestamp: Long
) {
    constructor() : this("", "", "", "", -1)
}