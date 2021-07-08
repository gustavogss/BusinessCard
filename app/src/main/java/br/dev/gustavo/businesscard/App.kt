package br.dev.gustavo.businesscard

import android.app.Application
import br.dev.gustavo.businesscard.data.AppDatabase
import br.dev.gustavo.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}