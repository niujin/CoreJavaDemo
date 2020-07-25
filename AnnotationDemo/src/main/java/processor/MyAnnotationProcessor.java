package processor;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("creatannotation.CompileTimeAnnotation")
@SupportedSourceVersion( SourceVersion.RELEASE_8 )
@AutoService(Processor.class)
public class MyAnnotationProcessor extends AbstractProcessor{
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"ddd");
        return true;
    }
}
