    package view;

    import java.awt.GridBagLayout;
    import java.awt.GridLayout;
    import java.awt.GridBagConstraints;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JTable;


    public class FileHandlerGUI extends JFrame {
        public FileHandlerGUI(String title) {
            super(title);
        }

        public void initializeGUI(int width, int height) {
            setSize(width, height);
            this.setLayout(new GridBagLayout());

            // Инициализация компонентов окна
            initializeControlPanel();
            initializeDataTable();
            initializeInputPanel();
            initializeFeaturesPanel();

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        private void initializeControlPanel() {
            // Инициализация менеджера расположения
            GridBagConstraints gridManager = new GridBagConstraints();
            gridManager.gridx = 0; gridManager.gridy = 0;
            gridManager.weightx = 1.0; gridManager.weighty = 0.1;

            JButton books = new JButton("Книги");
            JButton persons = new JButton("Читатели");
            JButton records = new JButton("Учёт");

            JPanel controlPanel = new JPanel(new GridLayout(1, 3, 5, 0));
            controlPanel.add(books);
            controlPanel.add(persons);
            controlPanel.add(records);

            this.add(controlPanel, gridManager);
        }

        private void initializeDataTable() {
            // Инициализация менеджера расположения
            GridBagConstraints gridManager = new GridBagConstraints();
            gridManager.gridx = 0; gridManager.gridy = 1;
            gridManager.weightx = 1.0; gridManager.weighty = 0.5;

            JTable bookTable = new JTable(new CSVTableModel(new String[]{"ID", "Автор", "Название", "Год написания", "Число в каталоге"}));
            this.add(bookTable, gridManager);
        }

        private void initializeInputPanel() {

        }

        private void initializeFeaturesPanel() {

        }
    }
