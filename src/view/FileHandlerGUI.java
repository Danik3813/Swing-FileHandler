package view;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;

import view.components.ControlPanel;
import view.components.DataTablePane;

public class FileHandlerGUI extends JFrame {
    private DataTablePane dataTablePane;
    private ControlPanel controlPanel;

    public FileHandlerGUI(String title, int width, int height) {
        super(title);
        this.setSize(width, height);
    }

    public DataTablePane getDataTablePane() {
        return dataTablePane;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void initializeGUI() {
        this.setLayout(new GridBagLayout());

        // Инициализация компонентов окна
        initializeDataTablePane();
        initializeControlPanel();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initializeDataTablePane() {
        // Инициализация менеджера расположения
        GridBagConstraints gridManager = new GridBagConstraints();
        gridManager.gridx = 0; gridManager.gridy = 0;
        gridManager.weightx = 1.0; gridManager.weighty = 0.8;
        gridManager.fill = GridBagConstraints.BOTH;

        dataTablePane = new DataTablePane();
        dataTablePane.initializeDataTablePane();

        this.add(dataTablePane, gridManager);
    }

    private void initializeControlPanel() {
        // Инициализация менеджера расположения
        GridBagConstraints gridManager = new GridBagConstraints();
        gridManager.gridx = 0; gridManager.gridy = 1;
        gridManager.weightx = 1.0; gridManager.weighty = 0.2;

        controlPanel = new ControlPanel(this);
        controlPanel.initializeControlPanel();

        this.add(controlPanel, gridManager);
    }
}
