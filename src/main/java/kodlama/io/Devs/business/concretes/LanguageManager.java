package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {

        return languageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (programmingLanguage.getLanguageName().isEmpty()) {
            throw new Exception("Programlama dili boş bırakılamaz");
        }
        for (ProgrammingLanguage languages : getAll()) {
            if (languages.getLanguageName() == programmingLanguage.getLanguageName()) {
                throw new Exception("Programlama dili tekrar edemez");
            }
        }
        languageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) {
        languageRepository.update(programmingLanguage, id);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return languageRepository.getById(id);
    }
}
