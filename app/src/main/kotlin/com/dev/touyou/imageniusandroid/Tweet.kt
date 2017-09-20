package com.dev.touyou.imageniusandroid

import java.net.URL

/**
 * Created by touyou on 16/08/08.
 */
data class Tweet(val user: TweetUser, val text: String, val createdAt: String)

data class TweetUser(val screenName: String, val userName: String, val userId: String, val userImg: URL)