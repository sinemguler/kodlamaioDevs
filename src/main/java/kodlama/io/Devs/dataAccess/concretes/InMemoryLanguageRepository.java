package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>(); //boş bir liste vardır
        programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(3, "Python"));

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);

    }

    @Override
    public void delete(int id) {
        programmingLanguages.remove(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) {
        var item = getById(programmingLanguage.getId());
        item.setLanguageName(programmingLanguage.getLanguageName());

    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }
}
