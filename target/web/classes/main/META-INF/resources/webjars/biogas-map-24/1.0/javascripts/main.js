demo = {

    //Mensagem que aparece ao clickar no botao finalizar
    showSwal: function(type) {

        if (type == 'success-message') {
            swal({
                title: "Obrigado",
                text: "Simulador de Geração de Biogás",
                buttonsStyling: false,
                confirmButtonClass: "btn btn-lg btn-success btn-fill",
                type: "success"
            });

        }
    }

}