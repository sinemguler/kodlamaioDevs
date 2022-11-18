package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")

public class LanguageControllers {
    private LanguageService languageService;

    @Autowired
    public LanguageControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        languageService.add(programmingLanguage);
    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        languageService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ProgrammingLanguage programmingLanguage, int id) {
        languageService.update(programmingLanguage, id);
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getById(@PathVariable() int id) {
        return languageService.getById(id);
    }

}
