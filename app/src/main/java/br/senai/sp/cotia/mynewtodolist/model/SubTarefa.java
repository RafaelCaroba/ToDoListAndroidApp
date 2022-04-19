package br.senai.sp.cotia.mynewtodolist.model;

public class SubTarefa {
    private Long idSubTarefa;
    private String desc;
    private String foto;
    private boolean concluida;
    private Long idTarefa;

    public Long getIdSubTarefa() {
        return idSubTarefa;
    }

    public void setIdSubTarefa(Long idSubTarefa) {
        this.idSubTarefa = idSubTarefa;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Long getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Long idTarefa) {
        this.idTarefa = idTarefa;
    }
}

