package com.ru.waka

import com.ru.waka.hoge.Hoge
import org.json4s.{DefaultFormats, Formats}

class App extends AppStack {
  protected implicit val jsonFormats: Formats = DefaultFormats.withBigDecimal

  get("/") {
    "{\"message\": \"Hello World\"}"
  }

  get("/json") {
    Hoge(id=1, name= "hoge")
  }
}


