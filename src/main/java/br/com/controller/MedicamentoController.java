package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Medicamento;
import br.com.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class MedicamentoController {

        @Autowired
        private MedicamentoService medicamentoService;

        @PostMapping(Constant.API_MEDICAMNETO)
        public void save(@RequestBody Medicamento medicamento) {
            medicamentoService.save(medicamento);
        }

        @GetMapping(Constant.API_MEDICAMNETO)
        public List<Medicamento> findAll() {
            return medicamentoService.findAll();
        }

        @PutMapping(Constant.API_MEDICAMNETO)
        public void update (@RequestBody Medicamento medicamento) {
            medicamentoService.save(medicamento);
        }

        @DeleteMapping(Constant.API_MEDICAMNETO + "/{id}")
        public void delete(@PathVariable("id") String id) {
            medicamentoService.delete(id);
        }

        @GetMapping(Constant.API_MEDICAMNETO + "/{id}")
        public Optional<Medicamento> findById(@PathVariable("id") String id) {
            return medicamentoService.findById(id);
        }
    }


