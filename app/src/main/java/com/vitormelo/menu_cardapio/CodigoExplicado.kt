/*
package com.vitormelo.menu_cardapio
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.vitormelo.menu_cardapio.databinding.ActivityMainBinding

class CodigoExplicado {

    package com.vitormelo.menu_cardapio
    import java.util.HashMap
    import android.adservices.adid.AdId
    import androidx.appcompat.app.AppCompatActivity//a classe AppCompatActivity que é uma classe Responsável por obter funcionalidades especificas para criação e gereciamento da aplicação
    import android.os.Bundle//O objetivo principal do Bundle é armazenar informações sobre o estado anterior da atividade, para que, por exemplo, se a atividade for recriada após uma rotação da tela, ela possa recuperar seu estado anterior.
    import android.view.View
    import android.widget.CheckBox
    import android.widget.Toast
    import androidx.core.view.iterator
    import com.vitormelo.menu_cardapio.databinding.ActivityMainBinding //a classe ActivityMainBinding tem todas as referencias diretas para as views do XML(é basicamente o XML)

//Essas 3 classes são criadas automaticamente ao se criar o Binding no gradle.kts
//lateinit na variavel por que ela precisaria ser iniciada, mas só vai ser depois
//Oncreate pertence a class AppCompatActivity, sendo assim ela vem com um override pra permitir modificações
//Inflar o layout significa pegar o arquivo XML e converter ele em objetos de código para serem usados no backend
//Se tivesse mais de um XML, seriam criadas as classe aqui, e depois era só passar uma variavel binding pra cada um (Ex: Binding: ActivityMainBinding | Binding2: ActivityMain2Binding)

    class MainActivity : AppCompatActivity(), View.OnClickListener {
        //Criou uma interface view.OnclickListener
        lateinit var binding: ActivityMainBinding //É como se eu criasse um objeto do tipo dessa classe, que é justamente a responsavel por ter todos os view dos xml(basicamente o proprio XML)
        override fun onCreate(savedInstanceState: Bundle?) {//Essa linha serve para salvar informações da aplicação e evitar percas
            super.onCreate(savedInstanceState)//Garantindo que as funções de AppCompatActivity sejam passadas primeiro
            binding =
                ActivityMainBinding.inflate(layoutInflater)//Usando a variável binding como um objeto que vai receber o inflate, assim todos os views podem ser acessados e modificados
            setContentView(binding.root)//SetContentView especifica qual layout vai ser exibido na tela para a atividade, se tivesse mais de um, era só passar a variável correspondente a ele
            //Binding.root está dizendo para que se exiba a visualização raiz do layout XML associado ao objeto binding, ou seja, o proprio XML criado aqui
            binding.BotaoCalcular.setOnClickListener(this)//Criando issso aqui vai pedir pra criar uma interface
}
*/
