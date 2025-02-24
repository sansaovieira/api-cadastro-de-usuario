package com.neusa.cadastro_de_usuarios.entity;

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class UsuarioLogin {
        
        private Long id;
        private String nome;
        private String email;
        private String senha;
        private String foto;
        private String token;
    }
    