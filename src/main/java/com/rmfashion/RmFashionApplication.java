package com.rmfashion;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rmfashion.domain.CategoriaFeminino;
import com.rmfashion.domain.CategoriaMasculino;
import com.rmfashion.domain.Cidade;
import com.rmfashion.domain.Cliente;
import com.rmfashion.domain.Endereco;
import com.rmfashion.domain.Estado;
import com.rmfashion.domain.Pagamento;
import com.rmfashion.domain.PagamentoComBoleto;
import com.rmfashion.domain.PagamentoComCartao;
import com.rmfashion.domain.Pedido;
import com.rmfashion.domain.ProdutoFeminino;
import com.rmfashion.domain.ProdutoMasculino;
import com.rmfashion.domain.enums.EstadoPagamento;
import com.rmfashion.domain.enums.TipoCliente;
import com.rmfashion.repositories.CategoriaFemininoRepository;
import com.rmfashion.repositories.CategoriaMasculinoRepository;
import com.rmfashion.repositories.CidadeRepository;
import com.rmfashion.repositories.ClienteRepository;
import com.rmfashion.repositories.EnderecoRepository;
import com.rmfashion.repositories.EstadoRepository;
import com.rmfashion.repositories.PagamentoRepository;
import com.rmfashion.repositories.PedidoRepository;
import com.rmfashion.repositories.ProdutoFemininoRepository;
import com.rmfashion.repositories.ProdutoMasculinoRepository;

@SpringBootApplication
public class RmFashionApplication implements CommandLineRunner {

	@Autowired
	private CategoriaFemininoRepository categoriaFemininoRepository;
	@Autowired
	private CategoriaMasculinoRepository categoriaMasculinoRepository;
	@Autowired
	private ProdutoFemininoRepository produtoFemininoRepository;
	@Autowired
	private ProdutoMasculinoRepository produtoMasculinoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RmFashionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Lista de categoria Feminino
		CategoriaFeminino catfem1 = new CategoriaFeminino(null, "Moda Íntima");
		CategoriaFeminino catfem2 = new CategoriaFeminino(null, "Moda Praia");
		CategoriaFeminino catfem3 = new CategoriaFeminino(null, "Saias");
		CategoriaFeminino catfem4 = new CategoriaFeminino(null, "Vestidos");
		CategoriaFeminino catfem5 = new CategoriaFeminino(null, "Blusas e Camisetas");
		CategoriaFeminino catfem6 = new CategoriaFeminino(null, "Calças");
		CategoriaFeminino catfem7 = new CategoriaFeminino(null, "Camisas");
		CategoriaFeminino catfem8 = new CategoriaFeminino(null, "Jeans");
		CategoriaFeminino catfem9 = new CategoriaFeminino(null, "Macações e Jardineiras");
		
		//Lista de Produtos femininos
		//Categoria Moda Íntima		
		ProdutoFeminino pf1 = new ProdutoFeminino(null, "Sutiã Tomara Que Caia em Cetim com Renda", "Preto", "44", 49.90);
		ProdutoFeminino pf2 = new ProdutoFeminino(null, "Calcinha String em Cetim com Cós Renda", "Preto", "M", 25.90);
		//Categoria Moda Praia
		ProdutoFeminino pf3 = new ProdutoFeminino(null, "Biquíni Top Cropped Texturizado Listrado com Detalhe Nó", "Vermelho", "M", 69.90);
		ProdutoFeminino pf4 = new ProdutoFeminino(null, "Biquíni Calcinha com Lateral Drapeada Texturizado Listrada", "Vermelho", "M", 59.90);		
		
		//Lista de Categoria Masculino
		CategoriaMasculino catmasc1 = new CategoriaMasculino(null, "Bermudas e Shorts");
		CategoriaMasculino catmasc2 = new CategoriaMasculino(null, "Calças");
		CategoriaMasculino catmasc3 = new CategoriaMasculino(null, "Camisas");
		CategoriaMasculino catmasc4 = new CategoriaMasculino(null, "Camisetas");
		CategoriaMasculino catmasc5 = new CategoriaMasculino(null, "Esportivo");
		CategoriaMasculino catmasc6 = new CategoriaMasculino(null, "Jeans");
		CategoriaMasculino catmasc7 = new CategoriaMasculino(null, "Moda Íntima");
		CategoriaMasculino catmasc8 = new CategoriaMasculino(null, "Moletons");
		CategoriaMasculino catmasc9 = new CategoriaMasculino(null, "Polos");
		CategoriaMasculino catmasc10 = new CategoriaMasculino(null, "Regatas");
		
		//Lista de produtos Masculino
		//Categoria Bermudas e Shorts
		ProdutoMasculino pm1 = new ProdutoMasculino(null, "Bermuda Esportiva Estampada", "Preto", "P", 49.90);
		ProdutoMasculino pm2 = new ProdutoMasculino(null, "Bermuda Cós Fixo Com Bolsos", "Azul", "M", 69.90);
		//Categoria Calças
		ProdutoMasculino pm3 = new ProdutoMasculino(null, "Calça Jogger Camuflada em Sarja", "Verde", "M", 119.90);
		ProdutoMasculino pm4 = new ProdutoMasculino(null, "Calça Skinny em Jeans", "Preto", "38", 99.90);
		
		
		catfem1.getProdutosFem().addAll(Arrays.asList(pf1, pf2));
		catfem2.getProdutosFem().addAll(Arrays.asList(pf3,pf4));
		
		pf1.getCategoriasFem().addAll(Arrays.asList(catfem1));
		pf2.getCategoriasFem().addAll(Arrays.asList(catfem1));
		pf3.getCategoriasFem().addAll(Arrays.asList(catfem2));
		pf4.getCategoriasFem().addAll(Arrays.asList(catfem2));
		
		catmasc1.getProdutosMasc().addAll(Arrays.asList(pm1, pm2));
		catmasc2.getProdutosMasc().addAll(Arrays.asList(pm3,pm4));
		
		pm1.getCategoriasMasc().addAll(Arrays.asList(catmasc1));
		pm2.getCategoriasMasc().addAll(Arrays.asList(catmasc1));
		pm3.getCategoriasMasc().addAll(Arrays.asList(catmasc2));
		pm4.getCategoriasMasc().addAll(Arrays.asList(catmasc2));
		
		//Estados
		Estado est1 = new Estado(null, "Ceará");
		Estado est2 = new Estado(null, " Rio Grande do Norte");
		Estado est3 = new Estado(null, "Paraíba");
		Estado est4 = new Estado(null, "Pernambuco");
		Estado est5 = new Estado(null, "Piauí");
		Estado est6 = new Estado(null, "São Paulo");
		
		//Cidades do Ceará
		Cidade c1 = new Cidade(null, "Fortaleza", est1);
		Cidade c2 = new Cidade(null, "Caucaia", est1);
		Cidade c3 = new Cidade(null, "Maracanaú", est1);
		Cidade c4 = new Cidade(null, "Maranguape", est1);
		Cidade c5 = new Cidade(null, "Pacatuba", est1);
		//Cidades do Rio Grande do Norte
		Cidade c6 = new Cidade(null, "Natal", est2);
		Cidade c7 = new Cidade(null, "Mossoró", est2);
		Cidade c8 = new Cidade(null, "Parnamirim", est2);
		//Cidades da Paraíba
		Cidade c9 = new Cidade(null, "João Pessoa", est3);
		Cidade c10 = new Cidade(null, "Campina Grande", est3);
		Cidade c11 = new Cidade(null, "Santa Rita", est3);
		//Cidades de Pernambuco
		Cidade c12 = new Cidade(null, "Recife", est4);
		Cidade c13 = new Cidade(null, "Jaboatão dos Guararapes", est4);
		Cidade c14 = new Cidade(null, "Olinda", est4);
		//Cidades do Piauí
		Cidade c15 = new Cidade(null, "Teresina", est5);
		Cidade c16 = new Cidade(null, "Parnaíba", est5);
		Cidade c17 = new Cidade(null, "Picos", est5);
		//Cidades de São Paulo
		Cidade c18 = new Cidade(null, "São Paulo", est6);
		Cidade c19 = new Cidade(null, "Guarulhos", est6);
		
		est1.getCidades().addAll(Arrays.asList(c1,c2,c3,c4,c5));
		est2.getCidades().addAll(Arrays.asList(c6,c7,c8));
		est3.getCidades().addAll(Arrays.asList(c9,c10,c11));
		est4.getCidades().addAll(Arrays.asList(c12,c13,c14));
		est5.getCidades().addAll(Arrays.asList(c15,c16,c17));
		est6.getCidades().addAll(Arrays.asList(c18,c19));
		
		// data de nascimeto
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		//Clientes
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377","342449771", data.parse("23/02/1988") , TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		Cliente cli2 = new Cliente(null, "Rafael Souza", "rafael-souza4@hotmail.com", "15401629079","312103372", data.parse("12/07/1999") , TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("958771254", "98554572"));
		Cliente cli3 = new Cliente(null, "Atacadista", "atacadista@gmail.com", "48490988000140",null, null , TipoCliente.PESSOAJURIDICA);
		cli3.getTelefones().addAll(Arrays.asList("958771254", "98554572"));
		
		//Endereços
		Endereco end1 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c18);
		Endereco end2 = new Endereco(null, "Rua Waldir Diogo", "384", null, "Manuel Sátiro", "60764020", cli2, c1);
		Endereco end3 = new Endereco(null, "Rua Gois", "182", "Altos", "Novo Pabussu", "61600320", cli3, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1));
		cli2.getEnderecos().addAll(Arrays.asList(end2));
		cli3.getEnderecos().addAll(Arrays.asList(end3));
		
		//Pedidos
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"),cli1, end1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"),cli2, end3);
		Pedido ped3 = new Pedido(null, sdf.parse("21/09/2019 10:35"),cli3, end2);
		
		//Pagamentos
		Pagamento pagt1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagt1);
		Pagamento pagt2 = new PagamentoComBoleto(null, EstadoPagamento.CANCELADO, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped2.setPagamento(pagt2);
		Pagamento pagt3 = new PagamentoComCartao(null, EstadoPagamento.PENDENTE, ped3, 3);
		ped3.setPagamento(pagt3);
		
		//Pedido Produto
		cli1.getPedidos().addAll(Arrays.asList(ped1));
		cli2.getPedidos().addAll(Arrays.asList(ped2));
		cli3.getPedidos().addAll(Arrays.asList(ped3));
		
		
		categoriaFemininoRepository.saveAll(Arrays.asList(catfem1, catfem2,catfem3,catfem4,catfem5,catfem6,catfem7,catfem8,catfem9));
		categoriaMasculinoRepository.saveAll(Arrays.asList(catmasc1, catmasc2,catmasc3,catmasc4,catmasc5,catmasc6,catmasc7,catmasc8,catmasc9,catmasc10));
		
		produtoFemininoRepository.saveAll(Arrays.asList(pf1,pf2,pf3,pf4));
		produtoMasculinoRepository.saveAll(Arrays.asList(pm1,pm2,pm3,pm4));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2,est3,est4,est5,est6));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19));
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2,cli3));
		enderecoRepository.saveAll(Arrays.asList(end1,end2,end3));
		
		pedidoRepository.saveAll(Arrays.asList(ped1,ped2,ped3));
		pagamentoRepository.saveAll(Arrays.asList(pagt1,pagt2,pagt3));
	}

}
