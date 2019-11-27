package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @RequestMapping("/hello")
    fun getHello(text: String): String {
        return text.hello()
    }

    @RequestMapping("/split")
    fun splitCsv(csv: String): String {
        return csv.split(",")
                .filter { it.startsWith("A") }
                .joinToString { it }
                .hello()
    }
}