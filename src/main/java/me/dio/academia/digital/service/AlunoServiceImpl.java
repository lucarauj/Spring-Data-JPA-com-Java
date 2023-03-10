package me.dio.academia.digital.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements InterfaceAlunoService {
	
	@Autowired
	AlunoRepository alunoRepository;

	@Override
	public Aluno create(AlunoForm form) {
		
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		
		return alunoRepository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		return alunoRepository.findById(id).get();
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {
		
		if(dataDeNascimento == null) {
			return alunoRepository.findAll();			
		} else {
			LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
			return alunoRepository.findByDataDeNascimento(localDate); 
		}
	}
	
	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
	
		Aluno aluno = alunoRepository.findById(id).get();
		
		return aluno.getAvaliacoes();
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		
		Aluno aluno = alunoRepository.findById(id).get();
		
		if (formUpdate.getNome() != null) {
			aluno.setNome(formUpdate.getNome());
		}
		
		if (formUpdate.getBairro() != null) {
			aluno.setBairro(formUpdate.getBairro());
		}
		
		if (formUpdate.getDataDeNascimento() != null) {
			aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());
		}
		
		return alunoRepository.save(aluno);
		
	}

	@Override
	public void delete(Long id) {
		alunoRepository.deleteById(id);		
	}	

}
