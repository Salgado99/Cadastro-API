package dev._x.Cadastro.Missoes;

import dev._x.Cadastro.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    private String dificuldade;
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}


