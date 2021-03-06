package moe.leer.codeflowcore.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.jetbrains.annotations.NotNull;

/**
 * @author leer
 * Created at 12/7/19 4:27 PM
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ANTLRUtil {
  public static String getTextFromInputStream(int start, int stop, @NotNull CharStream input) {
    return input.getText(Interval.of(start, stop));
  }

  public static String getTextFromInputStream(@NotNull ParserRuleContext context) {
    return getTextFromInputStream(context.start.getStartIndex(), context.stop.getStopIndex(), context.start.getInputStream());
  }
}
