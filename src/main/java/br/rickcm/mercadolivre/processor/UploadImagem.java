package br.rickcm.mercadolivre.processor;

import br.rickcm.mercadolivre.model.ImagemProduto;
import br.rickcm.mercadolivre.model.Produto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UploadImagem {
    List<ImagemProduto> envia(List<MultipartFile> imagens, Produto produto);
}
