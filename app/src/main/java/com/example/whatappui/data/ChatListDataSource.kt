package com.example.whatappui.data

import com.example.whatappui.domain.ChatListDataObject
import com.example.whatappui.domain.Message
import com.example.whatappui.domain.MessageDeliveryStatus
import com.example.whatappui.domain.MessageType

val chatList = listOf<ChatListDataObject>(
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morning",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userName = "Virat Kohli"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "Hey Tony, how is the suit?",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = null
        ),
        userName = "Captain America",
    ),
    ChatListDataObject(
        chatId = 3,
        message = Message(
            content = "I'll be there in 10 minutes.",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userName = "Black Panther"
    ),
    ChatListDataObject(
        chatId = 4,
        message = Message(
            content = "Send me the report by 5 PM.",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = 6
        ),
        userName = "Pepper Potts"
    ),
    ChatListDataObject(
        chatId = 5,
        message = Message(
            content = "Where's the Stark Tower?",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Spider-Man"
    ),
    ChatListDataObject(
        chatId = 6,
        message = Message(
            content = "Got the new tech. It's amazing!",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userName = "Iron Man"
    ),
    ChatListDataObject(
        chatId = 7,
        message = Message(
            content = "We need to talk about the plan.",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Thor"
    ),
    ChatListDataObject(
        chatId = 8,
        message = Message(
            content = "Just finished the training session.",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Hulk"
    ),
    ChatListDataObject(
        chatId = 9,
        message = Message(
            content = "Don't forget to bring the documents.",
            timeStamp = "28/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Doctor Strange"
    ),
    ChatListDataObject(
        chatId = 10,
        message = Message(
            content = "I found a lead on the next mission.",
            timeStamp = "28/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Black Widow"
    ),
    ChatListDataObject(
        chatId = 11,
        message = Message(
            content = "What time is the meeting?",
            timeStamp = "28/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userName = "Ant-Man"
    ),
    ChatListDataObject(
        chatId = 12,
        message = Message(
            content = "I'll meet you at the usual spot.",
            timeStamp = "28/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Hawkeye"
    ),
    ChatListDataObject(
        chatId = 13,
        message = Message(
            content = "We've got a new mission briefing.",
            timeStamp = "28/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Maria Hill"
    ),
    ChatListDataObject(
        chatId = 14,
        message = Message(
            content = "The mission is scheduled for tomorrow.",
            timeStamp = "28/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Nick Fury"
    )
)