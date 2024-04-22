package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    /*@RequestMapping(value = "/elastech", method = RequestMethod.GET)//pode ser mudado para post
    @ResponseBody
    public  String paginaelastech(@RequestParam String nome, @RequestParam int idade){
        if(idade>=18) {
            return "Bem vindo a elastech " + nome+" sua idade é "+idade;
        }else{
            return "Você não pode ser um membro ElasTech";
        }
    }*/
    @RequestMapping(value = "/elastech", method = RequestMethod.POST)
    public  String paginaelastech(@RequestParam String nome, @RequestParam int idade, Model model){
        if(idade>=18) {
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);
            return "maior-idade";
        }else{
            int falta = 18 - idade;
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);
            model.addAttribute("falta",falta);
            return "menor-idade";
        }
    }
// Pesquisar model.addAttribute e xmlns:th="http://www.thymeleaf.org"
    @GetMapping("/cadastro-produto")
    public  String cadastroproduto(){
        return "cadastro-produto";
    }
    @GetMapping("/cadastro-usuario")
    public String cadastrousuario(){
        return "cadastro-usuario";
    }
}
