package br.com.timesheet.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by ramon on 04/06/16.
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer usuarioId;
    private String email;
    private String login;
    private String senha;
    private String nome;
    private LocalDateTime atualizado;
    private String atualizadopor;
    private LocalDateTime criado;
    private String criadopor;
    @OneToMany(mappedBy = "usuario")
    private List<HoraLancada> horasLancadas;

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(LocalDateTime atualizado) {
        this.atualizado = atualizado;
    }

    public String getAtualizadopor() {
        return atualizadopor;
    }

    public void setAtualizadopor(String atualizadopor) {
        this.atualizadopor = atualizadopor;
    }

    public LocalDateTime getCriado() {
        return criado;
    }

    public void setCriado(LocalDateTime criado) {
        this.criado = criado;
    }

    public String getCriadopor() {
        return criadopor;
    }

    public void setCriadopor(String criadopor) {
        this.criadopor = criadopor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (usuarioId != null ? !usuarioId.equals(usuario.usuarioId) : usuario.usuarioId != null) return false;
        if (email != null ? !email.equals(usuario.email) : usuario.email != null) return false;
        if (login != null ? !login.equals(usuario.login) : usuario.login != null) return false;
        if (senha != null ? !senha.equals(usuario.senha) : usuario.senha != null) return false;
        if (nome != null ? !nome.equals(usuario.nome) : usuario.nome != null) return false;
        if (atualizado != null ? !atualizado.equals(usuario.atualizado) : usuario.atualizado != null) return false;
        if (atualizadopor != null ? !atualizadopor.equals(usuario.atualizadopor) : usuario.atualizadopor != null)
            return false;
        if (criado != null ? !criado.equals(usuario.criado) : usuario.criado != null) return false;
        return !(criadopor != null ? !criadopor.equals(usuario.criadopor) : usuario.criadopor != null);

    }

    @Override
    public int hashCode() {
        int result = usuarioId != null ? usuarioId.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (senha != null ? senha.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (atualizado != null ? atualizado.hashCode() : 0);
        result = 31 * result + (atualizadopor != null ? atualizadopor.hashCode() : 0);
        result = 31 * result + (criado != null ? criado.hashCode() : 0);
        result = 31 * result + (criadopor != null ? criadopor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioId=" + usuarioId +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", atualizado=" + atualizado +
                ", atualizadopor='" + atualizadopor + '\'' +
                ", criado=" + criado +
                ", criadopor='" + criadopor + '\'' +
                '}';
    }

}
