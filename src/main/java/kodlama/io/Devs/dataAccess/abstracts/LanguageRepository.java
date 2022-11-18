package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageRepository {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    void update(ProgrammingLanguage programmingLanguage, int id);

    ProgrammingLanguage getById(int id);
}
