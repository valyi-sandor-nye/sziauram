package hu.nye.progtech.valyis.sziauram;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

public class Main {
    public static void main(String[] args) {
        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(120).height(20);
        builder.element(new PseudoText(new GreetingGenerator().generate()));
        ICanvas canvas = render.render(builder.build());
        System.out.println(canvas.getText());
    }
}
