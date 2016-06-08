package br.com.timesheet.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by ramon on 04/06/16.
 */
@Entity
public class HoraLancada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer horaLancadaId;
    private LocalDateTime data;
    @ManyToOne
    private Usuario usuario;
    private LocalTime horaFinal;
    private LocalTime horaInicial;
    private LocalDateTime atualizado;
    private String atualizadoPor;
    private LocalDateTime criado;
    private String criadoPor;

    public Integer getHoraLancadaId() {
        return horaLancadaId;
    }

    public void setHoraLancadaId(Integer horaLancadaId) {
        this.horaLancadaId = horaLancadaId;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(LocalTime horaInicial) {
        this.horaInicial = horaInicial;
    }

    public LocalDateTime getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(LocalDateTime atualizado) {
        this.atualizado = atualizado;
    }

    public String getAtualizadoPor() {
        return atualizadoPor;
    }

    public void setAtualizadoPor(String atualizadoPor) {
        this.atualizadoPor = atualizadoPor;
    }

    public LocalDateTime getCriado() {
        return criado;
    }

    public void setCriado(LocalDateTime criado) {
        this.criado = criado;
    }

    public String getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }

    @Override
    public String toString() {
        return "HoraLancada{" +
                "horaLancadaId=" + horaLancadaId +
                ", data=" + data +
                ", usuario=" + usuario +
                ", horaFinal=" + horaFinal +
                ", horaInicial=" + horaInicial +
                ", atualizado=" + atualizado +
                ", atualizadoPor='" + atualizadoPor + '\'' +
                ", criado=" + criado +
                ", criadoPor='" + criadoPor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoraLancada that = (HoraLancada) o;

        if (horaLancadaId != null ? !horaLancadaId.equals(that.horaLancadaId) : that.horaLancadaId != null)
            return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (usuario != null ? !usuario.equals(that.usuario) : that.usuario != null) return false;
        if (horaFinal != null ? !horaFinal.equals(that.horaFinal) : that.horaFinal != null) return false;
        if (horaInicial != null ? !horaInicial.equals(that.horaInicial) : that.horaInicial != null) return false;
        if (atualizado != null ? !atualizado.equals(that.atualizado) : that.atualizado != null) return false;
        if (atualizadoPor != null ? !atualizadoPor.equals(that.atualizadoPor) : that.atualizadoPor != null)
            return false;
        if (criado != null ? !criado.equals(that.criado) : that.criado != null) return false;
        return !(criadoPor != null ? !criadoPor.equals(that.criadoPor) : that.criadoPor != null);

    }

    @Override
    public int hashCode() {
        int result = horaLancadaId != null ? horaLancadaId.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        result = 31 * result + (horaFinal != null ? horaFinal.hashCode() : 0);
        result = 31 * result + (horaInicial != null ? horaInicial.hashCode() : 0);
        result = 31 * result + (atualizado != null ? atualizado.hashCode() : 0);
        result = 31 * result + (atualizadoPor != null ? atualizadoPor.hashCode() : 0);
        result = 31 * result + (criado != null ? criado.hashCode() : 0);
        result = 31 * result + (criadoPor != null ? criadoPor.hashCode() : 0);
        return result;
    }


}
