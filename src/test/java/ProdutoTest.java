import org.br.lucaspjardim.dao.IProdutoDAO;
import org.br.lucaspjardim.dao.ProdutoDAO;
import org.br.lucaspjardim.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Author: Lucas Jardim
 */
public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A");
        produto.setNome("Camiste");
        produto.setPreco(50d);
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
