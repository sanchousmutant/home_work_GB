import json
from datetime import datetime
import uuid


class Note:
    def __init__(self, id, title, text, created_at, updated_at):
        self.id = id
        self.title = title
        self.text = text
        self.created_at = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        self.updated_at = datetime.now().strftime("%Y-%m-%d %H:%M:%S")

    def to_dict(self):
        """
        Преобразует объект заметки в словарь для сохранения в JSON.
        """
        return {
            "id": self.id,
            "title": self.title,
            "text": self.text,
            "created_at": self.created_at,  # Преобразование даты/времени в строку ISO 8601
            "updated_at": self.updated_at}

    def create_note(): # создание

        title = input("Введите заголовок заметки: ")
        text = input("Введите текст заметки: ")

        return Note(id=str(uuid.uuid4()), title=title, text=text,
                    created_at=datetime.now().strftime("%Y-%m-%d %H:%M:%S"),
                    updated_at=datetime.now().strftime("%Y-%m-%d %H:%M:%S"))

    def save_notes_to_json(note):  #  сохранение в
        file_path = "note.json"
        notes_data = []
        try:
            with open(file_path, "r") as f:
                notes_data.append(*json.load(f))
                notes_data.append(note.to_dict())

                with open(file_path, "w") as f:
                    json.dump(notes_data, f, indent=4)
                print("---" * 10)
                print(f"Заметка '{note.title}' успешно добавлена.")
                print("---" * 10)
        except json.JSONDecodeError:
            notes_data.append(note.to_dict())

            with open(file_path, "w") as f:
                json.dump(notes_data, f, indent=4)
            print("---" * 10)
            print(f"Заметка '{note.title}' успешно добавлена.")
            print("---" * 10)

    def get_all_notes(): #  список
        file_path = "note.json"
        try:
            with open(file_path, "r") as f:
                notes_data = json.load(f)
            notes = [Note(**note_data) for note_data in notes_data]
            for note in notes:
                print("---" * 10)
                print(f"ID: {str(note.id)[:8]}")
                print(f"Заголовок: {note.title}")
                print(f"Текст: {note.text}")
                print(f"Дата создания: {note.created_at}")
                print(f"Дата обновления: {note.updated_at}")
            print("---" * 10)
        except json.JSONDecodeError:
            print("---" * 10)
            print(f"Файл '{file_path}' пустой или поврежден.")
            print("---" * 10)

    def read_note(note_id):  # чтение по id
        file_path = "note.json"
        try:
            with open("note.json", "r") as f:
                notes_data = json.load(f)
            notes = [Note(**note_data) for note_data in notes_data]

            for note in notes:
                if note.id == note_id:
                    print("---" * 10)
                    print(f"ID: {note.id[:8]}")
                    print(f"Заголовок: {note.title}")
                    print(f"Текст: {note.text}")
                    print(f"Дата создания: {note.created_at}")
                    print(f"Дата обновления: {note.updated_at}")

                    return
            print("---" * 10)
        except json.JSONDecodeError:
            print("---" * 10)
            print(f"Файл '{file_path}' пустой или поврежден.")
            print("---" * 10)

    def delete_note(note_id):  # удаление по id
        file_path = "note.json"
        try:
            with open("note.json", "r") as f:
                notes_data = json.load(f)
                for i, note_data in enumerate(notes_data):
                    if str(note_data["id"])[:8] == note_id:
                        del notes_data[i]
                        with open("note.json", "w") as f:
                            json.dump(notes_data, f, indent=4)
                        print("---" * 10)
                        print(f"Заметка с ID '{note_id}' успешно удалена.")
                        print("---" * 10)
                        break
                else:
                    print("---" * 10)
                    print(f"Не найдена заметка с ID '{note_id}'.")
                    print("---" * 10)

        except json.JSONDecodeError:
            print("---" * 10)
            print(f"Файл '{file_path}' пустой или поврежден.")
            print("---" * 10)

    def edit_note(note_id):  #  редактирование по id
        file_path = "note.json"
        try:
            with open("note.json", "r") as f:
                notes_data = json.load(f)
                for note_data in notes_data:
                    if str(note_data["id"])[:8] == note_id:
                        note_data["text"] = input("Введите новый текст заметки: ")
                        note_data["updated_at"] = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
                        with open("note.json", "w") as f:
                            json.dump(notes_data, f,  indent=4)
                        print("---" * 10)
                        print("Заметка успешно отредактирована!")
                        print("---" * 10)
                        break
                else:
                    print(f"Не найдена заметка с ID: {note_id}")
        except json.JSONDecodeError:
            print("---" * 10)
            print(f"Файл '{file_path}' пустой или поврежден.")
            print("---" * 10)
