programa {
funcao inicio() {
        real saldoAtual = 10.00
        real valorSolicitado = 0.0
        real saldoChequeEspecial = 20.00
        cadeia opcao
        
        escreva("informe o valor desejado \n")
        
        leia(valorSolicitado)
        
        se(valorSolicitado > saldoAtual){
            se(valorSolicitado < (saldoAtual + saldoChequeEspecial)){
                escreva("Saldo insuficiente! Deseja usar o cheque especial?")
                leia(opcao)
                se (opcao == "S"){
                    saldoAtual = 0.0
                    saldoChequeEspecial = (saldoAtual + saldoChequeEspecial) - valorSolicitado
                    escreva("Saque realizado com sucesso!")
                    }
            
            }senao{
                escreva("Saldo Insuficiente!")
            }
        
        }senao{
            saldoAtual = saldoAtual - valorSolicitado
            escreva("saque realizado com sucesso!")        
        }
          escreva("Seu saldo � ", saldoAtual, " Saldo cheque especial: ", saldoChequeEspecial)
        }
}