package view;

public enum TableHeaders {
    BOOKS_HEADER(new String[] {
        "ID",
        "Автор",
        "Название",
        "Год написания",
        "Число на складе"
    }),
    PERSONS_HEADER(new String[] {
        "ID",
        "Имя",
        "Фамилия",
        "Отчество",
    }),
    ENTRIES_HEADER(new String[] {
        "ID",
        "ID книги",
        "ID читателя",
        "Дата выдачи",
        "Дата сдачи",
        "Дата факт. возврата"
    });

    private String[] headers;

    private TableHeaders(String[] headers)  {
        this.headers = headers;
    }

    public String[] getHeaders() {
        return headers;
    }
}
