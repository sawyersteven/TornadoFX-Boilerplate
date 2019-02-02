package app

import tornadofx.*
import javafx.geometry.Pos
import javafx.scene.layout.Priority

class MainView : View() {
    override val root = vbox {
        alignment = Pos.CENTER
        button("Button 1") {
            action {
                println("Hello From Button One")
            }
        }
        button("Button 2") {
            action {
                println("Hello From Button Two")
            }
        }
    }
}
