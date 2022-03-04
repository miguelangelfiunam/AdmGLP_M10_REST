package mx.unam.diplomado.xml;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import mx.unam.diplomado.pojo.UsuarioPojo;

public class XMLCreatorData {
        
        public static String createBasicXML(UsuarioPojo usuarioPojo) {
		Document document = new Document();
		Element root = new Element("usuario");
		document.setRootElement(root);
		root.setAttribute("required", "true");
		
                Element id = new Element("id");
		id.setText(String.valueOf(usuarioPojo.getIdusuario()));
		root.addContent(id);

		Element nombre = new Element("nombre");
		nombre.setText(usuarioPojo.getNombre());
		root.addContent(nombre);

		XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
		String xmlString = outputter.outputString(document);
		return xmlString;
	}

}
