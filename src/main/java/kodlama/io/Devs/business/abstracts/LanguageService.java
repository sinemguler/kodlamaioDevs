package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgrammingLanguage> getAll();

    public void add(ProgrammingLanguage programmingLanguage) throws Exception;

    public void delete(int id);

    public void update(ProgrammingLanguage programmingLanguage, int id);

    ProgrammingLanguage getById(int id);

}
