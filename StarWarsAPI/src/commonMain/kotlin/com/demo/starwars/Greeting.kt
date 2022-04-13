package com.demo.starwars

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}