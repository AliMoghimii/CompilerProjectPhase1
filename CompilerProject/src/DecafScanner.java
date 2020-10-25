// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: Lexer.flex


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class DecafScanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int cb = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\2\0\1\1\22\0\1\2\3\0\1\3"+
    "\5\0\1\4\4\0\1\5\12\6\7\0\1\7\7\3"+
    "\1\10\2\3\1\11\1\3\1\12\1\3\1\13\1\3"+
    "\1\14\10\3\4\0\1\3\1\0\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\3\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\3\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\3\1\0"+
    "\1\1\u0183\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\2\1\20\3\2\0\2\2"+
    "\15\3\1\4\14\3\1\0\14\3\1\5\1\3\1\6"+
    "\1\3\1\7\14\3\1\10\1\3\1\11\3\3\1\12"+
    "\1\13\3\3\1\14\1\15\1\16\5\3\1\17\1\20"+
    "\2\3\1\21\2\3\1\22\1\23\12\3\1\24\4\3"+
    "\1\25\5\3\1\26\1\27\1\30\4\3\1\31\2\3"+
    "\1\32\1\3\1\33\1\3\1\34\1\35\5\3\1\36"+
    "\1\37\1\3\1\40\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\110\0\154\0\220\0\264\0\330"+
    "\0\374\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4\0\u01f8"+
    "\0\u021c\0\u0240\0\u0264\0\u0288\0\u02ac\0\u02d0\0\u02f4\0\220"+
    "\0\264\0\220\0\u0318\0\u033c\0\u0360\0\u0384\0\u03a8\0\u03cc"+
    "\0\u03f0\0\u0414\0\u0438\0\u045c\0\u0480\0\u04a4\0\u04c8\0\u04ec"+
    "\0\154\0\u0510\0\u0534\0\u0558\0\u057c\0\u05a0\0\u05c4\0\u05e8"+
    "\0\u060c\0\u0630\0\u0654\0\u0678\0\u069c\0\u0318\0\u06c0\0\u06e4"+
    "\0\u0708\0\u072c\0\u0750\0\u0774\0\u0798\0\u07bc\0\u07e0\0\u0804"+
    "\0\u0828\0\u084c\0\154\0\u0870\0\u0894\0\u08b8\0\154\0\u08dc"+
    "\0\u0900\0\u0924\0\u0948\0\u096c\0\u0990\0\u09b4\0\u09d8\0\u09fc"+
    "\0\u0a20\0\u0a44\0\u0a68\0\154\0\u0a8c\0\154\0\u0ab0\0\u0ad4"+
    "\0\u0af8\0\154\0\154\0\u0b1c\0\u0b40\0\u0b64\0\154\0\154"+
    "\0\154\0\u0b88\0\u0bac\0\u0bd0\0\u0bf4\0\u0c18\0\154\0\154"+
    "\0\u0c3c\0\u0c60\0\154\0\u0c84\0\u0ca8\0\154\0\154\0\u0ccc"+
    "\0\u0cf0\0\u0d14\0\u0d38\0\u0d5c\0\u0d80\0\u0da4\0\u0dc8\0\u0dec"+
    "\0\u0e10\0\154\0\u0e34\0\u0e58\0\u0e7c\0\u0ea0\0\154\0\u0ec4"+
    "\0\u0ee8\0\u0f0c\0\u0f30\0\u0f54\0\154\0\154\0\154\0\u0f78"+
    "\0\u0f9c\0\u0fc0\0\u0fe4\0\154\0\u1008\0\u102c\0\154\0\u1050"+
    "\0\154\0\u1074\0\154\0\154\0\u1098\0\u10bc\0\u10e0\0\u1104"+
    "\0\u1128\0\154\0\154\0\u114c\0\154\0\154";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\7\1\3\3\5\1\10"+
    "\1\11\1\12\1\5\1\13\1\14\1\15\1\16\1\17"+
    "\2\5\1\20\3\5\1\21\1\5\1\22\1\23\1\24"+
    "\1\25\1\5\1\26\1\27\2\5\44\3\47\0\1\5"+
    "\2\0\36\5\4\30\2\4\36\30\1\31\1\32\2\31"+
    "\2\33\36\31\3\0\1\5\2\0\13\5\1\34\22\5"+
    "\3\0\1\5\2\0\26\5\1\35\7\5\3\0\1\5"+
    "\2\0\13\5\1\36\22\5\3\0\1\5\2\0\24\5"+
    "\1\37\1\5\1\40\1\5\1\41\5\5\3\0\1\5"+
    "\2\0\21\5\1\42\2\5\1\43\11\5\3\0\1\5"+
    "\2\0\24\5\1\44\3\5\1\45\5\5\3\0\1\5"+
    "\2\0\21\5\1\46\12\5\1\47\1\5\3\0\1\5"+
    "\2\0\24\5\1\50\11\5\3\0\1\5\2\0\14\5"+
    "\1\51\5\5\1\52\1\53\4\5\1\54\5\5\3\0"+
    "\1\5\2\0\13\5\1\55\15\5\1\56\4\5\3\0"+
    "\1\5\2\0\26\5\1\57\2\5\1\60\4\5\3\0"+
    "\1\5\2\0\13\5\1\61\22\5\3\0\1\5\2\0"+
    "\30\5\1\62\5\5\3\0\1\5\2\0\16\5\1\63"+
    "\17\5\3\0\1\5\2\0\24\5\1\64\11\5\3\0"+
    "\1\5\2\0\16\5\1\65\17\5\1\66\1\4\42\66"+
    "\3\0\1\5\2\0\33\5\1\67\2\5\3\0\1\5"+
    "\2\0\17\5\1\70\16\5\3\0\1\5\2\0\7\5"+
    "\1\71\26\5\3\0\1\5\2\0\24\5\1\72\11\5"+
    "\3\0\1\5\2\0\13\5\1\73\22\5\3\0\1\5"+
    "\2\0\24\5\1\74\11\5\3\0\1\5\2\0\7\5"+
    "\1\75\26\5\3\0\1\5\2\0\23\5\1\76\12\5"+
    "\3\0\1\5\2\0\31\5\1\77\4\5\3\0\1\5"+
    "\2\0\24\5\1\100\11\5\3\0\1\5\2\0\27\5"+
    "\1\101\6\5\3\0\1\5\2\0\30\5\1\102\5\5"+
    "\3\0\1\5\2\0\26\5\1\103\7\5\3\0\1\5"+
    "\2\0\25\5\1\104\10\5\3\0\1\5\2\0\30\5"+
    "\1\105\5\5\3\0\1\5\2\0\24\5\1\106\11\5"+
    "\3\0\1\5\2\0\33\5\1\107\2\5\3\0\1\5"+
    "\2\0\21\5\1\110\14\5\3\0\1\5\2\0\17\5"+
    "\1\111\4\5\1\112\11\5\3\0\1\5\2\0\10\5"+
    "\1\113\25\5\3\0\1\5\2\0\30\5\1\114\5\5"+
    "\3\0\1\5\2\0\26\5\1\115\7\5\3\0\1\5"+
    "\2\0\17\5\1\116\16\5\3\0\1\5\2\0\17\5"+
    "\1\117\16\5\3\0\1\5\2\0\17\5\1\120\16\5"+
    "\3\0\1\5\2\0\1\5\1\121\34\5\3\0\1\5"+
    "\2\0\23\5\1\122\12\5\3\0\1\5\2\0\12\5"+
    "\1\123\23\5\3\0\1\5\2\0\21\5\1\124\14\5"+
    "\3\0\1\5\2\0\7\5\1\125\26\5\3\0\1\5"+
    "\2\0\17\5\1\126\16\5\3\0\1\5\2\0\27\5"+
    "\1\127\6\5\3\0\1\5\2\0\30\5\1\130\5\5"+
    "\3\0\1\5\2\0\10\5\1\131\25\5\3\0\1\5"+
    "\2\0\17\5\1\132\16\5\3\0\1\5\2\0\13\5"+
    "\1\133\22\5\3\0\1\5\2\0\13\5\1\134\22\5"+
    "\3\0\1\5\2\0\21\5\1\135\14\5\3\0\1\5"+
    "\2\0\13\5\1\136\22\5\3\0\1\5\2\0\10\5"+
    "\1\137\1\5\1\140\23\5\3\0\1\5\2\0\21\5"+
    "\1\141\14\5\3\0\1\5\2\0\32\5\1\142\3\5"+
    "\3\0\1\5\2\0\30\5\1\143\5\5\3\0\1\5"+
    "\2\0\21\5\1\144\14\5\3\0\1\5\2\0\31\5"+
    "\1\145\4\5\3\0\1\5\2\0\17\5\1\146\16\5"+
    "\3\0\1\5\2\0\27\5\1\147\6\5\3\0\1\5"+
    "\2\0\12\5\1\150\23\5\3\0\1\5\2\0\21\5"+
    "\1\151\14\5\3\0\1\5\2\0\26\5\1\152\7\5"+
    "\3\0\1\5\2\0\30\5\1\153\5\5\3\0\1\5"+
    "\2\0\2\5\1\154\1\155\32\5\3\0\1\5\2\0"+
    "\20\5\1\156\15\5\3\0\1\5\2\0\27\5\1\157"+
    "\6\5\3\0\1\5\2\0\17\5\1\160\16\5\3\0"+
    "\1\5\2\0\21\5\1\161\14\5\3\0\1\5\2\0"+
    "\23\5\1\162\12\5\3\0\1\5\2\0\13\5\1\163"+
    "\22\5\3\0\1\5\2\0\26\5\1\164\7\5\3\0"+
    "\1\5\2\0\7\5\1\165\26\5\3\0\1\5\2\0"+
    "\13\5\1\166\22\5\3\0\1\5\2\0\17\5\1\167"+
    "\16\5\3\0\1\5\2\0\26\5\1\170\7\5\3\0"+
    "\1\5\2\0\23\5\1\171\12\5\3\0\1\5\2\0"+
    "\13\5\1\172\22\5\3\0\1\5\2\0\26\5\1\173"+
    "\7\5\3\0\1\5\2\0\23\5\1\174\12\5\3\0"+
    "\1\5\2\0\17\5\1\175\16\5\3\0\1\5\2\0"+
    "\23\5\1\176\12\5\3\0\1\5\2\0\13\5\1\177"+
    "\22\5\3\0\1\5\2\0\12\5\1\200\23\5\3\0"+
    "\1\5\2\0\22\5\1\201\13\5\3\0\1\5\2\0"+
    "\14\5\1\202\21\5\3\0\1\5\2\0\30\5\1\203"+
    "\5\5\3\0\1\5\2\0\11\5\1\204\24\5\3\0"+
    "\1\5\2\0\11\5\1\205\24\5\3\0\1\5\2\0"+
    "\23\5\1\206\12\5\3\0\1\5\2\0\15\5\1\207"+
    "\20\5\3\0\1\5\2\0\7\5\1\210\26\5\3\0"+
    "\1\5\2\0\30\5\1\211\5\5\3\0\1\5\2\0"+
    "\23\5\1\212\12\5\3\0\1\5\2\0\31\5\1\213"+
    "\4\5\3\0\1\5\2\0\27\5\1\214\6\5\3\0"+
    "\1\5\2\0\13\5\1\215\22\5\3\0\1\5\2\0"+
    "\7\5\1\216\26\5\3\0\1\5\2\0\13\5\1\217"+
    "\22\5\3\0\1\5\2\0\30\5\1\220\5\5\3\0"+
    "\1\5\2\0\35\5\1\221\3\0\1\5\2\0\13\5"+
    "\1\222\22\5\3\0\1\5\2\0\13\5\1\223\22\5"+
    "\3\0\1\5\2\0\13\5\1\224\22\5\3\0\1\5"+
    "\2\0\23\5\1\225\12\5\3\0\1\5\2\0\11\5"+
    "\1\226\24\5\3\0\1\5\2\0\13\5\1\227\22\5"+
    "\3\0\1\5\2\0\15\5\1\230\20\5\3\0\1\5"+
    "\2\0\30\5\1\231\5\5\3\0\1\5\2\0\13\5"+
    "\1\232\22\5\3\0\1\5\2\0\12\5\1\233\23\5"+
    "\3\0\1\5\2\0\13\5\1\234\22\5\3\0\1\5"+
    "\2\0\27\5\1\235\6\5\3\0\1\5\2\0\26\5"+
    "\1\236\7\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4464];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\23\1\2\0\34\1\1\0\150\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    String name;
    int len;
    StringBuilder commentvalue = new StringBuilder();


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public DecafScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.print(yytext());
            }
            // fall through
          case 34: break;
          case 2:
            { /* no operation*/
            }
            // fall through
          case 35: break;
          case 3:
            { OutputHandler.handle(yytext(),Token.T_ID);
            }
            // fall through
          case 36: break;
          case 4:
            { OutputHandler.handle(Token.T_if);
            }
            // fall through
          case 37: break;
          case 5:
            { OutputHandler.handle(Token.T_for);
            }
            // fall through
          case 38: break;
          case 6:
            { OutputHandler.handle(Token.T_int);
            }
            // fall through
          case 39: break;
          case 7:
            { OutputHandler.handle(Token.T_new);
            }
            // fall through
          case 40: break;
          case 8:
            { OutputHandler.handle(Token.T_bool);
            }
            // fall through
          case 41: break;
          case 9:
            { OutputHandler.handle(Token.T_btoi);
            }
            // fall through
          case 42: break;
          case 10:
            { OutputHandler.handle(Token.T_dtoi);
            }
            // fall through
          case 43: break;
          case 11:
            { OutputHandler.handle(Token.T_else);
            }
            // fall through
          case 44: break;
          case 12:
            { OutputHandler.handle(Token.T_itob);
            }
            // fall through
          case 45: break;
          case 13:
            { OutputHandler.handle(Token.T_itod);
            }
            // fall through
          case 46: break;
          case 14:
            { OutputHandler.handle(Token.T_null);
            }
            // fall through
          case 47: break;
          case 15:
            { OutputHandler.handle(Token.T_this);
            }
            // fall through
          case 48: break;
          case 16:
            { OutputHandler.handle(Token.T_void);
            }
            // fall through
          case 49: break;
          case 17:
            { OutputHandler.handle(Token.T_Print);
            }
            // fall through
          case 50: break;
          case 18:
            { OutputHandler.handle(Token.T_break);
            }
            // fall through
          case 51: break;
          case 19:
            { OutputHandler.handle(Token.T_class);
            }
            // fall through
          case 52: break;
          case 20:
            { OutputHandler.handle(Token.T_while);
            }
            // fall through
          case 53: break;
          case 21:
            { OutputHandler.handle(Token.T_double);
            }
            // fall through
          case 54: break;
          case 22:
            { OutputHandler.handle(Token.T_public);
            }
            // fall through
          case 55: break;
          case 23:
            { OutputHandler.handle(Token.T_return);
            }
            // fall through
          case 56: break;
          case 24:
            { OutputHandler.handle(Token.T_string);
            }
            // fall through
          case 57: break;
          case 25:
            { OutputHandler.handle(Token.T_extends);
            }
            // fall through
          case 58: break;
          case 26:
            { OutputHandler.handle(Token.T_private);
            }
            // fall through
          case 59: break;
          case 27:
            { OutputHandler.handle(Token.T_NewArray);
            }
            // fall through
          case 60: break;
          case 28:
            { OutputHandler.handle(Token.T_ReadLine);
            }
            // fall through
          case 61: break;
          case 29:
            { OutputHandler.handle(Token.T_continue);
            }
            // fall through
          case 62: break;
          case 30:
            { OutputHandler.handle(Token.T_interface);
            }
            // fall through
          case 63: break;
          case 31:
            { OutputHandler.handle(Token.T_protected);
            }
            // fall through
          case 64: break;
          case 32:
            { OutputHandler.handle(Token.T_implements);
            }
            // fall through
          case 65: break;
          case 33:
            { OutputHandler.handle(Token.T_ReadInteger);
            }
            // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java DecafScanner [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        DecafScanner scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new DecafScanner(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
