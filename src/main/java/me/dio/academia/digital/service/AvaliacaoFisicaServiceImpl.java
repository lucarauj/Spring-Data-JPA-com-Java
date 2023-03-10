package me.dio.academia.digital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;

@Service
public class AvaliacaoFisicaServiceImpl implements InterfaceAvaliacaoFisicaService {
	
	@Autowired
	AvaliacaoFisicaRepository avaliacaoFisicaRepository;
	
	@Autowired
	AlunoRepository alunoRepository;

	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacao = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		
		avaliacao.setAluno(aluno);
		avaliacao.setPeso(form.getPeso());
		avaliacao.setAltura(form.getAltura());

		return avaliacaoFisicaRepository.save(avaliacao);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		return avaliacaoFisicaRepository.findById(id).get();
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		return avaliacaoFisicaRepository.findAll();
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
		
		AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaRepository.findById(id).get();
		
		if (formUpdate.getPeso() > 0) {
			avaliacaoFisica.setPeso(formUpdate.getPeso());
		}
		
		if (formUpdate.getAltura() > 0) {
			avaliacaoFisica.setAltura(formUpdate.getAltura());
		}
		
		return avaliacaoFisicaRepository.save(avaliacaoFisica);
		
	}

	@Override
	public void delete(Long id) {
		avaliacaoFisicaRepository.deleteById(id);			
	}

}
