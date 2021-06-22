package live.adabe.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {

    val username = "admin"
    val password = "admin"

    private lateinit var usernameInput: EditText
    private lateinit var passinputInput: EditText
    private lateinit var button2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.userNameInput)
        passinputInput = findViewById(R.id.passwordInput)
        button2 = findViewById(R.id.submitButton)

        button2.setOnClickListener(
            val username = username
        )
    }

    fun login(username: String, password: String) {
        if (isValidCredentials(username, password)) {
            val Intent: Intent = Intent(this, Homeactivity2: : class.java)
            intent.putExtra(name:"username",username)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "LOGIN NOT SUCCESSFUL", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidCredentials(username: String, password: String):Boolean {
        if (this.username == username && this.password == password) return true
        return false
    }
}
