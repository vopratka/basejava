import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    //Заполнение массива нулевыми значениями
    void clear() {
        Arrays.fill(storage, null);
    }

    void save(Resume r) {

    }

    //Копирование массива с идентификатором uuid
    Resume get(String uuid) {
        for (Resume resume : storage) {
            if (resume.uuid.equals(uuid)) {
                return resume;
            }
        }
        return null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    //Вывод копии всех элементов массива, пока не доработан
    Resume[] getAll() {
        return Arrays.copyOf(storage, storage.length);
    }

    int size() {
        return 0;
    }
}