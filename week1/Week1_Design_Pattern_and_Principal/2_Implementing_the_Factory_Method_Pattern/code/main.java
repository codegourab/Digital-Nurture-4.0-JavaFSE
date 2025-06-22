public class main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocFactory();
        Document doc1 = wordFactory.createDoc();
        doc1.open();

        DocumentFactory pdfFactory = new PdfDocFactory();
        Document doc2 = pdfFactory.createDoc();
        doc2.open();

        DocumentFactory excelFactory = new ExcelDocFactory();
        Document doc3 = excelFactory.createDoc();
        doc3.open();
    }
}

interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Word doc is opened");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF doc is opened");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Excel doc is opened");
    }
}

abstract class DocumentFactory {
    abstract Document createDoc();
}

class WordDocFactory extends DocumentFactory {
    Document createDoc() {
        return new WordDocument();
    }
}

class PdfDocFactory extends DocumentFactory {
    Document createDoc() {
        return new PdfDocument();
    }
}

class ExcelDocFactory extends DocumentFactory {
    Document createDoc() {
        return new ExcelDocument();
    }
}
