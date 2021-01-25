package org.panache;

import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;


@Path("/pessoas")
@Transactional
public class PessoaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> buscarPessoas() {
        return Pessoa.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPessoa(@RequestBody IncluirPessoaDTO dto) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(dto.getId());
        pessoa.setNome(dto.getNome());
        pessoa.setTipo(dto.getTipo());
        pessoa.persist();
    }

}
