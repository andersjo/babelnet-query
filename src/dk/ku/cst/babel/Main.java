package dk.ku.cst.babel;

import it.uniroma1.lcl.babelnet.BabelNet;
import it.uniroma1.lcl.babelnet.BabelSense;
import it.uniroma1.lcl.babelnet.BabelSenseComparator;
import it.uniroma1.lcl.babelnet.BabelSynset;
import it.uniroma1.lcl.babelnet.iterators.*;
import it.uniroma1.lcl.jlt.util.Language;
import it.uniroma1.lcl.jlt.util.ScoredItem;

import java.io.IOException;
import java.util.*;

import com.google.common.collect.Multimap;

import edu.mit.jwi.item.IPointer;
import edu.mit.jwi.item.POS;


/**
 * A demo class to test {@link BabelNet}'s various features.
 *
 * @author ponzetto
 */
public class Main
{
    /**
     * The snippet contained in our WWW-12 demo paper
     *
     */
    public static void www14Test() throws IOException
    {
        BabelNet bn = BabelNet.getInstance();
        System.out.println("SYNSETS WITH English word: \"bank\"");
        List<BabelSynset> synsets = bn.getSynsets(Language.valueOf("EN"), "cute", POS.ADJECTIVE);
        // Collections.sort(synsets, new BabelSynsetComparator("bank"));
        // System.out.println("LANGUAGE" + Language);


        for (BabelSynset synset : synsets)
        {
            System.out.print("  =>(" + synset.getId() + ") SOURCE: " + synset.getSynsetSource() +
                    "; TYPE: " + synset.getSynsetType() +
                    "; WN SYNSET: " + synset.getWordNetOffsets() + ";\n" +
                    "  MAIN LEMMA: " + synset.getMainSense() +
                    ";\n  IMAGES: " + synset.getImages() +
                    ";\n  CATEGORIES: " + synset.getCategories());
            System.out.println("  -----");
        }
    }

    /**
     * Just for testing
     *
     * @param args
     *
     */
    static public void main(String[] args) throws IOException {
        www14Test();
    }
}
