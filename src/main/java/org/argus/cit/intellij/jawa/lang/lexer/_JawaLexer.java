/*
 * Copyright (c) 2016. Fengguo (Hugo) Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.argus.cit.intellij.jawa.lang.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.argus.cit.intellij.jawa.lang.psi.JawaElementTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_JawaLexer.flex</tt>
 */
public class _JawaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 16672 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\1\21\1\22\3\21\1\23\1\24\1\25\1\21\14\26\1\27\50\26\1\30\2\26\1\31\1\32"+
    "\1\33\1\34\25\26\1\35\20\21\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1"+
    "\47\1\50\1\21\1\51\1\52\1\53\1\54\1\55\1\56\2\21\1\26\1\57\1\60\5\21\2\26"+
    "\1\61\7\21\1\26\1\62\20\21\1\26\1\63\1\21\1\64\40\21\1\65\5\21\1\66\11\21"+
    "\1\67\1\70\1\71\1\72\1\21\1\73\6\21\1\74\2\21\1\75\1\76\7\21\123\26\1\77\7"+
    "\26\1\100\1\101\12\26\1\102\24\21\1\26\1\103\u0582\21\1\104\u017f\21");

  /* The ZZ_CMAP_Y table has 4416 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14\1\15\4\0\1\16"+
    "\1\17\1\16\2\7\1\20\3\7\1\20\71\7\1\21\1\7\1\22\1\0\1\23\1\24\2\0\16\25\1"+
    "\26\1\27\1\30\1\31\2\7\1\32\11\7\1\33\21\7\1\34\1\35\24\7\1\36\3\7\1\20\1"+
    "\37\1\36\4\7\1\0\1\40\4\25\1\41\1\42\1\0\3\7\2\43\3\0\1\25\1\44\5\7\1\45\3"+
    "\25\1\46\1\47\13\7\1\50\1\51\1\52\1\53\1\25\1\54\2\0\1\55\3\7\3\25\1\56\12"+
    "\7\1\57\1\25\1\60\1\0\1\25\1\35\3\7\1\45\1\61\1\16\2\7\1\57\1\62\1\63\1\64"+
    "\2\0\3\7\1\65\10\0\2\7\1\23\5\0\1\66\3\25\1\67\6\7\1\70\2\25\1\71\1\7\1\72"+
    "\1\25\1\36\1\7\1\73\1\74\1\75\2\7\1\76\1\77\1\100\1\51\1\101\1\102\1\103\1"+
    "\72\1\25\1\22\1\0\1\104\1\105\1\75\2\7\1\76\1\106\1\107\1\110\1\111\1\112"+
    "\1\113\1\114\1\25\1\115\1\0\1\104\1\33\1\32\2\7\1\76\1\116\1\100\1\41\1\117"+
    "\1\120\1\0\1\72\1\25\1\0\1\37\1\104\1\74\1\75\2\7\1\76\1\116\1\100\1\51\1"+
    "\111\1\114\1\103\1\72\1\25\1\37\1\0\1\121\1\122\1\123\1\124\1\125\1\122\1"+
    "\7\1\126\1\127\1\130\1\131\1\0\1\114\1\25\2\0\1\132\1\26\1\76\2\7\1\76\1\7"+
    "\1\133\1\134\1\130\1\135\1\43\1\72\1\25\2\0\1\104\1\26\1\76\2\7\1\76\1\136"+
    "\1\100\1\134\1\130\1\135\1\30\1\72\1\25\1\137\1\0\1\104\1\26\1\76\4\7\1\140"+
    "\1\134\1\141\1\102\1\142\1\72\1\25\1\0\1\143\1\144\1\7\1\20\1\143\2\7\1\32"+
    "\1\145\1\20\1\146\1\147\1\25\1\114\1\25\1\150\1\0\1\36\5\7\1\151\1\44\1\152"+
    "\1\153\1\25\1\154\4\0\1\155\1\156\1\157\1\36\1\160\1\161\1\151\1\162\1\163"+
    "\1\164\1\25\1\165\4\0\1\120\2\0\1\154\1\25\1\154\1\166\1\167\1\7\1\36\3\7"+
    "\1\23\1\40\1\25\1\134\1\170\1\25\1\40\3\25\1\171\1\172\7\0\5\7\1\45\1\25\1"+
    "\173\1\25\1\154\1\57\1\174\1\175\1\176\1\177\1\7\1\200\1\201\1\25\1\164\4"+
    "\7\1\33\1\17\5\7\1\202\51\7\1\123\1\20\1\123\5\7\1\123\4\7\1\123\1\20\1\123"+
    "\1\7\1\20\7\7\1\123\10\7\1\203\4\0\2\7\2\0\12\7\2\204\1\36\114\7\1\74\2\7"+
    "\1\36\2\7\1\43\11\7\1\205\1\47\1\120\1\7\1\26\1\206\1\0\2\7\1\206\1\0\2\7"+
    "\1\207\1\0\1\7\1\26\1\210\1\0\6\7\1\211\3\25\1\212\1\213\1\25\1\154\3\0\1"+
    "\214\1\25\1\154\13\7\1\0\5\7\1\215\10\7\1\204\1\0\3\7\1\20\1\25\1\216\1\25"+
    "\1\216\1\114\1\25\3\7\1\204\1\23\1\0\5\7\1\217\3\7\1\22\1\25\1\154\4\0\2\7"+
    "\1\152\1\216\6\7\1\170\1\153\3\25\1\51\1\25\1\154\1\25\1\154\1\142\1\0\1\25"+
    "\1\153\10\0\1\220\5\7\1\211\1\25\1\220\1\217\1\25\1\154\1\0\1\66\1\216\1\0"+
    "\1\221\3\7\1\71\1\176\1\25\1\35\4\7\1\57\1\25\1\216\1\0\4\7\1\211\2\25\1\0"+
    "\1\25\1\222\1\25\1\35\3\7\1\204\12\0\1\223\2\25\1\224\1\225\1\154\30\7\6\25"+
    "\1\164\1\226\42\7\2\204\4\7\2\204\1\7\1\227\3\7\1\204\6\7\1\26\1\163\1\230"+
    "\1\23\1\231\1\217\1\7\1\23\1\230\1\23\5\0\1\232\1\0\1\102\1\233\1\0\1\234"+
    "\3\0\1\37\1\142\2\0\1\7\1\23\6\0\4\25\1\233\1\0\1\235\1\143\1\145\1\236\1"+
    "\24\1\237\1\7\1\240\1\241\1\242\2\0\4\25\1\243\1\233\144\0\1\114\6\25\1\154"+
    "\42\0\5\7\1\20\5\7\1\20\20\7\1\23\1\244\1\245\1\0\4\7\1\33\1\17\7\7\1\142"+
    "\1\0\1\102\2\7\1\20\1\0\10\20\4\25\5\0\1\142\72\0\1\246\3\0\1\40\1\25\1\236"+
    "\1\247\1\36\11\7\1\20\1\250\1\36\12\7\1\202\1\241\4\7\1\204\1\36\12\7\1\20"+
    "\2\0\3\7\1\43\6\0\170\7\1\204\11\0\72\7\1\204\5\0\21\7\1\23\10\0\5\7\1\204"+
    "\41\7\1\23\2\7\1\25\1\245\2\0\5\7\1\152\1\223\1\251\3\7\1\57\10\7\1\57\1\25"+
    "\1\154\3\0\1\142\1\7\1\143\14\7\1\75\3\7\1\204\1\7\7\0\1\142\1\7\1\252\1\253"+
    "\2\7\1\45\3\0\6\7\1\217\1\0\1\35\5\7\1\211\1\25\1\171\1\0\1\25\1\154\2\25"+
    "\1\35\1\254\1\25\1\35\2\7\1\57\1\164\2\7\1\152\1\25\1\216\1\0\3\7\1\23\1\67"+
    "\5\7\1\45\1\25\1\233\1\142\1\25\1\154\1\255\1\7\1\25\1\256\5\7\1\71\1\153"+
    "\1\0\1\253\1\257\1\25\1\154\2\7\1\20\1\260\6\7\1\175\1\261\1\215\2\0\1\262"+
    "\1\7\1\45\1\263\1\0\3\264\1\0\2\20\5\7\1\202\1\204\1\0\16\7\1\45\1\265\1\25"+
    "\1\154\64\7\1\217\1\0\2\7\1\20\1\266\5\7\1\217\40\0\55\7\1\204\15\7\1\22\4"+
    "\0\1\20\1\0\1\266\1\267\1\7\1\76\1\20\1\163\1\270\15\7\1\22\3\0\1\266\54\7"+
    "\1\204\2\0\10\7\1\143\6\7\5\0\1\7\1\217\2\25\2\0\2\25\1\271\2\0\1\272\4\0"+
    "\1\26\20\7\1\23\2\0\1\25\1\154\1\36\2\7\1\273\1\36\2\7\1\43\1\274\12\7\1\20"+
    "\3\143\1\275\4\0\1\7\1\136\2\7\1\20\2\7\1\276\1\7\1\204\1\7\1\204\4\0\17\7"+
    "\1\43\10\0\6\25\1\171\20\0\1\277\20\0\3\7\1\23\6\7\1\120\1\0\1\233\3\0\4\7"+
    "\2\0\2\7\1\55\1\300\4\7\1\57\1\44\3\7\1\204\4\7\1\217\1\7\1\301\5\0\23\7\1"+
    "\204\1\25\1\154\12\0\5\7\1\0\6\7\1\217\23\0\46\7\1\20\1\0\2\7\1\204\1\0\1"+
    "\7\23\0\1\204\1\76\4\7\1\33\1\302\2\7\1\204\1\0\2\7\1\20\1\0\3\7\1\20\10\0"+
    "\2\7\1\303\1\0\2\7\1\204\1\0\3\7\1\22\10\0\7\7\1\274\10\0\1\304\1\226\1\136"+
    "\1\36\2\7\1\217\1\110\4\0\3\7\1\23\3\7\1\23\4\0\1\7\1\36\2\7\1\305\3\0\6\7"+
    "\1\204\1\0\2\7\1\204\1\0\2\7\1\43\1\0\2\7\1\22\15\0\11\7\1\120\6\0\6\7\1\43"+
    "\1\0\6\7\1\43\41\0\1\221\6\7\1\25\1\153\3\0\1\114\1\25\1\0\1\102\1\221\5\7"+
    "\1\25\1\44\2\0\3\7\1\120\1\25\1\154\1\221\3\7\1\152\1\25\1\134\1\25\2\0\4"+
    "\7\1\306\1\0\1\221\5\7\1\45\1\25\1\307\1\310\1\25\1\311\4\0\2\7\1\32\2\7\1"+
    "\211\1\25\11\0\1\20\1\237\1\7\1\33\1\7\1\120\5\7\1\152\1\25\1\44\1\25\1\154"+
    "\1\132\1\74\1\75\2\7\1\76\1\116\1\100\1\51\1\111\1\131\1\241\1\72\2\171\41"+
    "\0\6\7\2\25\1\312\1\0\1\25\1\154\24\0\5\7\1\152\1\164\1\25\1\233\2\0\1\257"+
    "\4\0\6\7\2\25\1\313\1\0\1\25\1\154\4\0\5\7\1\45\1\25\1\0\1\25\1\154\6\0\3"+
    "\7\1\314\1\25\1\216\1\25\1\154\54\0\10\7\1\25\1\154\1\0\1\142\70\0\7\7\1\120"+
    "\40\0\63\7\1\22\14\0\15\25\1\153\2\0\30\7\1\217\27\0\5\7\1\20\72\0\10\7\1"+
    "\20\67\0\7\7\1\120\3\7\1\20\1\25\1\154\14\0\3\7\1\204\1\171\1\0\6\7\1\153"+
    "\1\0\1\217\1\0\1\25\1\154\1\266\2\7\1\241\2\7\56\0\10\7\1\23\1\0\1\71\4\25"+
    "\1\153\1\0\1\102\1\221\1\7\14\0\1\22\77\0\15\7\1\43\1\7\1\23\1\7\1\120\1\7"+
    "\1\315\130\0\1\272\1\316\1\44\1\66\1\317\1\216\3\0\1\320\22\0\1\310\67\0\12"+
    "\7\1\26\10\7\1\26\1\321\1\322\1\7\1\323\1\136\7\7\1\33\1\324\2\26\3\7\1\325"+
    "\1\163\1\143\1\76\51\7\1\204\3\7\1\76\2\7\1\202\3\7\1\202\2\7\1\26\3\7\1\26"+
    "\2\7\1\20\3\7\1\20\3\7\1\76\3\7\1\76\2\7\1\202\1\326\14\25\1\153\1\66\5\25"+
    "\1\171\1\277\1\0\1\234\2\0\1\66\1\40\1\25\52\0\30\7\1\23\1\0\1\153\45\0\1"+
    "\136\3\7\1\155\1\36\1\202\1\327\1\235\1\330\1\155\1\227\1\155\2\202\1\113"+
    "\1\7\1\32\1\7\1\217\1\331\1\32\1\7\1\217\116\0\3\25\1\154\3\25\1\154\3\25"+
    "\1\154\16\0\32\7\1\20\5\0\106\7\1\23\1\0\33\7\1\204\120\7\1\22\53\0\3\7\1"+
    "\204\134\0\36\25\2\0");

  /* The ZZ_CMAP_A table has 1744 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\15\1\16\1\1\2\0\1\2\1\0\1\17\1\12\1\5\1\73\1\74\1\13\1\34"+
    "\1\35\1\72\1\70\1\22\1\71\1\11\1\20\12\10\1\25\1\21\1\76\1\26\1\27\1\0\1\7"+
    "\1\66\2\3\1\64\1\62\1\67\14\3\1\32\1\14\1\33\1\23\1\4\1\6\1\52\1\51\1\40\1"+
    "\42\1\37\1\60\1\47\1\55\1\57\1\3\1\65\1\50\1\61\1\45\1\41\1\53\1\3\1\36\1"+
    "\46\1\44\1\54\1\3\1\56\1\43\1\63\1\3\1\30\1\24\1\31\1\75\6\0\1\15\4\0\1\3"+
    "\12\0\1\3\2\0\7\3\1\0\2\3\4\0\4\3\6\0\5\3\7\0\1\3\1\0\1\3\1\0\10\4\5\3\1\0"+
    "\2\3\2\0\4\3\1\0\1\3\6\0\1\3\1\0\3\3\1\0\1\3\1\0\4\3\1\0\13\3\1\0\3\3\1\0"+
    "\7\4\6\3\1\0\7\3\1\0\1\3\7\0\15\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0\1\4\3\3\5\0"+
    "\3\4\5\0\3\3\7\4\4\0\2\3\1\4\13\3\1\0\1\3\7\4\2\0\6\4\2\3\2\4\1\0\4\4\2\3"+
    "\2\4\3\3\2\0\2\3\1\4\6\3\3\4\2\0\11\3\3\4\1\3\6\0\4\4\2\3\2\0\2\4\1\3\11\4"+
    "\1\3\3\4\1\3\5\4\2\0\1\3\3\4\7\0\11\4\6\3\3\4\1\3\2\4\1\3\7\4\2\3\2\4\2\0"+
    "\2\4\1\3\3\4\1\0\10\3\2\0\2\3\2\0\6\3\1\0\7\3\1\0\1\3\3\0\4\3\2\0\1\4\1\3"+
    "\3\4\2\0\3\4\1\3\10\0\1\4\4\0\2\3\1\0\1\3\1\0\3\4\1\0\6\3\4\0\2\3\1\0\2\3"+
    "\1\0\2\3\1\0\2\3\2\0\1\4\1\0\5\4\4\0\2\4\2\0\3\4\3\0\1\4\7\0\4\3\1\0\1\3\7"+
    "\0\4\4\3\3\1\4\2\0\1\3\1\0\2\3\1\0\3\3\2\4\1\0\3\4\2\0\1\3\11\0\1\4\1\3\1"+
    "\0\6\3\3\0\3\3\1\0\4\3\3\0\2\3\1\0\1\3\1\0\2\3\3\0\2\3\3\0\2\3\4\0\5\4\3\0"+
    "\3\4\1\0\4\4\2\0\1\3\6\0\5\4\1\0\5\3\3\0\1\3\7\4\1\0\2\4\5\0\2\4\1\0\4\3\1"+
    "\0\3\3\1\0\2\3\5\0\3\3\2\0\1\3\3\4\1\0\4\4\1\3\10\0\1\3\2\0\6\3\2\0\2\4\1"+
    "\0\7\3\1\0\1\3\4\0\1\4\4\0\6\4\1\0\1\4\3\0\2\4\4\0\1\3\1\4\2\3\4\4\7\3\10"+
    "\4\1\0\2\4\7\0\2\3\1\0\1\3\2\0\2\3\1\0\1\3\2\0\1\3\6\0\4\3\1\0\3\3\1\0\1\3"+
    "\1\0\1\3\2\0\2\3\1\0\3\3\2\4\1\0\2\4\1\3\2\0\5\3\1\0\1\3\1\0\6\4\2\0\2\4\2"+
    "\0\4\3\5\0\1\4\1\0\1\4\1\0\1\4\4\0\2\4\5\3\10\4\11\0\1\4\1\0\7\4\1\3\2\4\4"+
    "\3\3\4\1\3\3\4\2\3\7\4\3\3\4\4\5\3\14\4\1\3\1\4\3\3\1\0\7\3\2\0\3\4\6\3\2"+
    "\0\3\3\3\0\2\4\2\3\3\4\3\0\2\3\2\4\4\0\1\3\1\0\2\4\4\0\4\3\10\4\3\0\1\3\4"+
    "\0\1\3\1\4\5\0\3\4\2\0\1\3\1\4\1\3\5\0\4\4\4\0\4\3\4\0\5\4\3\3\3\4\5\3\2\4"+
    "\3\0\3\3\3\4\1\0\5\4\4\3\1\4\4\3\3\4\2\3\5\0\4\4\1\0\1\3\1\0\1\3\1\0\1\3\1"+
    "\0\1\3\2\0\3\3\1\0\6\3\2\0\2\3\2\15\6\0\1\4\13\0\1\4\5\0\1\3\4\0\1\3\1\0\5"+
    "\3\2\0\1\3\1\0\4\3\1\0\3\3\2\0\4\3\5\0\5\3\4\0\1\3\1\0\3\4\2\3\3\4\3\0\4\3"+
    "\3\4\2\3\11\0\2\3\4\4\2\3\4\0\2\4\2\0\3\3\6\4\1\0\3\3\1\4\3\3\1\4\4\3\1\4"+
    "\4\3\3\0\1\3\1\0\1\3\2\0\5\3\1\4\2\3\2\4\5\3\1\0\4\3\2\4\4\0\1\3\3\4\2\3\1"+
    "\4\5\3\2\4\3\0\3\3\4\0\3\3\2\4\2\0\6\3\1\0\3\4\1\0\2\4\5\0\5\3\5\0\1\3\1\4"+
    "\3\3\1\0\2\3\1\0\2\3\3\0\2\4\10\0\3\4\3\3\4\0\1\4\6\0\2\3\2\0\3\3\3\0\3\3"+
    "\1\0\2\3\1\0\1\3\5\0\1\4\2\0\2\3\1\4\6\0\5\4\2\0\1\3\3\0\1\3\2\0\4\3\1\0\2"+
    "\3\2\0\1\3\3\4\1\0\2\4\1\0\5\3\2\4\1\0\3\3\1\4\2\0\1\3\1\0\1\4\4\3\5\0\3\4"+
    "\3\0\2\4\1\3\1\0\1\3\3\0\4\4\2\3\1\0\1\3\1\4\3\0\1\3\3\0\2\3\3\0\3\4\2\3\3"+
    "\0\2\4\1\0\2\4\3\0\6\4\2\0\3\4\2\0\4\4\4\0\1\3\2\0\2\3\2\0\4\3\1\0\4\3\1\0"+
    "\1\3\1\0\6\3\2\0\5\3\1\0\4\3\1\0\4\3\2\0\2\4\1\0\1\3\1\0\1\3\5\0\1\3\1\0\1"+
    "\3\1\0\3\3\1\0\3\3\1\0\3\3");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\2\1\1\10\1\11\1\12\1\13\1\14\2\1"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\16\3\1\23"+
    "\1\24\1\25\1\1\10\0\1\5\1\26\1\0\1\27"+
    "\1\0\1\30\3\0\1\31\1\0\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\20\3\1\41\3\3\1\42"+
    "\1\43\11\0\1\44\12\3\1\45\13\3\11\0\1\46"+
    "\1\0\3\3\1\47\2\3\1\50\2\3\1\51\1\52"+
    "\1\3\1\53\2\3\1\54\5\3\1\55\2\0\1\56"+
    "\1\0\1\57\1\0\1\60\4\3\1\61\1\62\1\63"+
    "\1\64\5\3\1\65\1\66\2\3\1\0\1\67\2\0"+
    "\1\70\1\71\2\3\1\72\1\73\1\74\4\3\3\0"+
    "\1\75\5\3\3\0\5\3\3\0\1\3\1\76\3\3"+
    "\1\77\1\0\1\100\1\0\1\101\1\102\2\3\1\0"+
    "\1\103\1\104\1\3\1\0\1\105\3\0\1\106";

  private static int [] zzUnpackAction() {
    int [] result = new int[237];
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
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\u01f8\0\u0237\0\u0276\0\u02b5\0\77\0\77\0\u02f4\0\77"+
    "\0\u0333\0\u0372\0\77\0\77\0\77\0\77\0\77\0\77"+
    "\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b\0\u056a"+
    "\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\77\0\77"+
    "\0\77\0\u0723\0\u0762\0\u07a1\0\u07e0\0\u081f\0\u085e\0\u089d"+
    "\0\u08dc\0\u091b\0\u095a\0\77\0\u01f8\0\77\0\u0237\0\77"+
    "\0\u0999\0\u0276\0\u09d8\0\u0a17\0\u0a56\0\77\0\u0a95\0\77"+
    "\0\77\0\77\0\77\0\77\0\u0ad4\0\u0b13\0\u0b52\0\u0b91"+
    "\0\u0bd0\0\u0c0f\0\u0c4e\0\u0c8d\0\u0ccc\0\u0d0b\0\u0d4a\0\u0d89"+
    "\0\u0dc8\0\u0e07\0\u0e46\0\u0e85\0\275\0\u0ec4\0\u0f03\0\u0f42"+
    "\0\77\0\77\0\u0f81\0\u0fc0\0\u0fff\0\u103e\0\u107d\0\u10bc"+
    "\0\u10fb\0\u113a\0\u1179\0\77\0\u11b8\0\u11f7\0\u1236\0\u1275"+
    "\0\u12b4\0\u12f3\0\u1332\0\u1371\0\u13b0\0\u13ef\0\275\0\u142e"+
    "\0\u146d\0\u14ac\0\u14eb\0\u152a\0\u1569\0\u15a8\0\u15e7\0\u1626"+
    "\0\u1665\0\u16a4\0\u16e3\0\u1722\0\u1761\0\u17a0\0\u17df\0\u181e"+
    "\0\u185d\0\u189c\0\u18db\0\77\0\u191a\0\u1959\0\u1998\0\u19d7"+
    "\0\275\0\u1a16\0\u1a55\0\275\0\u1a94\0\u1ad3\0\275\0\275"+
    "\0\u1b12\0\275\0\u1b51\0\u1b90\0\275\0\u1bcf\0\u1c0e\0\u1c4d"+
    "\0\u1c8c\0\u1ccb\0\77\0\u1d0a\0\u1d49\0\77\0\u1d88\0\77"+
    "\0\u1dc7\0\77\0\u1e06\0\u1e45\0\u1e84\0\u1ec3\0\275\0\275"+
    "\0\275\0\275\0\u1f02\0\u1f41\0\u1f80\0\u1fbf\0\u1ffe\0\275"+
    "\0\275\0\u203d\0\u207c\0\u20bb\0\77\0\u20fa\0\u2139\0\275"+
    "\0\275\0\u2178\0\u21b7\0\275\0\275\0\275\0\u21f6\0\u2235"+
    "\0\u2274\0\u22b3\0\u22f2\0\u2331\0\u2370\0\275\0\u23af\0\u23ee"+
    "\0\u242d\0\u246c\0\u24ab\0\u24ea\0\u2529\0\u2568\0\u25a7\0\u25e6"+
    "\0\u2625\0\u2664\0\u26a3\0\u26e2\0\u2721\0\u2760\0\u279f\0\275"+
    "\0\u27de\0\u281d\0\u285c\0\275\0\u289b\0\77\0\u28da\0\275"+
    "\0\275\0\u2919\0\u2958\0\u2997\0\77\0\275\0\u29d6\0\u2a15"+
    "\0\275\0\u2a54\0\u2a93\0\u2ad2\0\77";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[237];
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
    "\1\2\2\3\1\4\2\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\2\2\1\3\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\2\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\4\1\34"+
    "\1\4\1\35\1\36\1\37\1\40\1\41\2\4\1\42"+
    "\3\4\1\43\1\44\1\45\1\46\5\4\1\47\1\50"+
    "\1\51\1\52\3\2\100\0\2\3\13\0\1\3\63\0"+
    "\3\4\2\0\1\4\25\0\32\4\7\0\6\53\1\0"+
    "\1\54\67\53\40\0\1\55\1\56\2\0\1\57\1\0"+
    "\1\60\16\0\1\61\1\62\20\0\1\7\1\63\76\0"+
    "\1\64\70\0\2\65\3\0\1\65\1\66\24\0\32\65"+
    "\7\0\13\67\1\70\1\71\62\67\14\72\1\73\2\72"+
    "\1\70\57\72\20\0\1\74\51\0\1\75\30\0\1\76"+
    "\2\0\1\77\44\0\1\100\1\101\1\102\26\0\1\103"+
    "\77\0\1\104\52\0\3\4\2\0\1\4\25\0\1\4"+
    "\1\105\30\4\12\0\3\4\2\0\1\4\25\0\5\4"+
    "\1\106\4\4\1\107\17\4\12\0\3\4\2\0\1\4"+
    "\25\0\3\4\1\110\10\4\1\111\15\4\12\0\3\4"+
    "\2\0\1\4\25\0\2\4\1\112\27\4\12\0\3\4"+
    "\2\0\1\4\25\0\17\4\1\113\12\4\12\0\3\4"+
    "\2\0\1\4\25\0\1\4\1\114\14\4\1\115\13\4"+
    "\12\0\3\4\2\0\1\4\25\0\20\4\1\116\11\4"+
    "\12\0\3\4\2\0\1\4\25\0\3\4\1\117\6\4"+
    "\1\120\17\4\12\0\3\4\2\0\1\4\25\0\1\4"+
    "\1\121\1\122\27\4\12\0\3\4\2\0\1\4\25\0"+
    "\1\123\31\4\12\0\3\4\2\0\1\4\25\0\7\4"+
    "\1\124\12\4\1\125\7\4\12\0\3\4\2\0\1\4"+
    "\25\0\2\4\1\126\27\4\12\0\3\4\2\0\1\4"+
    "\25\0\3\4\1\127\26\4\12\0\3\4\2\0\1\4"+
    "\25\0\5\4\1\130\24\4\102\0\1\131\3\0\6\53"+
    "\1\132\1\0\67\53\7\0\1\133\137\0\1\134\104\0"+
    "\1\135\103\0\1\136\72\0\1\137\76\0\1\140\57\0"+
    "\1\141\46\0\1\63\66\0\1\67\1\0\13\67\2\0"+
    "\60\67\1\72\1\0\13\72\2\0\60\72\1\74\1\0"+
    "\75\74\20\142\1\0\51\142\1\143\4\142\27\0\1\144"+
    "\52\0\3\4\2\0\1\4\25\0\2\4\1\145\3\4"+
    "\1\146\23\4\12\0\3\4\2\0\1\4\25\0\6\4"+
    "\1\147\23\4\12\0\3\4\2\0\1\4\25\0\10\4"+
    "\1\150\21\4\12\0\3\4\2\0\1\4\25\0\7\4"+
    "\1\151\22\4\12\0\3\4\2\0\1\4\25\0\6\4"+
    "\1\152\3\4\1\153\17\4\12\0\3\4\2\0\1\4"+
    "\25\0\23\4\1\154\6\4\12\0\3\4\2\0\1\4"+
    "\25\0\1\155\1\156\30\4\12\0\3\4\2\0\1\4"+
    "\25\0\20\4\1\157\11\4\12\0\3\4\2\0\1\4"+
    "\25\0\12\4\1\160\17\4\12\0\3\4\2\0\1\4"+
    "\25\0\21\4\1\161\10\4\12\0\3\4\2\0\1\4"+
    "\25\0\6\4\1\162\23\4\12\0\3\4\2\0\1\4"+
    "\25\0\3\4\1\163\26\4\12\0\3\4\2\0\1\4"+
    "\25\0\7\4\1\164\22\4\12\0\3\4\2\0\1\4"+
    "\25\0\23\4\1\165\6\4\12\0\3\4\2\0\1\4"+
    "\25\0\3\4\1\166\26\4\12\0\3\4\2\0\1\4"+
    "\25\0\10\4\1\167\21\4\12\0\3\4\2\0\1\4"+
    "\25\0\23\4\1\170\6\4\12\0\3\4\2\0\1\4"+
    "\25\0\7\4\1\171\22\4\12\0\3\4\2\0\1\4"+
    "\25\0\2\4\1\172\27\4\7\0\6\173\2\0\67\173"+
    "\52\0\1\174\71\0\1\175\104\0\1\176\72\0\1\177"+
    "\74\0\1\200\71\0\1\201\36\0\20\142\1\0\51\142"+
    "\1\202\4\142\20\203\1\204\51\203\1\205\4\203\3\0"+
    "\3\4\2\0\1\4\25\0\3\4\1\206\26\4\12\0"+
    "\3\4\2\0\1\4\25\0\16\4\1\207\13\4\12\0"+
    "\3\4\2\0\1\4\25\0\1\4\1\210\30\4\12\0"+
    "\3\4\2\0\1\4\25\0\1\4\1\211\30\4\12\0"+
    "\3\4\2\0\1\4\25\0\10\4\1\212\21\4\12\0"+
    "\3\4\2\0\1\4\25\0\2\4\1\213\27\4\12\0"+
    "\3\4\2\0\1\4\25\0\12\4\1\214\17\4\12\0"+
    "\3\4\2\0\1\4\25\0\15\4\1\215\14\4\12\0"+
    "\3\4\2\0\1\4\25\0\3\4\1\216\26\4\12\0"+
    "\3\4\2\0\1\4\25\0\7\4\1\217\22\4\12\0"+
    "\3\4\2\0\1\4\25\0\12\4\1\220\17\4\12\0"+
    "\3\4\2\0\1\4\25\0\6\4\1\221\23\4\12\0"+
    "\3\4\2\0\1\4\25\0\3\4\1\222\26\4\12\0"+
    "\3\4\2\0\1\4\25\0\13\4\1\223\16\4\12\0"+
    "\3\4\2\0\1\4\25\0\11\4\1\224\20\4\12\0"+
    "\3\4\2\0\1\4\25\0\15\4\1\225\14\4\12\0"+
    "\3\4\2\0\1\4\25\0\2\4\1\226\27\4\12\0"+
    "\3\4\2\0\1\4\25\0\6\4\1\227\23\4\12\0"+
    "\3\4\2\0\1\4\25\0\15\4\1\230\14\4\12\0"+
    "\3\4\2\0\1\4\25\0\21\4\1\231\10\4\12\0"+
    "\3\4\2\0\1\4\25\0\1\4\1\232\30\4\7\0"+
    "\6\173\1\233\1\0\67\173\46\0\1\234\67\0\1\235"+
    "\76\0\1\236\104\0\1\237\73\0\1\240\73\0\1\241"+
    "\37\0\20\142\1\204\51\142\1\202\4\142\20\203\1\0"+
    "\51\203\1\205\24\203\1\242\51\203\1\205\4\203\3\0"+
    "\3\4\2\0\1\4\25\0\1\243\31\4\12\0\3\4"+
    "\2\0\1\4\25\0\1\244\31\4\12\0\3\4\2\0"+
    "\1\4\25\0\7\4\1\245\22\4\12\0\3\4\2\0"+
    "\1\4\25\0\6\4\1\246\23\4\12\0\3\4\2\0"+
    "\1\4\25\0\17\4\1\247\12\4\12\0\3\4\2\0"+
    "\1\4\25\0\11\4\1\250\1\251\17\4\12\0\3\4"+
    "\2\0\1\4\25\0\20\4\1\252\11\4\12\0\3\4"+
    "\2\0\1\4\25\0\2\4\1\253\27\4\12\0\3\4"+
    "\2\0\1\4\25\0\14\4\1\254\15\4\12\0\3\4"+
    "\2\0\1\4\25\0\6\4\1\255\23\4\12\0\3\4"+
    "\2\0\1\4\25\0\1\4\1\256\30\4\12\0\3\4"+
    "\2\0\1\4\25\0\14\4\1\257\15\4\12\0\3\4"+
    "\2\0\1\4\25\0\11\4\1\260\1\261\17\4\12\0"+
    "\3\4\2\0\1\4\25\0\6\4\1\262\23\4\12\0"+
    "\3\4\2\0\1\4\25\0\15\4\1\263\14\4\55\0"+
    "\1\264\66\0\1\265\112\0\1\266\72\0\1\267\33\0"+
    "\3\4\2\0\1\4\25\0\4\4\1\270\25\4\12\0"+
    "\3\4\2\0\1\4\25\0\7\4\1\271\22\4\12\0"+
    "\3\4\2\0\1\4\25\0\4\4\1\272\25\4\12\0"+
    "\3\4\2\0\1\4\25\0\2\4\1\273\27\4\12\0"+
    "\3\4\2\0\1\4\25\0\17\4\1\274\12\4\12\0"+
    "\3\4\2\0\1\4\25\0\12\4\1\275\17\4\12\0"+
    "\3\4\2\0\1\4\25\0\17\4\1\276\12\4\12\0"+
    "\3\4\2\0\1\4\25\0\4\4\1\277\25\4\12\0"+
    "\3\4\2\0\1\4\25\0\7\4\1\300\22\4\12\0"+
    "\3\4\2\0\1\4\25\0\3\4\1\301\26\4\12\0"+
    "\3\4\2\0\1\4\25\0\6\4\1\302\23\4\73\0"+
    "\1\303\56\0\1\304\100\0\1\305\33\0\3\4\2\0"+
    "\1\4\25\0\10\4\1\306\21\4\12\0\3\4\2\0"+
    "\1\4\25\0\12\4\1\307\17\4\12\0\3\4\2\0"+
    "\1\4\25\0\16\4\1\310\13\4\12\0\3\4\2\0"+
    "\1\4\25\0\2\4\1\311\27\4\12\0\3\4\2\0"+
    "\1\4\25\0\1\312\31\4\12\0\3\4\2\0\1\4"+
    "\25\0\21\4\1\313\10\4\46\0\1\314\113\0\1\315"+
    "\111\0\1\316\12\0\3\4\2\0\1\4\25\0\14\4"+
    "\1\317\15\4\12\0\3\4\2\0\1\4\25\0\1\320"+
    "\31\4\12\0\3\4\2\0\1\4\25\0\1\4\1\321"+
    "\30\4\12\0\3\4\2\0\1\4\25\0\1\4\1\322"+
    "\30\4\12\0\3\4\2\0\1\4\25\0\3\4\1\323"+
    "\26\4\55\0\1\324\66\0\1\325\110\0\1\326\31\0"+
    "\3\4\2\0\1\4\25\0\10\4\1\327\21\4\12\0"+
    "\3\4\2\0\1\4\25\0\1\4\1\330\30\4\12\0"+
    "\3\4\2\0\1\4\25\0\3\4\1\331\26\4\12\0"+
    "\3\4\2\0\1\4\25\0\5\4\1\332\1\4\1\333"+
    "\22\4\12\0\3\4\2\0\1\4\25\0\7\4\1\334"+
    "\22\4\47\0\1\335\75\0\1\336\111\0\1\337\27\0"+
    "\3\4\2\0\1\4\25\0\10\4\1\340\21\4\12\0"+
    "\3\4\2\0\1\4\25\0\22\4\1\341\7\4\12\0"+
    "\3\4\2\0\1\4\25\0\21\4\1\342\10\4\12\0"+
    "\3\4\2\0\1\4\25\0\6\4\1\343\23\4\45\0"+
    "\1\344\107\0\1\345\32\0\3\4\2\0\1\4\25\0"+
    "\6\4\1\346\23\4\12\0\3\4\2\0\1\4\25\0"+
    "\1\4\1\347\30\4\66\0\1\350\22\0\3\4\2\0"+
    "\1\4\25\0\1\351\31\4\62\0\1\352\67\0\1\353"+
    "\73\0\1\354\73\0\1\355\40\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11025];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\12\1\2\11\1\1\1\11\2\1\6\11"+
    "\16\1\3\11\1\1\10\0\1\1\1\11\1\0\1\11"+
    "\1\0\1\11\3\0\1\1\1\0\1\11\1\1\5\11"+
    "\24\1\2\11\11\0\1\11\26\1\11\0\1\11\1\0"+
    "\25\1\1\11\2\0\1\11\1\0\1\11\1\0\1\11"+
    "\21\1\1\0\1\11\2\0\13\1\3\0\6\1\3\0"+
    "\5\1\3\0\6\1\1\0\1\11\1\0\4\1\1\0"+
    "\1\11\2\1\1\0\1\1\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[237];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _JawaLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _JawaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 71: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 72: break;
          case 3: 
            { return ID;
            }
          case 73: break;
          case 4: 
            { return AT;
            }
          case 74: break;
          case 5: 
            { return NUMBER;
            }
          case 75: break;
          case 6: 
            { return DOT;
            }
          case 76: break;
          case 7: 
            { return POUND;
            }
          case 77: break;
          case 8: 
            { return DIV;
            }
          case 78: break;
          case 9: 
            { return SEMI;
            }
          case 79: break;
          case 10: 
            { return COMMA;
            }
          case 80: break;
          case 11: 
            { return HAT;
            }
          case 81: break;
          case 12: 
            { return BAR;
            }
          case 82: break;
          case 13: 
            { return LBRACE;
            }
          case 83: break;
          case 14: 
            { return RBRACE;
            }
          case 84: break;
          case 15: 
            { return LBRACKET;
            }
          case 85: break;
          case 16: 
            { return RBRACKET;
            }
          case 86: break;
          case 17: 
            { return LPAREN;
            }
          case 87: break;
          case 18: 
            { return RPAREN;
            }
          case 88: break;
          case 19: 
            { return ADD;
            }
          case 89: break;
          case 20: 
            { return SUB;
            }
          case 90: break;
          case 21: 
            { return MUL;
            }
          case 91: break;
          case 22: 
            { return RANGE;
            }
          case 92: break;
          case 23: 
            { return LOCATION_ID;
            }
          case 93: break;
          case 24: 
            { return STRING_LITERAL;
            }
          case 94: break;
          case 25: 
            { return JawaTokenTypes.LINE_COMMENT();
            }
          case 95: break;
          case 26: 
            { return OR;
            }
          case 96: break;
          case 27: 
            { return SHR;
            }
          case 97: break;
          case 28: 
            { return AND;
            }
          case 98: break;
          case 29: 
            { return XOR;
            }
          case 99: break;
          case 30: 
            { return SHL;
            }
          case 100: break;
          case 31: 
            { return ASSIGN_OP;
            }
          case 101: break;
          case 32: 
            { return ARROW;
            }
          case 102: break;
          case 33: 
            { return IF;
            }
          case 103: break;
          case 34: 
            { return REM;
            }
          case 104: break;
          case 35: 
            { return APOSTROPHE_ID;
            }
          case 105: break;
          case 36: 
            { return USHR;
            }
          case 106: break;
          case 37: 
            { return NEW;
            }
          case 107: break;
          case 38: 
            { //for comments in interpolated strings
    return JawaTokenTypes.BLOCK_COMMENT();
            }
          case 108: break;
          case 39: 
            { return ELSE;
            }
          case 109: break;
          case 40: 
            { return CALL;
            }
          case 110: break;
          case 41: 
            { return THEN;
            }
          case 111: break;
          case 42: 
            { return NULL_LITERAL;
            }
          case 112: break;
          case 43: 
            { return GOTO;
            }
          case 113: break;
          case 44: 
            { return LCMP;
            }
          case 114: break;
          case 45: 
            { return STATIC_ID;
            }
          case 115: break;
          case 46: 
            { return TYPE_KEY;
            }
          case 116: break;
          case 47: 
            { return KIND_KEY;
            }
          case 117: break;
          case 48: 
            { //for comments in interpolated strings
    return JawaTokenTypes.DOC_COMMENT();
            }
          case 118: break;
          case 49: 
            { return CATCH;
            }
          case 119: break;
          case 50: 
            { return DCMPG;
            }
          case 120: break;
          case 51: 
            { return DCMPL;
            }
          case 121: break;
          case 52: 
            { return THROW;
            }
          case 122: break;
          case 53: 
            { return FCMPG;
            }
          case 123: break;
          case 54: 
            { return FCMPL;
            }
          case 124: break;
          case 55: 
            { return OWNER_KEY;
            }
          case 125: break;
          case 56: 
            { return CLASS_OR_INTERFACE;
            }
          case 126: break;
          case 57: 
            { return RETURN;
            }
          case 127: break;
          case 58: 
            { return SWITCH;
            }
          case 128: break;
          case 59: 
            { return STATIC_FIELD;
            }
          case 129: break;
          case 60: 
            { return LENGTH;
            }
          case 130: break;
          case 61: 
            { return EXTENDS_AND_IMPLEMENTS;
            }
          case 131: break;
          case 62: 
            { return METHOD;
            }
          case 132: break;
          case 63: 
            { return EXCEPTION;
            }
          case 133: break;
          case 64: 
            { return SIGNATURE_KEY;
            }
          case 134: break;
          case 65: 
            { return CONST_CLASS;
            }
          case 135: break;
          case 66: 
            { return INSTANCEOF;
            }
          case 136: break;
          case 67: 
            { return ACCESS_FLAG_KEY;
            }
          case 137: break;
          case 68: 
            { return MONITOR_EXIT;
            }
          case 138: break;
          case 69: 
            { return MONITOR_ENTER;
            }
          case 139: break;
          case 70: 
            { return CLASS_DESCRIPTOR_KEY;
            }
          case 140: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
