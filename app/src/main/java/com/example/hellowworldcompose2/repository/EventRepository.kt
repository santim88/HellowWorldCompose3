package com.example.hellowworldcompose2.repository

import com.example.hellowworldcompose2.model.Event


class EventRepository {
      fun getAllData(): List<Event>{
          return listOf(
              Event(
                  id = 1,
                  name = "Evento A",
                  place = "Minas",
                  date = "17/09/2000",
                  hour = "5:30"
              ),
              Event(
                  id = 2,
                  name = "Evento A",
                  place = "Doe",
                  date = "17/09/2000",
                  hour = "5:30"
              ),
              Event(
                  id = 3,
                  name = "Evento A",
                  place = "Doe",
                  date = "17/09/2000",
                  hour = "5:30"
              ),
              Event(
                  id = 4,
                  name = "Evento A",
                  place = "Doe",
                  date = "17/09/2000",
                  hour = "5:30"
              )

          )
      }
}