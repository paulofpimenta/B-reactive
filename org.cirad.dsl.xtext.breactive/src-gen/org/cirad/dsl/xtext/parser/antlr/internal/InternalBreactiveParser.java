package org.cirad.dsl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.cirad.dsl.xtext.services.BreactiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBreactiveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'Run main as : '", "'}'", "'Entity'", "'Attributes'", "','", "'as '", "'each'", "'position ='", "':='", "':'", "'let'", "'<-'", "'.'", "'EquationBehaviour'", "'Parameters'", "'('", "')'", "'Equation'", "'ActivityBehavior'", "'ActivityDiagramBehavior'", "'='", "'+'", "'-'", "'/'", "'*'", "'sqrt'", "'random'", "'floor'", "'exp'", "'count'", "'max-one-of'", "'select a location'", "'one-of'", "'here'", "'top'", "'left'", "'right'", "'grid'", "'bottom'", "'neighborhood'", "'union-location'", "'true'", "'false'", "'set'", "'get'", "'>='", "'>'", "'!='", "'<'", "'<='", "'occupied'", "'NOT'", "'AND'", "'OR'", "'any'", "'all'", "'Create '", "'on'", "'Create grid'", "'of'", "'entity'", "'has'", "'as true'", "'is '", "'by'", "'having '", "'from '", "'['", "']'", "'from ['", "'such that'", "'Start'", "'End'", "'->'", "'then'", "'else'", "'Decide '", "'if'", "'Join with ('", "'and goes to'", "'Fork into ('", "'Merge with ('", "'Move to '", "'Die'", "'Reproduce'", "'with '", "'placed on'", "'where'", "'Add'", "'to'", "'Remove'", "'Set'", "'String'", "'Int'", "'Float'", "'Boolean'", "'Location'", "'LocationSet'", "'EntitySet'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalBreactiveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBreactiveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBreactiveParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBreactive.g"; }



     	private BreactiveGrammarAccess grammarAccess;

        public InternalBreactiveParser(TokenStream input, BreactiveGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BreactiveGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBreactive.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBreactive.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalBreactive.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBreactive.g:72:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_entities_4_0 = null;

        EObject lv_mainBehavior_6_0 = null;

        EObject lv_init_7_0 = null;

        EObject lv_init_8_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalBreactive.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalBreactive.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            // InternalBreactive.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalBreactive.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?) )
            // InternalBreactive.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalBreactive.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?)
            // InternalBreactive.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+ {...}?
            {
            // InternalBreactive.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBreactive.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) )
            	    {
            	    // InternalBreactive.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) ) )
            	    // InternalBreactive.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalBreactive.g:87:99: ( ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) ) )
            	    // InternalBreactive.g:88:5: ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalBreactive.g:91:8: ({...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) ) )
            	    // InternalBreactive.g:91:9: {...}? => (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalBreactive.g:91:18: (otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* ) )
            	    // InternalBreactive.g:91:19: otherlv_1= 'Model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_0_0());
            	    							
            	    // InternalBreactive.g:95:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalBreactive.g:96:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalBreactive.g:96:9: (lv_name_2_0= RULE_ID )
            	    // InternalBreactive.g:97:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getModelRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalBreactive.g:117:8: ( ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )* )
            	    // InternalBreactive.g:118:9: ( (lv_entities_4_0= ruleEntity ) )* (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) ) ( (lv_init_7_0= ruleInitEntity ) )* ( (lv_init_8_0= ruleInitSpace ) )*
            	    {
            	    // InternalBreactive.g:118:9: ( (lv_entities_4_0= ruleEntity ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalBreactive.g:119:10: (lv_entities_4_0= ruleEntity )
            	    	    {
            	    	    // InternalBreactive.g:119:10: (lv_entities_4_0= ruleEntity )
            	    	    // InternalBreactive.g:120:11: lv_entities_4_0= ruleEntity
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_3_0_0());
            	    	    										
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_entities_4_0=ruleEntity();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"entities",
            	    	    												lv_entities_4_0,
            	    	    												"org.cirad.dsl.xtext.Breactive.Entity");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // InternalBreactive.g:137:9: (otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) ) )
            	    // InternalBreactive.g:138:10: otherlv_5= 'Run main as : ' ( (lv_mainBehavior_6_0= ruleBehavior ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_6); 

            	    										newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRunMainAsKeyword_0_3_1_0());
            	    									
            	    // InternalBreactive.g:142:10: ( (lv_mainBehavior_6_0= ruleBehavior ) )
            	    // InternalBreactive.g:143:11: (lv_mainBehavior_6_0= ruleBehavior )
            	    {
            	    // InternalBreactive.g:143:11: (lv_mainBehavior_6_0= ruleBehavior )
            	    // InternalBreactive.g:144:12: lv_mainBehavior_6_0= ruleBehavior
            	    {

            	    												newCompositeNode(grammarAccess.getModelAccess().getMainBehaviorBehaviorParserRuleCall_0_3_1_1_0());
            	    											
            	    pushFollow(FOLLOW_7);
            	    lv_mainBehavior_6_0=ruleBehavior();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getModelRule());
            	    												}
            	    												set(
            	    													current,
            	    													"mainBehavior",
            	    													lv_mainBehavior_6_0,
            	    													"org.cirad.dsl.xtext.Breactive.Behavior");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }

            	    // InternalBreactive.g:162:9: ( (lv_init_7_0= ruleInitEntity ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==69) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalBreactive.g:163:10: (lv_init_7_0= ruleInitEntity )
            	    	    {
            	    	    // InternalBreactive.g:163:10: (lv_init_7_0= ruleInitEntity )
            	    	    // InternalBreactive.g:164:11: lv_init_7_0= ruleInitEntity
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getModelAccess().getInitInitEntityParserRuleCall_0_3_2_0());
            	    	    										
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_init_7_0=ruleInitEntity();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"init",
            	    	    												lv_init_7_0,
            	    	    												"org.cirad.dsl.xtext.Breactive.InitEntity");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    // InternalBreactive.g:181:9: ( (lv_init_8_0= ruleInitSpace ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==71) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalBreactive.g:182:10: (lv_init_8_0= ruleInitSpace )
            	    	    {
            	    	    // InternalBreactive.g:182:10: (lv_init_8_0= ruleInitSpace )
            	    	    // InternalBreactive.g:183:11: lv_init_8_0= ruleInitSpace
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getModelAccess().getInitInitSpaceParserRuleCall_0_3_3_0());
            	    	    										
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_init_8_0=ruleInitSpace();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"init",
            	    	    												lv_init_8_0,
            	    	    												"org.cirad.dsl.xtext.Breactive.InitSpace");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBreactive.g:207:3: ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) )
            	    {
            	    // InternalBreactive.g:207:3: ({...}? => ( ({...}? => (otherlv_9= '}' ) ) ) )
            	    // InternalBreactive.g:208:4: {...}? => ( ({...}? => (otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalBreactive.g:208:99: ( ({...}? => (otherlv_9= '}' ) ) )
            	    // InternalBreactive.g:209:5: ({...}? => (otherlv_9= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalBreactive.g:212:8: ({...}? => (otherlv_9= '}' ) )
            	    // InternalBreactive.g:212:9: {...}? => (otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalBreactive.g:212:18: (otherlv_9= '}' )
            	    // InternalBreactive.g:212:19: otherlv_9= '}'
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_9); 

            	    								newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalBreactive.g:233:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalBreactive.g:233:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalBreactive.g:234:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalBreactive.g:240:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeClass ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )* otherlv_8= '}' )? ( ( (lv_behavior_9_0= ruleBehavior ) ) ( (lv_behavior_10_0= ruleBehavior ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_behavior_9_0 = null;

        EObject lv_behavior_10_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:246:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeClass ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )* otherlv_8= '}' )? ( ( (lv_behavior_9_0= ruleBehavior ) ) ( (lv_behavior_10_0= ruleBehavior ) )* )? otherlv_11= '}' ) )
            // InternalBreactive.g:247:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeClass ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )* otherlv_8= '}' )? ( ( (lv_behavior_9_0= ruleBehavior ) ) ( (lv_behavior_10_0= ruleBehavior ) )* )? otherlv_11= '}' )
            {
            // InternalBreactive.g:247:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeClass ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )* otherlv_8= '}' )? ( ( (lv_behavior_9_0= ruleBehavior ) ) ( (lv_behavior_10_0= ruleBehavior ) )* )? otherlv_11= '}' )
            // InternalBreactive.g:248:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeClass ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )* otherlv_8= '}' )? ( ( (lv_behavior_9_0= ruleBehavior ) ) ( (lv_behavior_10_0= ruleBehavior ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalBreactive.g:252:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBreactive.g:253:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBreactive.g:253:4: (lv_name_1_0= RULE_ID )
            // InternalBreactive.g:254:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBreactive.g:274:3: (otherlv_3= 'Attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeClass ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBreactive.g:275:4: otherlv_3= 'Attributes' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeClass ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getAttributesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBreactive.g:283:4: ( (lv_attributes_5_0= ruleAttributeClass ) )
                    // InternalBreactive.g:284:5: (lv_attributes_5_0= ruleAttributeClass )
                    {
                    // InternalBreactive.g:284:5: (lv_attributes_5_0= ruleAttributeClass )
                    // InternalBreactive.g:285:6: lv_attributes_5_0= ruleAttributeClass
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeClassParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_attributes_5_0=ruleAttributeClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_5_0,
                    							"org.cirad.dsl.xtext.Breactive.AttributeClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:302:4: (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBreactive.g:303:5: otherlv_6= ',' ( (lv_attributes_7_0= ruleAttributeClass ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBreactive.g:307:5: ( (lv_attributes_7_0= ruleAttributeClass ) )
                    	    // InternalBreactive.g:308:6: (lv_attributes_7_0= ruleAttributeClass )
                    	    {
                    	    // InternalBreactive.g:308:6: (lv_attributes_7_0= ruleAttributeClass )
                    	    // InternalBreactive.g:309:7: lv_attributes_7_0= ruleAttributeClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeClassParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attributes_7_0=ruleAttributeClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_7_0,
                    	    								"org.cirad.dsl.xtext.Breactive.AttributeClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBreactive.g:332:3: ( ( (lv_behavior_9_0= ruleBehavior ) ) ( (lv_behavior_10_0= ruleBehavior ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26||(LA8_0>=31 && LA8_0<=32)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBreactive.g:333:4: ( (lv_behavior_9_0= ruleBehavior ) ) ( (lv_behavior_10_0= ruleBehavior ) )*
                    {
                    // InternalBreactive.g:333:4: ( (lv_behavior_9_0= ruleBehavior ) )
                    // InternalBreactive.g:334:5: (lv_behavior_9_0= ruleBehavior )
                    {
                    // InternalBreactive.g:334:5: (lv_behavior_9_0= ruleBehavior )
                    // InternalBreactive.g:335:6: lv_behavior_9_0= ruleBehavior
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getBehaviorBehaviorParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_behavior_9_0=ruleBehavior();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"behavior",
                    							lv_behavior_9_0,
                    							"org.cirad.dsl.xtext.Breactive.Behavior");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:352:4: ( (lv_behavior_10_0= ruleBehavior ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26||(LA7_0>=31 && LA7_0<=32)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBreactive.g:353:5: (lv_behavior_10_0= ruleBehavior )
                    	    {
                    	    // InternalBreactive.g:353:5: (lv_behavior_10_0= ruleBehavior )
                    	    // InternalBreactive.g:354:6: lv_behavior_10_0= ruleBehavior
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getBehaviorBehaviorParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_behavior_10_0=ruleBehavior();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"behavior",
                    	    							lv_behavior_10_0,
                    	    							"org.cirad.dsl.xtext.Breactive.Behavior");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleInitEntity"
    // InternalBreactive.g:380:1: entryRuleInitEntity returns [EObject current=null] : iv_ruleInitEntity= ruleInitEntity EOF ;
    public final EObject entryRuleInitEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitEntity = null;


        try {
            // InternalBreactive.g:380:51: (iv_ruleInitEntity= ruleInitEntity EOF )
            // InternalBreactive.g:381:2: iv_ruleInitEntity= ruleInitEntity EOF
            {
             newCompositeNode(grammarAccess.getInitEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitEntity=ruleInitEntity();

            state._fsp--;

             current =iv_ruleInitEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitEntity"


    // $ANTLR start "ruleInitEntity"
    // InternalBreactive.g:387:1: ruleInitEntity returns [EObject current=null] : ( ( (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression ) ) otherlv_1= 'as ' ( (lv_initName_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'each' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleInitEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_initName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_initFunctionCall_0_0 = null;

        EObject lv_initialLocation_9_0 = null;

        EObject lv_assingnments_10_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:393:2: ( ( ( (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression ) ) otherlv_1= 'as ' ( (lv_initName_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'each' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= '}' ) )
            // InternalBreactive.g:394:2: ( ( (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression ) ) otherlv_1= 'as ' ( (lv_initName_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'each' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalBreactive.g:394:2: ( ( (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression ) ) otherlv_1= 'as ' ( (lv_initName_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'each' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= '}' )
            // InternalBreactive.g:395:3: ( (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression ) ) otherlv_1= 'as ' ( (lv_initName_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'each' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= '}'
            {
            // InternalBreactive.g:395:3: ( (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression ) )
            // InternalBreactive.g:396:4: (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression )
            {
            // InternalBreactive.g:396:4: (lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression )
            // InternalBreactive.g:397:5: lv_initFunctionCall_0_0= ruleEntitySetCreateFCExpression
            {

            					newCompositeNode(grammarAccess.getInitEntityAccess().getInitFunctionCallEntitySetCreateFCExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_initFunctionCall_0_0=ruleEntitySetCreateFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitEntityRule());
            					}
            					set(
            						current,
            						"initFunctionCall",
            						lv_initFunctionCall_0_0,
            						"org.cirad.dsl.xtext.Breactive.EntitySetCreateFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInitEntityAccess().getAsKeyword_1());
            		
            // InternalBreactive.g:418:3: ( (lv_initName_2_0= RULE_ID ) )
            // InternalBreactive.g:419:4: (lv_initName_2_0= RULE_ID )
            {
            // InternalBreactive.g:419:4: (lv_initName_2_0= RULE_ID )
            // InternalBreactive.g:420:5: lv_initName_2_0= RULE_ID
            {
            lv_initName_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_initName_2_0, grammarAccess.getInitEntityAccess().getInitNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initName",
            						lv_initName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getInitEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getInitEntityAccess().getEachKeyword_4());
            		
            // InternalBreactive.g:444:3: ( (otherlv_5= RULE_ID ) )
            // InternalBreactive.g:445:4: (otherlv_5= RULE_ID )
            {
            // InternalBreactive.g:445:4: (otherlv_5= RULE_ID )
            // InternalBreactive.g:446:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitEntityRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_5, grammarAccess.getInitEntityAccess().getEntityEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getInitEntityAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBreactive.g:461:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) ) )
            // InternalBreactive.g:462:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) )
            {
            // InternalBreactive.g:462:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?) )
            // InternalBreactive.g:463:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInitEntityAccess().getUnorderedGroup_7());
            				
            // InternalBreactive.g:466:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?)
            // InternalBreactive.g:467:6: ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+ {...}?
            {
            // InternalBreactive.g:467:6: ( ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBreactive.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) )
            	    {
            	    // InternalBreactive.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) ) )
            	    // InternalBreactive.g:469:5: {...}? => ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInitEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalBreactive.g:469:107: ( ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) ) )
            	    // InternalBreactive.g:470:6: ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalBreactive.g:473:9: ({...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) ) )
            	    // InternalBreactive.g:473:10: {...}? => (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInitEntity", "true");
            	    }
            	    // InternalBreactive.g:473:19: (otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) ) )
            	    // InternalBreactive.g:473:20: otherlv_8= 'position =' ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_16); 

            	    									newLeafNode(otherlv_8, grammarAccess.getInitEntityAccess().getPositionKeyword_7_0_0());
            	    								
            	    // InternalBreactive.g:477:9: ( (lv_initialLocation_9_0= ruleLocationNamedFCExpression ) )
            	    // InternalBreactive.g:478:10: (lv_initialLocation_9_0= ruleLocationNamedFCExpression )
            	    {
            	    // InternalBreactive.g:478:10: (lv_initialLocation_9_0= ruleLocationNamedFCExpression )
            	    // InternalBreactive.g:479:11: lv_initialLocation_9_0= ruleLocationNamedFCExpression
            	    {

            	    											newCompositeNode(grammarAccess.getInitEntityAccess().getInitialLocationLocationNamedFCExpressionParserRuleCall_7_0_1_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_initialLocation_9_0=ruleLocationNamedFCExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInitEntityRule());
            	    											}
            	    											set(
            	    												current,
            	    												"initialLocation",
            	    												lv_initialLocation_9_0,
            	    												"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInitEntityAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBreactive.g:502:4: ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) )
            	    {
            	    // InternalBreactive.g:502:4: ({...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ ) )
            	    // InternalBreactive.g:503:5: {...}? => ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInitEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalBreactive.g:503:107: ( ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+ )
            	    // InternalBreactive.g:504:6: ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInitEntityAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalBreactive.g:507:9: ({...}? => ( (lv_assingnments_10_0= ruleAssignment ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalBreactive.g:507:10: {...}? => ( (lv_assingnments_10_0= ruleAssignment ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleInitEntity", "true");
            	    	    }
            	    	    // InternalBreactive.g:507:19: ( (lv_assingnments_10_0= ruleAssignment ) )
            	    	    // InternalBreactive.g:507:20: (lv_assingnments_10_0= ruleAssignment )
            	    	    {
            	    	    // InternalBreactive.g:507:20: (lv_assingnments_10_0= ruleAssignment )
            	    	    // InternalBreactive.g:508:10: lv_assingnments_10_0= ruleAssignment
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getInitEntityAccess().getAssingnmentsAssignmentParserRuleCall_7_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_assingnments_10_0=ruleAssignment();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getInitEntityRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"assingnments",
            	    	    											lv_assingnments_10_0,
            	    	    											"org.cirad.dsl.xtext.Breactive.Assignment");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInitEntityAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInitEntityAccess().getUnorderedGroup_7()) ) {
                throw new FailedPredicateException(input, "ruleInitEntity", "getUnorderedGroupHelper().canLeave(grammarAccess.getInitEntityAccess().getUnorderedGroup_7())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getInitEntityAccess().getUnorderedGroup_7());
            				

            }

            otherlv_11=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getInitEntityAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getInitEntityAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitEntity"


    // $ANTLR start "entryRuleAssignment"
    // InternalBreactive.g:550:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalBreactive.g:550:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalBreactive.g:551:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalBreactive.g:557:1: ruleAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleDeclaredVariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleFunctionCallExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:563:2: ( ( ( (lv_variable_0_0= ruleDeclaredVariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleFunctionCallExpression ) ) ) )
            // InternalBreactive.g:564:2: ( ( (lv_variable_0_0= ruleDeclaredVariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleFunctionCallExpression ) ) )
            {
            // InternalBreactive.g:564:2: ( ( (lv_variable_0_0= ruleDeclaredVariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleFunctionCallExpression ) ) )
            // InternalBreactive.g:565:3: ( (lv_variable_0_0= ruleDeclaredVariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleFunctionCallExpression ) )
            {
            // InternalBreactive.g:565:3: ( (lv_variable_0_0= ruleDeclaredVariable ) )
            // InternalBreactive.g:566:4: (lv_variable_0_0= ruleDeclaredVariable )
            {
            // InternalBreactive.g:566:4: (lv_variable_0_0= ruleDeclaredVariable )
            // InternalBreactive.g:567:5: lv_variable_0_0= ruleDeclaredVariable
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getVariableDeclaredVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_variable_0_0=ruleDeclaredVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1());
            		
            // InternalBreactive.g:588:3: ( (lv_expression_2_0= ruleFunctionCallExpression ) )
            // InternalBreactive.g:589:4: (lv_expression_2_0= ruleFunctionCallExpression )
            {
            // InternalBreactive.g:589:4: (lv_expression_2_0= ruleFunctionCallExpression )
            // InternalBreactive.g:590:5: lv_expression_2_0= ruleFunctionCallExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionFunctionCallExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleFunctionCallExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.cirad.dsl.xtext.Breactive.FunctionCallExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleInitSpace"
    // InternalBreactive.g:611:1: entryRuleInitSpace returns [EObject current=null] : iv_ruleInitSpace= ruleInitSpace EOF ;
    public final EObject entryRuleInitSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSpace = null;


        try {
            // InternalBreactive.g:611:50: (iv_ruleInitSpace= ruleInitSpace EOF )
            // InternalBreactive.g:612:2: iv_ruleInitSpace= ruleInitSpace EOF
            {
             newCompositeNode(grammarAccess.getInitSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitSpace=ruleInitSpace();

            state._fsp--;

             current =iv_ruleInitSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitSpace"


    // $ANTLR start "ruleInitSpace"
    // InternalBreactive.g:618:1: ruleInitSpace returns [EObject current=null] : ( () ( (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression ) ) otherlv_2= '{' otherlv_3= 'each' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_assingnments_6_0= ruleAssignment ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleInitSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_initFunctionCall_1_0 = null;

        EObject lv_assingnments_6_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:624:2: ( ( () ( (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression ) ) otherlv_2= '{' otherlv_3= 'each' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_assingnments_6_0= ruleAssignment ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalBreactive.g:625:2: ( () ( (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression ) ) otherlv_2= '{' otherlv_3= 'each' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_assingnments_6_0= ruleAssignment ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalBreactive.g:625:2: ( () ( (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression ) ) otherlv_2= '{' otherlv_3= 'each' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_assingnments_6_0= ruleAssignment ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalBreactive.g:626:3: () ( (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression ) ) otherlv_2= '{' otherlv_3= 'each' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_assingnments_6_0= ruleAssignment ) )* otherlv_7= '}' otherlv_8= '}'
            {
            // InternalBreactive.g:626:3: ()
            // InternalBreactive.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitSpaceAccess().getInitSpaceAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:633:3: ( (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression ) )
            // InternalBreactive.g:634:4: (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression )
            {
            // InternalBreactive.g:634:4: (lv_initFunctionCall_1_0= ruleSpaceInitFCExpression )
            // InternalBreactive.g:635:5: lv_initFunctionCall_1_0= ruleSpaceInitFCExpression
            {

            					newCompositeNode(grammarAccess.getInitSpaceAccess().getInitFunctionCallSpaceInitFCExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_initFunctionCall_1_0=ruleSpaceInitFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitSpaceRule());
            					}
            					set(
            						current,
            						"initFunctionCall",
            						lv_initFunctionCall_1_0,
            						"org.cirad.dsl.xtext.Breactive.SpaceInitFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getInitSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getInitSpaceAccess().getEachKeyword_3());
            		
            // InternalBreactive.g:660:3: ( (otherlv_4= RULE_ID ) )
            // InternalBreactive.g:661:4: (otherlv_4= RULE_ID )
            {
            // InternalBreactive.g:661:4: (otherlv_4= RULE_ID )
            // InternalBreactive.g:662:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitSpaceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_4, grammarAccess.getInitSpaceAccess().getEntityEntityCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getInitSpaceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBreactive.g:677:3: ( (lv_assingnments_6_0= ruleAssignment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBreactive.g:678:4: (lv_assingnments_6_0= ruleAssignment )
            	    {
            	    // InternalBreactive.g:678:4: (lv_assingnments_6_0= ruleAssignment )
            	    // InternalBreactive.g:679:5: lv_assingnments_6_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getInitSpaceAccess().getAssingnmentsAssignmentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_assingnments_6_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assingnments",
            	    						lv_assingnments_6_0,
            	    						"org.cirad.dsl.xtext.Breactive.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getInitSpaceAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInitSpaceAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitSpace"


    // $ANTLR start "entryRuleParameterClass"
    // InternalBreactive.g:708:1: entryRuleParameterClass returns [EObject current=null] : iv_ruleParameterClass= ruleParameterClass EOF ;
    public final EObject entryRuleParameterClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterClass = null;


        try {
            // InternalBreactive.g:708:55: (iv_ruleParameterClass= ruleParameterClass EOF )
            // InternalBreactive.g:709:2: iv_ruleParameterClass= ruleParameterClass EOF
            {
             newCompositeNode(grammarAccess.getParameterClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterClass=ruleParameterClass();

            state._fsp--;

             current =iv_ruleParameterClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterClass"


    // $ANTLR start "ruleParameterClass"
    // InternalBreactive.g:715:1: ruleParameterClass returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) ) ;
    public final EObject ruleParameterClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:721:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) ) )
            // InternalBreactive.g:722:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) )
            {
            // InternalBreactive.g:722:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) )
            // InternalBreactive.g:723:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) )
            {
            // InternalBreactive.g:723:3: ()
            // InternalBreactive.g:724:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterClassAccess().getParameterClassAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:730:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBreactive.g:731:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBreactive.g:731:4: (lv_name_1_0= RULE_ID )
            // InternalBreactive.g:732:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterClassAccess().getColonKeyword_2());
            		
            // InternalBreactive.g:752:3: ( (lv_type_3_0= ruleTypeEnum ) )
            // InternalBreactive.g:753:4: (lv_type_3_0= ruleTypeEnum )
            {
            // InternalBreactive.g:753:4: (lv_type_3_0= ruleTypeEnum )
            // InternalBreactive.g:754:5: lv_type_3_0= ruleTypeEnum
            {

            					newCompositeNode(grammarAccess.getParameterClassAccess().getTypeTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterClassRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.cirad.dsl.xtext.Breactive.TypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterClass"


    // $ANTLR start "entryRuleAttributeClass"
    // InternalBreactive.g:775:1: entryRuleAttributeClass returns [EObject current=null] : iv_ruleAttributeClass= ruleAttributeClass EOF ;
    public final EObject entryRuleAttributeClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClass = null;


        try {
            // InternalBreactive.g:775:55: (iv_ruleAttributeClass= ruleAttributeClass EOF )
            // InternalBreactive.g:776:2: iv_ruleAttributeClass= ruleAttributeClass EOF
            {
             newCompositeNode(grammarAccess.getAttributeClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeClass=ruleAttributeClass();

            state._fsp--;

             current =iv_ruleAttributeClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeClass"


    // $ANTLR start "ruleAttributeClass"
    // InternalBreactive.g:782:1: ruleAttributeClass returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) ) ;
    public final EObject ruleAttributeClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:788:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) ) )
            // InternalBreactive.g:789:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) )
            {
            // InternalBreactive.g:789:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) ) )
            // InternalBreactive.g:790:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeEnum ) )
            {
            // InternalBreactive.g:790:3: ()
            // InternalBreactive.g:791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeClassAccess().getAttributeClassAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:797:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBreactive.g:798:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBreactive.g:798:4: (lv_name_1_0= RULE_ID )
            // InternalBreactive.g:799:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeClassAccess().getColonKeyword_2());
            		
            // InternalBreactive.g:819:3: ( (lv_type_3_0= ruleTypeEnum ) )
            // InternalBreactive.g:820:4: (lv_type_3_0= ruleTypeEnum )
            {
            // InternalBreactive.g:820:4: (lv_type_3_0= ruleTypeEnum )
            // InternalBreactive.g:821:5: lv_type_3_0= ruleTypeEnum
            {

            					newCompositeNode(grammarAccess.getAttributeClassAccess().getTypeTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeClassRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.cirad.dsl.xtext.Breactive.TypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeClass"


    // $ANTLR start "entryRuleLocalVariableClass"
    // InternalBreactive.g:842:1: entryRuleLocalVariableClass returns [EObject current=null] : iv_ruleLocalVariableClass= ruleLocalVariableClass EOF ;
    public final EObject entryRuleLocalVariableClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableClass = null;


        try {
            // InternalBreactive.g:842:59: (iv_ruleLocalVariableClass= ruleLocalVariableClass EOF )
            // InternalBreactive.g:843:2: iv_ruleLocalVariableClass= ruleLocalVariableClass EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariableClass=ruleLocalVariableClass();

            state._fsp--;

             current =iv_ruleLocalVariableClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariableClass"


    // $ANTLR start "ruleLocalVariableClass"
    // InternalBreactive.g:849:1: ruleLocalVariableClass returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<-' ( (lv_expression_4_0= ruleFunctionCallExpression ) ) ) ;
    public final EObject ruleLocalVariableClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:855:2: ( ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<-' ( (lv_expression_4_0= ruleFunctionCallExpression ) ) ) )
            // InternalBreactive.g:856:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<-' ( (lv_expression_4_0= ruleFunctionCallExpression ) ) )
            {
            // InternalBreactive.g:856:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<-' ( (lv_expression_4_0= ruleFunctionCallExpression ) ) )
            // InternalBreactive.g:857:3: () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<-' ( (lv_expression_4_0= ruleFunctionCallExpression ) )
            {
            // InternalBreactive.g:857:3: ()
            // InternalBreactive.g:858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVariableClassAccess().getLocalVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalVariableClassAccess().getLetKeyword_1());
            		
            // InternalBreactive.g:868:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBreactive.g:869:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBreactive.g:869:4: (lv_name_2_0= RULE_ID )
            // InternalBreactive.g:870:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLocalVariableClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalVariableClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalVariableClassAccess().getLessThanSignHyphenMinusKeyword_3());
            		
            // InternalBreactive.g:890:3: ( (lv_expression_4_0= ruleFunctionCallExpression ) )
            // InternalBreactive.g:891:4: (lv_expression_4_0= ruleFunctionCallExpression )
            {
            // InternalBreactive.g:891:4: (lv_expression_4_0= ruleFunctionCallExpression )
            // InternalBreactive.g:892:5: lv_expression_4_0= ruleFunctionCallExpression
            {

            					newCompositeNode(grammarAccess.getLocalVariableClassAccess().getExpressionFunctionCallExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleFunctionCallExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalVariableClassRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"org.cirad.dsl.xtext.Breactive.FunctionCallExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariableClass"


    // $ANTLR start "entryRuleBehavior"
    // InternalBreactive.g:913:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalBreactive.g:913:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalBreactive.g:914:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalBreactive.g:920:1: ruleBehavior returns [EObject current=null] : (this_EquationBehaviour_0= ruleEquationBehaviour | this_ActivityDiagramBehavior_1= ruleActivityDiagramBehavior | this_ActivityBehavior_2= ruleActivityBehavior ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        EObject this_EquationBehaviour_0 = null;

        EObject this_ActivityDiagramBehavior_1 = null;

        EObject this_ActivityBehavior_2 = null;



        	enterRule();

        try {
            // InternalBreactive.g:926:2: ( (this_EquationBehaviour_0= ruleEquationBehaviour | this_ActivityDiagramBehavior_1= ruleActivityDiagramBehavior | this_ActivityBehavior_2= ruleActivityBehavior ) )
            // InternalBreactive.g:927:2: (this_EquationBehaviour_0= ruleEquationBehaviour | this_ActivityDiagramBehavior_1= ruleActivityDiagramBehavior | this_ActivityBehavior_2= ruleActivityBehavior )
            {
            // InternalBreactive.g:927:2: (this_EquationBehaviour_0= ruleEquationBehaviour | this_ActivityDiagramBehavior_1= ruleActivityDiagramBehavior | this_ActivityBehavior_2= ruleActivityBehavior )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalBreactive.g:928:3: this_EquationBehaviour_0= ruleEquationBehaviour
                    {

                    			newCompositeNode(grammarAccess.getBehaviorAccess().getEquationBehaviourParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EquationBehaviour_0=ruleEquationBehaviour();

                    state._fsp--;


                    			current = this_EquationBehaviour_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:937:3: this_ActivityDiagramBehavior_1= ruleActivityDiagramBehavior
                    {

                    			newCompositeNode(grammarAccess.getBehaviorAccess().getActivityDiagramBehaviorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityDiagramBehavior_1=ruleActivityDiagramBehavior();

                    state._fsp--;


                    			current = this_ActivityDiagramBehavior_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:946:3: this_ActivityBehavior_2= ruleActivityBehavior
                    {

                    			newCompositeNode(grammarAccess.getBehaviorAccess().getActivityBehaviorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityBehavior_2=ruleActivityBehavior();

                    state._fsp--;


                    			current = this_ActivityBehavior_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleNode"
    // InternalBreactive.g:958:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalBreactive.g:958:45: (iv_ruleNode= ruleNode EOF )
            // InternalBreactive.g:959:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalBreactive.g:965:1: ruleNode returns [EObject current=null] : (this_ControlNode_0= ruleControlNode | this_ExcecutableNode_1= ruleExcecutableNode | this_DeclaredBehavior_2= ruleDeclaredBehavior ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_ControlNode_0 = null;

        EObject this_ExcecutableNode_1 = null;

        EObject this_DeclaredBehavior_2 = null;



        	enterRule();

        try {
            // InternalBreactive.g:971:2: ( (this_ControlNode_0= ruleControlNode | this_ExcecutableNode_1= ruleExcecutableNode | this_DeclaredBehavior_2= ruleDeclaredBehavior ) )
            // InternalBreactive.g:972:2: (this_ControlNode_0= ruleControlNode | this_ExcecutableNode_1= ruleExcecutableNode | this_DeclaredBehavior_2= ruleDeclaredBehavior )
            {
            // InternalBreactive.g:972:2: (this_ControlNode_0= ruleControlNode | this_ExcecutableNode_1= ruleExcecutableNode | this_DeclaredBehavior_2= ruleDeclaredBehavior )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 84:
            case 85:
            case 89:
            case 91:
            case 93:
            case 94:
                {
                alt13=1;
                }
                break;
            case 95:
            case 96:
            case 97:
            case 101:
            case 103:
            case 104:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBreactive.g:973:3: this_ControlNode_0= ruleControlNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getControlNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlNode_0=ruleControlNode();

                    state._fsp--;


                    			current = this_ControlNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:982:3: this_ExcecutableNode_1= ruleExcecutableNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getExcecutableNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExcecutableNode_1=ruleExcecutableNode();

                    state._fsp--;


                    			current = this_ExcecutableNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:991:3: this_DeclaredBehavior_2= ruleDeclaredBehavior
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getDeclaredBehaviorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredBehavior_2=ruleDeclaredBehavior();

                    state._fsp--;


                    			current = this_DeclaredBehavior_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleControlNode"
    // InternalBreactive.g:1003:1: entryRuleControlNode returns [EObject current=null] : iv_ruleControlNode= ruleControlNode EOF ;
    public final EObject entryRuleControlNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlNode = null;


        try {
            // InternalBreactive.g:1003:52: (iv_ruleControlNode= ruleControlNode EOF )
            // InternalBreactive.g:1004:2: iv_ruleControlNode= ruleControlNode EOF
            {
             newCompositeNode(grammarAccess.getControlNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlNode=ruleControlNode();

            state._fsp--;

             current =iv_ruleControlNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlNode"


    // $ANTLR start "ruleControlNode"
    // InternalBreactive.g:1010:1: ruleControlNode returns [EObject current=null] : (this_Decision_0= ruleDecision | this_Join_1= ruleJoin | this_Start_2= ruleStart | this_End_3= ruleEnd | this_Fork_4= ruleFork | this_Merge_5= ruleMerge ) ;
    public final EObject ruleControlNode() throws RecognitionException {
        EObject current = null;

        EObject this_Decision_0 = null;

        EObject this_Join_1 = null;

        EObject this_Start_2 = null;

        EObject this_End_3 = null;

        EObject this_Fork_4 = null;

        EObject this_Merge_5 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1016:2: ( (this_Decision_0= ruleDecision | this_Join_1= ruleJoin | this_Start_2= ruleStart | this_End_3= ruleEnd | this_Fork_4= ruleFork | this_Merge_5= ruleMerge ) )
            // InternalBreactive.g:1017:2: (this_Decision_0= ruleDecision | this_Join_1= ruleJoin | this_Start_2= ruleStart | this_End_3= ruleEnd | this_Fork_4= ruleFork | this_Merge_5= ruleMerge )
            {
            // InternalBreactive.g:1017:2: (this_Decision_0= ruleDecision | this_Join_1= ruleJoin | this_Start_2= ruleStart | this_End_3= ruleEnd | this_Fork_4= ruleFork | this_Merge_5= ruleMerge )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt14=1;
                }
                break;
            case 91:
                {
                alt14=2;
                }
                break;
            case 84:
                {
                alt14=3;
                }
                break;
            case 85:
                {
                alt14=4;
                }
                break;
            case 93:
                {
                alt14=5;
                }
                break;
            case 94:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBreactive.g:1018:3: this_Decision_0= ruleDecision
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getDecisionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decision_0=ruleDecision();

                    state._fsp--;


                    			current = this_Decision_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:1027:3: this_Join_1= ruleJoin
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getJoinParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Join_1=ruleJoin();

                    state._fsp--;


                    			current = this_Join_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:1036:3: this_Start_2= ruleStart
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getStartParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Start_2=ruleStart();

                    state._fsp--;


                    			current = this_Start_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:1045:3: this_End_3= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getEndParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_3=ruleEnd();

                    state._fsp--;


                    			current = this_End_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBreactive.g:1054:3: this_Fork_4= ruleFork
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getForkParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fork_4=ruleFork();

                    state._fsp--;


                    			current = this_Fork_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBreactive.g:1063:3: this_Merge_5= ruleMerge
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getMergeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Merge_5=ruleMerge();

                    state._fsp--;


                    			current = this_Merge_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlNode"


    // $ANTLR start "entryRuleExcecutableNode"
    // InternalBreactive.g:1075:1: entryRuleExcecutableNode returns [EObject current=null] : iv_ruleExcecutableNode= ruleExcecutableNode EOF ;
    public final EObject entryRuleExcecutableNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExcecutableNode = null;


        try {
            // InternalBreactive.g:1075:56: (iv_ruleExcecutableNode= ruleExcecutableNode EOF )
            // InternalBreactive.g:1076:2: iv_ruleExcecutableNode= ruleExcecutableNode EOF
            {
             newCompositeNode(grammarAccess.getExcecutableNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExcecutableNode=ruleExcecutableNode();

            state._fsp--;

             current =iv_ruleExcecutableNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExcecutableNode"


    // $ANTLR start "ruleExcecutableNode"
    // InternalBreactive.g:1082:1: ruleExcecutableNode returns [EObject current=null] : this_PrimitiveActivities_0= rulePrimitiveActivities ;
    public final EObject ruleExcecutableNode() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveActivities_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1088:2: (this_PrimitiveActivities_0= rulePrimitiveActivities )
            // InternalBreactive.g:1089:2: this_PrimitiveActivities_0= rulePrimitiveActivities
            {

            		newCompositeNode(grammarAccess.getExcecutableNodeAccess().getPrimitiveActivitiesParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PrimitiveActivities_0=rulePrimitiveActivities();

            state._fsp--;


            		current = this_PrimitiveActivities_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExcecutableNode"


    // $ANTLR start "entryRulePrimitiveActivities"
    // InternalBreactive.g:1100:1: entryRulePrimitiveActivities returns [EObject current=null] : iv_rulePrimitiveActivities= rulePrimitiveActivities EOF ;
    public final EObject entryRulePrimitiveActivities() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveActivities = null;


        try {
            // InternalBreactive.g:1100:60: (iv_rulePrimitiveActivities= rulePrimitiveActivities EOF )
            // InternalBreactive.g:1101:2: iv_rulePrimitiveActivities= rulePrimitiveActivities EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveActivitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveActivities=rulePrimitiveActivities();

            state._fsp--;

             current =iv_rulePrimitiveActivities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveActivities"


    // $ANTLR start "rulePrimitiveActivities"
    // InternalBreactive.g:1107:1: rulePrimitiveActivities returns [EObject current=null] : (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Move_2= ruleMove | this_Reproduce_3= ruleReproduce | this_Die_4= ruleDie | this_Set_5= ruleSet ) ;
    public final EObject rulePrimitiveActivities() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Remove_1 = null;

        EObject this_Move_2 = null;

        EObject this_Reproduce_3 = null;

        EObject this_Die_4 = null;

        EObject this_Set_5 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1113:2: ( (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Move_2= ruleMove | this_Reproduce_3= ruleReproduce | this_Die_4= ruleDie | this_Set_5= ruleSet ) )
            // InternalBreactive.g:1114:2: (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Move_2= ruleMove | this_Reproduce_3= ruleReproduce | this_Die_4= ruleDie | this_Set_5= ruleSet )
            {
            // InternalBreactive.g:1114:2: (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Move_2= ruleMove | this_Reproduce_3= ruleReproduce | this_Die_4= ruleDie | this_Set_5= ruleSet )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt15=1;
                }
                break;
            case 103:
                {
                alt15=2;
                }
                break;
            case 95:
                {
                alt15=3;
                }
                break;
            case 97:
                {
                alt15=4;
                }
                break;
            case 96:
                {
                alt15=5;
                }
                break;
            case 104:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBreactive.g:1115:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveActivitiesAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:1124:3: this_Remove_1= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveActivitiesAccess().getRemoveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_1=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:1133:3: this_Move_2= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveActivitiesAccess().getMoveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_2=ruleMove();

                    state._fsp--;


                    			current = this_Move_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:1142:3: this_Reproduce_3= ruleReproduce
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveActivitiesAccess().getReproduceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reproduce_3=ruleReproduce();

                    state._fsp--;


                    			current = this_Reproduce_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBreactive.g:1151:3: this_Die_4= ruleDie
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveActivitiesAccess().getDieParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Die_4=ruleDie();

                    state._fsp--;


                    			current = this_Die_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBreactive.g:1160:3: this_Set_5= ruleSet
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveActivitiesAccess().getSetParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Set_5=ruleSet();

                    state._fsp--;


                    			current = this_Set_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveActivities"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBreactive.g:1172:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBreactive.g:1172:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBreactive.g:1173:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBreactive.g:1179:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBreactive.g:1185:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBreactive.g:1186:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBreactive.g:1186:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBreactive.g:1187:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBreactive.g:1194:3: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBreactive.g:1195:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEquationBehaviour"
    // InternalBreactive.g:1212:1: entryRuleEquationBehaviour returns [EObject current=null] : iv_ruleEquationBehaviour= ruleEquationBehaviour EOF ;
    public final EObject entryRuleEquationBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquationBehaviour = null;


        try {
            // InternalBreactive.g:1212:58: (iv_ruleEquationBehaviour= ruleEquationBehaviour EOF )
            // InternalBreactive.g:1213:2: iv_ruleEquationBehaviour= ruleEquationBehaviour EOF
            {
             newCompositeNode(grammarAccess.getEquationBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquationBehaviour=ruleEquationBehaviour();

            state._fsp--;

             current =iv_ruleEquationBehaviour; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquationBehaviour"


    // $ANTLR start "ruleEquationBehaviour"
    // InternalBreactive.g:1219:1: ruleEquationBehaviour returns [EObject current=null] : ( () otherlv_1= 'EquationBehaviour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' ) ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? otherlv_12= 'Equation' otherlv_13= '{' ( (lv_equation_14_0= ruleEquation ) ) otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleEquationBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_localvariable_10_0 = null;

        EObject lv_localvariable_11_0 = null;

        EObject lv_equation_14_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1225:2: ( ( () otherlv_1= 'EquationBehaviour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' ) ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? otherlv_12= 'Equation' otherlv_13= '{' ( (lv_equation_14_0= ruleEquation ) ) otherlv_15= '}' otherlv_16= '}' ) )
            // InternalBreactive.g:1226:2: ( () otherlv_1= 'EquationBehaviour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' ) ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? otherlv_12= 'Equation' otherlv_13= '{' ( (lv_equation_14_0= ruleEquation ) ) otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalBreactive.g:1226:2: ( () otherlv_1= 'EquationBehaviour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' ) ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? otherlv_12= 'Equation' otherlv_13= '{' ( (lv_equation_14_0= ruleEquation ) ) otherlv_15= '}' otherlv_16= '}' )
            // InternalBreactive.g:1227:3: () otherlv_1= 'EquationBehaviour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' ) ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? otherlv_12= 'Equation' otherlv_13= '{' ( (lv_equation_14_0= ruleEquation ) ) otherlv_15= '}' otherlv_16= '}'
            {
            // InternalBreactive.g:1227:3: ()
            // InternalBreactive.g:1228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEquationBehaviourAccess().getEquationBehaviorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationBehaviourAccess().getEquationBehaviourKeyword_1());
            		
            // InternalBreactive.g:1238:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBreactive.g:1239:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBreactive.g:1239:4: (lv_name_2_0= RULE_ID )
            // InternalBreactive.g:1240:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEquationBehaviourAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquationBehaviourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getEquationBehaviourAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBreactive.g:1260:3: (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )
            // InternalBreactive.g:1261:4: otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')'
            {
            otherlv_4=(Token)match(input,27,FOLLOW_26); 

            				newLeafNode(otherlv_4, grammarAccess.getEquationBehaviourAccess().getParametersKeyword_4_0());
            			
            otherlv_5=(Token)match(input,28,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getEquationBehaviourAccess().getLeftParenthesisKeyword_4_1());
            			
            // InternalBreactive.g:1269:4: ( (lv_parameters_6_0= ruleParameterClass ) )
            // InternalBreactive.g:1270:5: (lv_parameters_6_0= ruleParameterClass )
            {
            // InternalBreactive.g:1270:5: (lv_parameters_6_0= ruleParameterClass )
            // InternalBreactive.g:1271:6: lv_parameters_6_0= ruleParameterClass
            {

            						newCompositeNode(grammarAccess.getEquationBehaviourAccess().getParametersParameterClassParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_27);
            lv_parameters_6_0=ruleParameterClass();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEquationBehaviourRule());
            						}
            						add(
            							current,
            							"parameters",
            							lv_parameters_6_0,
            							"org.cirad.dsl.xtext.Breactive.ParameterClass");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBreactive.g:1288:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBreactive.g:1289:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getEquationBehaviourAccess().getCommaKeyword_4_3_0());
            	    				
            	    // InternalBreactive.g:1293:5: ( (lv_parameters_8_0= ruleParameterClass ) )
            	    // InternalBreactive.g:1294:6: (lv_parameters_8_0= ruleParameterClass )
            	    {
            	    // InternalBreactive.g:1294:6: (lv_parameters_8_0= ruleParameterClass )
            	    // InternalBreactive.g:1295:7: lv_parameters_8_0= ruleParameterClass
            	    {

            	    							newCompositeNode(grammarAccess.getEquationBehaviourAccess().getParametersParameterClassParserRuleCall_4_3_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_parameters_8_0=ruleParameterClass();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEquationBehaviourRule());
            	    							}
            	    							add(
            	    								current,
            	    								"parameters",
            	    								lv_parameters_8_0,
            	    								"org.cirad.dsl.xtext.Breactive.ParameterClass");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_28); 

            				newLeafNode(otherlv_9, grammarAccess.getEquationBehaviourAccess().getRightParenthesisKeyword_4_4());
            			

            }

            // InternalBreactive.g:1318:3: ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBreactive.g:1319:4: ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )*
                    {
                    // InternalBreactive.g:1319:4: ( (lv_localvariable_10_0= ruleLocalVariableClass ) )
                    // InternalBreactive.g:1320:5: (lv_localvariable_10_0= ruleLocalVariableClass )
                    {
                    // InternalBreactive.g:1320:5: (lv_localvariable_10_0= ruleLocalVariableClass )
                    // InternalBreactive.g:1321:6: lv_localvariable_10_0= ruleLocalVariableClass
                    {

                    						newCompositeNode(grammarAccess.getEquationBehaviourAccess().getLocalvariableLocalVariableClassParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_localvariable_10_0=ruleLocalVariableClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEquationBehaviourRule());
                    						}
                    						add(
                    							current,
                    							"localvariable",
                    							lv_localvariable_10_0,
                    							"org.cirad.dsl.xtext.Breactive.LocalVariableClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:1338:4: ( (lv_localvariable_11_0= ruleLocalVariableClass ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBreactive.g:1339:5: (lv_localvariable_11_0= ruleLocalVariableClass )
                    	    {
                    	    // InternalBreactive.g:1339:5: (lv_localvariable_11_0= ruleLocalVariableClass )
                    	    // InternalBreactive.g:1340:6: lv_localvariable_11_0= ruleLocalVariableClass
                    	    {

                    	    						newCompositeNode(grammarAccess.getEquationBehaviourAccess().getLocalvariableLocalVariableClassParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_localvariable_11_0=ruleLocalVariableClass();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEquationBehaviourRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localvariable",
                    	    							lv_localvariable_11_0,
                    	    							"org.cirad.dsl.xtext.Breactive.LocalVariableClass");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getEquationBehaviourAccess().getEquationKeyword_6());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_13, grammarAccess.getEquationBehaviourAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalBreactive.g:1366:3: ( (lv_equation_14_0= ruleEquation ) )
            // InternalBreactive.g:1367:4: (lv_equation_14_0= ruleEquation )
            {
            // InternalBreactive.g:1367:4: (lv_equation_14_0= ruleEquation )
            // InternalBreactive.g:1368:5: lv_equation_14_0= ruleEquation
            {

            					newCompositeNode(grammarAccess.getEquationBehaviourAccess().getEquationEquationParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_equation_14_0=ruleEquation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationBehaviourRule());
            					}
            					set(
            						current,
            						"equation",
            						lv_equation_14_0,
            						"org.cirad.dsl.xtext.Breactive.Equation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getEquationBehaviourAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEquationBehaviourAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquationBehaviour"


    // $ANTLR start "entryRuleActivityBehavior"
    // InternalBreactive.g:1397:1: entryRuleActivityBehavior returns [EObject current=null] : iv_ruleActivityBehavior= ruleActivityBehavior EOF ;
    public final EObject entryRuleActivityBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityBehavior = null;


        try {
            // InternalBreactive.g:1397:57: (iv_ruleActivityBehavior= ruleActivityBehavior EOF )
            // InternalBreactive.g:1398:2: iv_ruleActivityBehavior= ruleActivityBehavior EOF
            {
             newCompositeNode(grammarAccess.getActivityBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityBehavior=ruleActivityBehavior();

            state._fsp--;

             current =iv_ruleActivityBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityBehavior"


    // $ANTLR start "ruleActivityBehavior"
    // InternalBreactive.g:1404:1: ruleActivityBehavior returns [EObject current=null] : ( () otherlv_1= 'ActivityBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) ) ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleActivityBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_localvariable_10_0 = null;

        EObject lv_localvariable_11_0 = null;

        EObject lv_primitiveaactivities_12_0 = null;

        EObject lv_primitiveaactivities_13_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1410:2: ( ( () otherlv_1= 'ActivityBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) ) ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )* )? otherlv_14= '}' ) )
            // InternalBreactive.g:1411:2: ( () otherlv_1= 'ActivityBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) ) ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )* )? otherlv_14= '}' )
            {
            // InternalBreactive.g:1411:2: ( () otherlv_1= 'ActivityBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) ) ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )* )? otherlv_14= '}' )
            // InternalBreactive.g:1412:3: () otherlv_1= 'ActivityBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) ) ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )* )? otherlv_14= '}'
            {
            // InternalBreactive.g:1412:3: ()
            // InternalBreactive.g:1413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityBehaviorAccess().getActivityBehaviorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityBehaviorAccess().getActivityBehaviorKeyword_1());
            		
            // InternalBreactive.g:1423:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBreactive.g:1424:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBreactive.g:1424:4: (lv_name_2_0= RULE_ID )
            // InternalBreactive.g:1425:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActivityBehaviorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityBehaviorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityBehaviorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBreactive.g:1445:3: (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBreactive.g:1446:4: otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityBehaviorAccess().getParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityBehaviorAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBreactive.g:1454:4: ( (lv_parameters_6_0= ruleParameterClass ) )
                    // InternalBreactive.g:1455:5: (lv_parameters_6_0= ruleParameterClass )
                    {
                    // InternalBreactive.g:1455:5: (lv_parameters_6_0= ruleParameterClass )
                    // InternalBreactive.g:1456:6: lv_parameters_6_0= ruleParameterClass
                    {

                    						newCompositeNode(grammarAccess.getActivityBehaviorAccess().getParametersParameterClassParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_parameters_6_0=ruleParameterClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityBehaviorRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"org.cirad.dsl.xtext.Breactive.ParameterClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:1473:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalBreactive.g:1474:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActivityBehaviorAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBreactive.g:1478:5: ( (lv_parameters_8_0= ruleParameterClass ) )
                    	    // InternalBreactive.g:1479:6: (lv_parameters_8_0= ruleParameterClass )
                    	    {
                    	    // InternalBreactive.g:1479:6: (lv_parameters_8_0= ruleParameterClass )
                    	    // InternalBreactive.g:1480:7: lv_parameters_8_0= ruleParameterClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityBehaviorAccess().getParametersParameterClassParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_parameters_8_0=ruleParameterClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityBehaviorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"org.cirad.dsl.xtext.Breactive.ParameterClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityBehaviorAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBreactive.g:1503:3: ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBreactive.g:1504:4: ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )*
                    {
                    // InternalBreactive.g:1504:4: ( (lv_localvariable_10_0= ruleLocalVariableClass ) )
                    // InternalBreactive.g:1505:5: (lv_localvariable_10_0= ruleLocalVariableClass )
                    {
                    // InternalBreactive.g:1505:5: (lv_localvariable_10_0= ruleLocalVariableClass )
                    // InternalBreactive.g:1506:6: lv_localvariable_10_0= ruleLocalVariableClass
                    {

                    						newCompositeNode(grammarAccess.getActivityBehaviorAccess().getLocalvariableLocalVariableClassParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_localvariable_10_0=ruleLocalVariableClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityBehaviorRule());
                    						}
                    						add(
                    							current,
                    							"localvariable",
                    							lv_localvariable_10_0,
                    							"org.cirad.dsl.xtext.Breactive.LocalVariableClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:1523:4: ( (lv_localvariable_11_0= ruleLocalVariableClass ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==23) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalBreactive.g:1524:5: (lv_localvariable_11_0= ruleLocalVariableClass )
                    	    {
                    	    // InternalBreactive.g:1524:5: (lv_localvariable_11_0= ruleLocalVariableClass )
                    	    // InternalBreactive.g:1525:6: lv_localvariable_11_0= ruleLocalVariableClass
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityBehaviorAccess().getLocalvariableLocalVariableClassParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_localvariable_11_0=ruleLocalVariableClass();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityBehaviorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localvariable",
                    	    							lv_localvariable_11_0,
                    	    							"org.cirad.dsl.xtext.Breactive.LocalVariableClass");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBreactive.g:1543:3: ( ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) ) ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=95 && LA25_0<=97)||LA25_0==101||(LA25_0>=103 && LA25_0<=104)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBreactive.g:1544:4: ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) ) ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )*
                    {
                    // InternalBreactive.g:1544:4: ( (lv_primitiveaactivities_12_0= rulePrimitiveActivities ) )
                    // InternalBreactive.g:1545:5: (lv_primitiveaactivities_12_0= rulePrimitiveActivities )
                    {
                    // InternalBreactive.g:1545:5: (lv_primitiveaactivities_12_0= rulePrimitiveActivities )
                    // InternalBreactive.g:1546:6: lv_primitiveaactivities_12_0= rulePrimitiveActivities
                    {

                    						newCompositeNode(grammarAccess.getActivityBehaviorAccess().getPrimitiveaactivitiesPrimitiveActivitiesParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_primitiveaactivities_12_0=rulePrimitiveActivities();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityBehaviorRule());
                    						}
                    						add(
                    							current,
                    							"primitiveaactivities",
                    							lv_primitiveaactivities_12_0,
                    							"org.cirad.dsl.xtext.Breactive.PrimitiveActivities");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:1563:4: ( (lv_primitiveaactivities_13_0= rulePrimitiveActivities ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=95 && LA24_0<=97)||LA24_0==101||(LA24_0>=103 && LA24_0<=104)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalBreactive.g:1564:5: (lv_primitiveaactivities_13_0= rulePrimitiveActivities )
                    	    {
                    	    // InternalBreactive.g:1564:5: (lv_primitiveaactivities_13_0= rulePrimitiveActivities )
                    	    // InternalBreactive.g:1565:6: lv_primitiveaactivities_13_0= rulePrimitiveActivities
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityBehaviorAccess().getPrimitiveaactivitiesPrimitiveActivitiesParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_primitiveaactivities_13_0=rulePrimitiveActivities();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityBehaviorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"primitiveaactivities",
                    	    							lv_primitiveaactivities_13_0,
                    	    							"org.cirad.dsl.xtext.Breactive.PrimitiveActivities");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getActivityBehaviorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityBehavior"


    // $ANTLR start "entryRuleActivityDiagramBehavior"
    // InternalBreactive.g:1591:1: entryRuleActivityDiagramBehavior returns [EObject current=null] : iv_ruleActivityDiagramBehavior= ruleActivityDiagramBehavior EOF ;
    public final EObject entryRuleActivityDiagramBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityDiagramBehavior = null;


        try {
            // InternalBreactive.g:1591:64: (iv_ruleActivityDiagramBehavior= ruleActivityDiagramBehavior EOF )
            // InternalBreactive.g:1592:2: iv_ruleActivityDiagramBehavior= ruleActivityDiagramBehavior EOF
            {
             newCompositeNode(grammarAccess.getActivityDiagramBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityDiagramBehavior=ruleActivityDiagramBehavior();

            state._fsp--;

             current =iv_ruleActivityDiagramBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityDiagramBehavior"


    // $ANTLR start "ruleActivityDiagramBehavior"
    // InternalBreactive.g:1598:1: ruleActivityDiagramBehavior returns [EObject current=null] : ( () otherlv_1= 'ActivityDiagramBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( (lv_start_12_0= ruleStart ) ) otherlv_13= '}' ) ;
    public final EObject ruleActivityDiagramBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_localvariable_10_0 = null;

        EObject lv_localvariable_11_0 = null;

        EObject lv_start_12_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1604:2: ( ( () otherlv_1= 'ActivityDiagramBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( (lv_start_12_0= ruleStart ) ) otherlv_13= '}' ) )
            // InternalBreactive.g:1605:2: ( () otherlv_1= 'ActivityDiagramBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( (lv_start_12_0= ruleStart ) ) otherlv_13= '}' )
            {
            // InternalBreactive.g:1605:2: ( () otherlv_1= 'ActivityDiagramBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( (lv_start_12_0= ruleStart ) ) otherlv_13= '}' )
            // InternalBreactive.g:1606:3: () otherlv_1= 'ActivityDiagramBehavior' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )? ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )? ( (lv_start_12_0= ruleStart ) ) otherlv_13= '}'
            {
            // InternalBreactive.g:1606:3: ()
            // InternalBreactive.g:1607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityDiagramBehaviorAccess().getActivityDiagramBehaviorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityDiagramBehaviorAccess().getActivityDiagramBehaviorKeyword_1());
            		
            // InternalBreactive.g:1617:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBreactive.g:1618:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBreactive.g:1618:4: (lv_name_2_0= RULE_ID )
            // InternalBreactive.g:1619:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActivityDiagramBehaviorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityDiagramBehaviorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityDiagramBehaviorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBreactive.g:1639:3: (otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBreactive.g:1640:4: otherlv_4= 'Parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterClass ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityDiagramBehaviorAccess().getParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityDiagramBehaviorAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBreactive.g:1648:4: ( (lv_parameters_6_0= ruleParameterClass ) )
                    // InternalBreactive.g:1649:5: (lv_parameters_6_0= ruleParameterClass )
                    {
                    // InternalBreactive.g:1649:5: (lv_parameters_6_0= ruleParameterClass )
                    // InternalBreactive.g:1650:6: lv_parameters_6_0= ruleParameterClass
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramBehaviorAccess().getParametersParameterClassParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_parameters_6_0=ruleParameterClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramBehaviorRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"org.cirad.dsl.xtext.Breactive.ParameterClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:1667:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==17) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalBreactive.g:1668:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterClass ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActivityDiagramBehaviorAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBreactive.g:1672:5: ( (lv_parameters_8_0= ruleParameterClass ) )
                    	    // InternalBreactive.g:1673:6: (lv_parameters_8_0= ruleParameterClass )
                    	    {
                    	    // InternalBreactive.g:1673:6: (lv_parameters_8_0= ruleParameterClass )
                    	    // InternalBreactive.g:1674:7: lv_parameters_8_0= ruleParameterClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityDiagramBehaviorAccess().getParametersParameterClassParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_parameters_8_0=ruleParameterClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityDiagramBehaviorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"org.cirad.dsl.xtext.Breactive.ParameterClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityDiagramBehaviorAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBreactive.g:1697:3: ( ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBreactive.g:1698:4: ( (lv_localvariable_10_0= ruleLocalVariableClass ) ) ( (lv_localvariable_11_0= ruleLocalVariableClass ) )*
                    {
                    // InternalBreactive.g:1698:4: ( (lv_localvariable_10_0= ruleLocalVariableClass ) )
                    // InternalBreactive.g:1699:5: (lv_localvariable_10_0= ruleLocalVariableClass )
                    {
                    // InternalBreactive.g:1699:5: (lv_localvariable_10_0= ruleLocalVariableClass )
                    // InternalBreactive.g:1700:6: lv_localvariable_10_0= ruleLocalVariableClass
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramBehaviorAccess().getLocalvariableLocalVariableClassParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_localvariable_10_0=ruleLocalVariableClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramBehaviorRule());
                    						}
                    						add(
                    							current,
                    							"localvariable",
                    							lv_localvariable_10_0,
                    							"org.cirad.dsl.xtext.Breactive.LocalVariableClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:1717:4: ( (lv_localvariable_11_0= ruleLocalVariableClass ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==23) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalBreactive.g:1718:5: (lv_localvariable_11_0= ruleLocalVariableClass )
                    	    {
                    	    // InternalBreactive.g:1718:5: (lv_localvariable_11_0= ruleLocalVariableClass )
                    	    // InternalBreactive.g:1719:6: lv_localvariable_11_0= ruleLocalVariableClass
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityDiagramBehaviorAccess().getLocalvariableLocalVariableClassParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_localvariable_11_0=ruleLocalVariableClass();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityDiagramBehaviorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localvariable",
                    	    							lv_localvariable_11_0,
                    	    							"org.cirad.dsl.xtext.Breactive.LocalVariableClass");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBreactive.g:1737:3: ( (lv_start_12_0= ruleStart ) )
            // InternalBreactive.g:1738:4: (lv_start_12_0= ruleStart )
            {
            // InternalBreactive.g:1738:4: (lv_start_12_0= ruleStart )
            // InternalBreactive.g:1739:5: lv_start_12_0= ruleStart
            {

            					newCompositeNode(grammarAccess.getActivityDiagramBehaviorAccess().getStartStartParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_start_12_0=ruleStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityDiagramBehaviorRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_12_0,
            						"org.cirad.dsl.xtext.Breactive.Start");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getActivityDiagramBehaviorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityDiagramBehavior"


    // $ANTLR start "entryRuleEquation"
    // InternalBreactive.g:1764:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalBreactive.g:1764:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalBreactive.g:1765:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalBreactive.g:1771:1: ruleEquation returns [EObject current=null] : ( ( (lv_left_0_0= ruleDeclaredAttributes ) ) otherlv_1= '=' ( (lv_right_2_0= ruleArithmeticFCExpression ) ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1777:2: ( ( ( (lv_left_0_0= ruleDeclaredAttributes ) ) otherlv_1= '=' ( (lv_right_2_0= ruleArithmeticFCExpression ) ) ) )
            // InternalBreactive.g:1778:2: ( ( (lv_left_0_0= ruleDeclaredAttributes ) ) otherlv_1= '=' ( (lv_right_2_0= ruleArithmeticFCExpression ) ) )
            {
            // InternalBreactive.g:1778:2: ( ( (lv_left_0_0= ruleDeclaredAttributes ) ) otherlv_1= '=' ( (lv_right_2_0= ruleArithmeticFCExpression ) ) )
            // InternalBreactive.g:1779:3: ( (lv_left_0_0= ruleDeclaredAttributes ) ) otherlv_1= '=' ( (lv_right_2_0= ruleArithmeticFCExpression ) )
            {
            // InternalBreactive.g:1779:3: ( (lv_left_0_0= ruleDeclaredAttributes ) )
            // InternalBreactive.g:1780:4: (lv_left_0_0= ruleDeclaredAttributes )
            {
            // InternalBreactive.g:1780:4: (lv_left_0_0= ruleDeclaredAttributes )
            // InternalBreactive.g:1781:5: lv_left_0_0= ruleDeclaredAttributes
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getLeftDeclaredAttributesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_left_0_0=ruleDeclaredAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
            		
            // InternalBreactive.g:1802:3: ( (lv_right_2_0= ruleArithmeticFCExpression ) )
            // InternalBreactive.g:1803:4: (lv_right_2_0= ruleArithmeticFCExpression )
            {
            // InternalBreactive.g:1803:4: (lv_right_2_0= ruleArithmeticFCExpression )
            // InternalBreactive.g:1804:5: lv_right_2_0= ruleArithmeticFCExpression
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getRightArithmeticFCExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleArithmeticFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.cirad.dsl.xtext.Breactive.ArithmeticFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleArithmeticFunction"
    // InternalBreactive.g:1825:1: entryRuleArithmeticFunction returns [EObject current=null] : iv_ruleArithmeticFunction= ruleArithmeticFunction EOF ;
    public final EObject entryRuleArithmeticFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticFunction = null;


        try {
            // InternalBreactive.g:1825:59: (iv_ruleArithmeticFunction= ruleArithmeticFunction EOF )
            // InternalBreactive.g:1826:2: iv_ruleArithmeticFunction= ruleArithmeticFunction EOF
            {
             newCompositeNode(grammarAccess.getArithmeticFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticFunction=ruleArithmeticFunction();

            state._fsp--;

             current =iv_ruleArithmeticFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticFunction"


    // $ANTLR start "ruleArithmeticFunction"
    // InternalBreactive.g:1832:1: ruleArithmeticFunction returns [EObject current=null] : (this_ArithmeticFunctionMultiplication_0= ruleArithmeticFunctionMultiplication | this_ArithmeticFunctionPlus_1= ruleArithmeticFunctionPlus ) ;
    public final EObject ruleArithmeticFunction() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticFunctionMultiplication_0 = null;

        EObject this_ArithmeticFunctionPlus_1 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1838:2: ( (this_ArithmeticFunctionMultiplication_0= ruleArithmeticFunctionMultiplication | this_ArithmeticFunctionPlus_1= ruleArithmeticFunctionPlus ) )
            // InternalBreactive.g:1839:2: (this_ArithmeticFunctionMultiplication_0= ruleArithmeticFunctionMultiplication | this_ArithmeticFunctionPlus_1= ruleArithmeticFunctionPlus )
            {
            // InternalBreactive.g:1839:2: (this_ArithmeticFunctionMultiplication_0= ruleArithmeticFunctionMultiplication | this_ArithmeticFunctionPlus_1= ruleArithmeticFunctionPlus )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=34 && LA30_0<=35)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=36 && LA30_0<=37)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalBreactive.g:1840:3: this_ArithmeticFunctionMultiplication_0= ruleArithmeticFunctionMultiplication
                    {

                    			newCompositeNode(grammarAccess.getArithmeticFunctionAccess().getArithmeticFunctionMultiplicationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticFunctionMultiplication_0=ruleArithmeticFunctionMultiplication();

                    state._fsp--;


                    			current = this_ArithmeticFunctionMultiplication_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:1849:3: this_ArithmeticFunctionPlus_1= ruleArithmeticFunctionPlus
                    {

                    			newCompositeNode(grammarAccess.getArithmeticFunctionAccess().getArithmeticFunctionPlusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticFunctionPlus_1=ruleArithmeticFunctionPlus();

                    state._fsp--;


                    			current = this_ArithmeticFunctionPlus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticFunction"


    // $ANTLR start "entryRuleArithmeticFunctionMultiplication"
    // InternalBreactive.g:1861:1: entryRuleArithmeticFunctionMultiplication returns [EObject current=null] : iv_ruleArithmeticFunctionMultiplication= ruleArithmeticFunctionMultiplication EOF ;
    public final EObject entryRuleArithmeticFunctionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticFunctionMultiplication = null;


        try {
            // InternalBreactive.g:1861:73: (iv_ruleArithmeticFunctionMultiplication= ruleArithmeticFunctionMultiplication EOF )
            // InternalBreactive.g:1862:2: iv_ruleArithmeticFunctionMultiplication= ruleArithmeticFunctionMultiplication EOF
            {
             newCompositeNode(grammarAccess.getArithmeticFunctionMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticFunctionMultiplication=ruleArithmeticFunctionMultiplication();

            state._fsp--;

             current =iv_ruleArithmeticFunctionMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticFunctionMultiplication"


    // $ANTLR start "ruleArithmeticFunctionMultiplication"
    // InternalBreactive.g:1868:1: ruleArithmeticFunctionMultiplication returns [EObject current=null] : ( ( (lv_name_0_1= '+' | lv_name_0_2= '-' ) ) ) ;
    public final EObject ruleArithmeticFunctionMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalBreactive.g:1874:2: ( ( ( (lv_name_0_1= '+' | lv_name_0_2= '-' ) ) ) )
            // InternalBreactive.g:1875:2: ( ( (lv_name_0_1= '+' | lv_name_0_2= '-' ) ) )
            {
            // InternalBreactive.g:1875:2: ( ( (lv_name_0_1= '+' | lv_name_0_2= '-' ) ) )
            // InternalBreactive.g:1876:3: ( (lv_name_0_1= '+' | lv_name_0_2= '-' ) )
            {
            // InternalBreactive.g:1876:3: ( (lv_name_0_1= '+' | lv_name_0_2= '-' ) )
            // InternalBreactive.g:1877:4: (lv_name_0_1= '+' | lv_name_0_2= '-' )
            {
            // InternalBreactive.g:1877:4: (lv_name_0_1= '+' | lv_name_0_2= '-' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            else if ( (LA31_0==35) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalBreactive.g:1878:5: lv_name_0_1= '+'
                    {
                    lv_name_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getArithmeticFunctionMultiplicationAccess().getNamePlusSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getArithmeticFunctionMultiplicationRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:1889:5: lv_name_0_2= '-'
                    {
                    lv_name_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getArithmeticFunctionMultiplicationAccess().getNameHyphenMinusKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getArithmeticFunctionMultiplicationRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticFunctionMultiplication"


    // $ANTLR start "entryRuleArithmeticFunctionPlus"
    // InternalBreactive.g:1905:1: entryRuleArithmeticFunctionPlus returns [EObject current=null] : iv_ruleArithmeticFunctionPlus= ruleArithmeticFunctionPlus EOF ;
    public final EObject entryRuleArithmeticFunctionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticFunctionPlus = null;


        try {
            // InternalBreactive.g:1905:63: (iv_ruleArithmeticFunctionPlus= ruleArithmeticFunctionPlus EOF )
            // InternalBreactive.g:1906:2: iv_ruleArithmeticFunctionPlus= ruleArithmeticFunctionPlus EOF
            {
             newCompositeNode(grammarAccess.getArithmeticFunctionPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticFunctionPlus=ruleArithmeticFunctionPlus();

            state._fsp--;

             current =iv_ruleArithmeticFunctionPlus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticFunctionPlus"


    // $ANTLR start "ruleArithmeticFunctionPlus"
    // InternalBreactive.g:1912:1: ruleArithmeticFunctionPlus returns [EObject current=null] : ( ( (lv_name_0_1= '/' | lv_name_0_2= '*' ) ) ) ;
    public final EObject ruleArithmeticFunctionPlus() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalBreactive.g:1918:2: ( ( ( (lv_name_0_1= '/' | lv_name_0_2= '*' ) ) ) )
            // InternalBreactive.g:1919:2: ( ( (lv_name_0_1= '/' | lv_name_0_2= '*' ) ) )
            {
            // InternalBreactive.g:1919:2: ( ( (lv_name_0_1= '/' | lv_name_0_2= '*' ) ) )
            // InternalBreactive.g:1920:3: ( (lv_name_0_1= '/' | lv_name_0_2= '*' ) )
            {
            // InternalBreactive.g:1920:3: ( (lv_name_0_1= '/' | lv_name_0_2= '*' ) )
            // InternalBreactive.g:1921:4: (lv_name_0_1= '/' | lv_name_0_2= '*' )
            {
            // InternalBreactive.g:1921:4: (lv_name_0_1= '/' | lv_name_0_2= '*' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            else if ( (LA32_0==37) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalBreactive.g:1922:5: lv_name_0_1= '/'
                    {
                    lv_name_0_1=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getArithmeticFunctionPlusAccess().getNameSolidusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getArithmeticFunctionPlusRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:1933:5: lv_name_0_2= '*'
                    {
                    lv_name_0_2=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getArithmeticFunctionPlusAccess().getNameAsteriskKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getArithmeticFunctionPlusRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticFunctionPlus"


    // $ANTLR start "entryRuleMathFunction"
    // InternalBreactive.g:1949:1: entryRuleMathFunction returns [EObject current=null] : iv_ruleMathFunction= ruleMathFunction EOF ;
    public final EObject entryRuleMathFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathFunction = null;


        try {
            // InternalBreactive.g:1949:53: (iv_ruleMathFunction= ruleMathFunction EOF )
            // InternalBreactive.g:1950:2: iv_ruleMathFunction= ruleMathFunction EOF
            {
             newCompositeNode(grammarAccess.getMathFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathFunction=ruleMathFunction();

            state._fsp--;

             current =iv_ruleMathFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathFunction"


    // $ANTLR start "ruleMathFunction"
    // InternalBreactive.g:1956:1: ruleMathFunction returns [EObject current=null] : this_UnaryMathBinaryFunction_0= ruleUnaryMathBinaryFunction ;
    public final EObject ruleMathFunction() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryMathBinaryFunction_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:1962:2: (this_UnaryMathBinaryFunction_0= ruleUnaryMathBinaryFunction )
            // InternalBreactive.g:1963:2: this_UnaryMathBinaryFunction_0= ruleUnaryMathBinaryFunction
            {

            		newCompositeNode(grammarAccess.getMathFunctionAccess().getUnaryMathBinaryFunctionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_UnaryMathBinaryFunction_0=ruleUnaryMathBinaryFunction();

            state._fsp--;


            		current = this_UnaryMathBinaryFunction_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathFunction"


    // $ANTLR start "entryRuleUnaryMathBinaryFunction"
    // InternalBreactive.g:1974:1: entryRuleUnaryMathBinaryFunction returns [EObject current=null] : iv_ruleUnaryMathBinaryFunction= ruleUnaryMathBinaryFunction EOF ;
    public final EObject entryRuleUnaryMathBinaryFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryMathBinaryFunction = null;


        try {
            // InternalBreactive.g:1974:64: (iv_ruleUnaryMathBinaryFunction= ruleUnaryMathBinaryFunction EOF )
            // InternalBreactive.g:1975:2: iv_ruleUnaryMathBinaryFunction= ruleUnaryMathBinaryFunction EOF
            {
             newCompositeNode(grammarAccess.getUnaryMathBinaryFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryMathBinaryFunction=ruleUnaryMathBinaryFunction();

            state._fsp--;

             current =iv_ruleUnaryMathBinaryFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryMathBinaryFunction"


    // $ANTLR start "ruleUnaryMathBinaryFunction"
    // InternalBreactive.g:1981:1: ruleUnaryMathBinaryFunction returns [EObject current=null] : ( ( (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' ) ) ) ;
    public final EObject ruleUnaryMathBinaryFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalBreactive.g:1987:2: ( ( ( (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' ) ) ) )
            // InternalBreactive.g:1988:2: ( ( (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' ) ) )
            {
            // InternalBreactive.g:1988:2: ( ( (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' ) ) )
            // InternalBreactive.g:1989:3: ( (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' ) )
            {
            // InternalBreactive.g:1989:3: ( (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' ) )
            // InternalBreactive.g:1990:4: (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' )
            {
            // InternalBreactive.g:1990:4: (lv_name_0_1= 'sqrt' | lv_name_0_2= 'random' | lv_name_0_3= 'floor' | lv_name_0_4= 'exp' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt33=1;
                }
                break;
            case 39:
                {
                alt33=2;
                }
                break;
            case 40:
                {
                alt33=3;
                }
                break;
            case 41:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalBreactive.g:1991:5: lv_name_0_1= 'sqrt'
                    {
                    lv_name_0_1=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getUnaryMathBinaryFunctionAccess().getNameSqrtKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryMathBinaryFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2002:5: lv_name_0_2= 'random'
                    {
                    lv_name_0_2=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getUnaryMathBinaryFunctionAccess().getNameRandomKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryMathBinaryFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:2013:5: lv_name_0_3= 'floor'
                    {
                    lv_name_0_3=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getUnaryMathBinaryFunctionAccess().getNameFloorKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryMathBinaryFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:2024:5: lv_name_0_4= 'exp'
                    {
                    lv_name_0_4=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getUnaryMathBinaryFunctionAccess().getNameExpKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnaryMathBinaryFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryMathBinaryFunction"


    // $ANTLR start "entryRuleCountFunction"
    // InternalBreactive.g:2040:1: entryRuleCountFunction returns [EObject current=null] : iv_ruleCountFunction= ruleCountFunction EOF ;
    public final EObject entryRuleCountFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountFunction = null;


        try {
            // InternalBreactive.g:2040:54: (iv_ruleCountFunction= ruleCountFunction EOF )
            // InternalBreactive.g:2041:2: iv_ruleCountFunction= ruleCountFunction EOF
            {
             newCompositeNode(grammarAccess.getCountFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountFunction=ruleCountFunction();

            state._fsp--;

             current =iv_ruleCountFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountFunction"


    // $ANTLR start "ruleCountFunction"
    // InternalBreactive.g:2047:1: ruleCountFunction returns [EObject current=null] : ( (lv_name_0_0= 'count' ) ) ;
    public final EObject ruleCountFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2053:2: ( ( (lv_name_0_0= 'count' ) ) )
            // InternalBreactive.g:2054:2: ( (lv_name_0_0= 'count' ) )
            {
            // InternalBreactive.g:2054:2: ( (lv_name_0_0= 'count' ) )
            // InternalBreactive.g:2055:3: (lv_name_0_0= 'count' )
            {
            // InternalBreactive.g:2055:3: (lv_name_0_0= 'count' )
            // InternalBreactive.g:2056:4: lv_name_0_0= 'count'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCountFunctionAccess().getNameCountKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCountFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "count");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountFunction"


    // $ANTLR start "entryRuleSimpleLocationNamedFunction"
    // InternalBreactive.g:2071:1: entryRuleSimpleLocationNamedFunction returns [EObject current=null] : iv_ruleSimpleLocationNamedFunction= ruleSimpleLocationNamedFunction EOF ;
    public final EObject entryRuleSimpleLocationNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLocationNamedFunction = null;


        try {
            // InternalBreactive.g:2071:68: (iv_ruleSimpleLocationNamedFunction= ruleSimpleLocationNamedFunction EOF )
            // InternalBreactive.g:2072:2: iv_ruleSimpleLocationNamedFunction= ruleSimpleLocationNamedFunction EOF
            {
             newCompositeNode(grammarAccess.getSimpleLocationNamedFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleLocationNamedFunction=ruleSimpleLocationNamedFunction();

            state._fsp--;

             current =iv_ruleSimpleLocationNamedFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleLocationNamedFunction"


    // $ANTLR start "ruleSimpleLocationNamedFunction"
    // InternalBreactive.g:2078:1: ruleSimpleLocationNamedFunction returns [EObject current=null] : (this_MaxOneOfLocationFunction_0= ruleMaxOneOfLocationFunction | this_SelectConditionalLocationFunction_1= ruleSelectConditionalLocationFunction | this_OneOfLocationFunction_2= ruleOneOfLocationFunction | this_LocationPrimitiveFunction_3= ruleLocationPrimitiveFunction ) ;
    public final EObject ruleSimpleLocationNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject this_MaxOneOfLocationFunction_0 = null;

        EObject this_SelectConditionalLocationFunction_1 = null;

        EObject this_OneOfLocationFunction_2 = null;

        EObject this_LocationPrimitiveFunction_3 = null;



        	enterRule();

        try {
            // InternalBreactive.g:2084:2: ( (this_MaxOneOfLocationFunction_0= ruleMaxOneOfLocationFunction | this_SelectConditionalLocationFunction_1= ruleSelectConditionalLocationFunction | this_OneOfLocationFunction_2= ruleOneOfLocationFunction | this_LocationPrimitiveFunction_3= ruleLocationPrimitiveFunction ) )
            // InternalBreactive.g:2085:2: (this_MaxOneOfLocationFunction_0= ruleMaxOneOfLocationFunction | this_SelectConditionalLocationFunction_1= ruleSelectConditionalLocationFunction | this_OneOfLocationFunction_2= ruleOneOfLocationFunction | this_LocationPrimitiveFunction_3= ruleLocationPrimitiveFunction )
            {
            // InternalBreactive.g:2085:2: (this_MaxOneOfLocationFunction_0= ruleMaxOneOfLocationFunction | this_SelectConditionalLocationFunction_1= ruleSelectConditionalLocationFunction | this_OneOfLocationFunction_2= ruleOneOfLocationFunction | this_LocationPrimitiveFunction_3= ruleLocationPrimitiveFunction )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt34=1;
                }
                break;
            case 44:
                {
                alt34=2;
                }
                break;
            case 45:
                {
                alt34=3;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalBreactive.g:2086:3: this_MaxOneOfLocationFunction_0= ruleMaxOneOfLocationFunction
                    {

                    			newCompositeNode(grammarAccess.getSimpleLocationNamedFunctionAccess().getMaxOneOfLocationFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxOneOfLocationFunction_0=ruleMaxOneOfLocationFunction();

                    state._fsp--;


                    			current = this_MaxOneOfLocationFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2095:3: this_SelectConditionalLocationFunction_1= ruleSelectConditionalLocationFunction
                    {

                    			newCompositeNode(grammarAccess.getSimpleLocationNamedFunctionAccess().getSelectConditionalLocationFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectConditionalLocationFunction_1=ruleSelectConditionalLocationFunction();

                    state._fsp--;


                    			current = this_SelectConditionalLocationFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:2104:3: this_OneOfLocationFunction_2= ruleOneOfLocationFunction
                    {

                    			newCompositeNode(grammarAccess.getSimpleLocationNamedFunctionAccess().getOneOfLocationFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneOfLocationFunction_2=ruleOneOfLocationFunction();

                    state._fsp--;


                    			current = this_OneOfLocationFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:2113:3: this_LocationPrimitiveFunction_3= ruleLocationPrimitiveFunction
                    {

                    			newCompositeNode(grammarAccess.getSimpleLocationNamedFunctionAccess().getLocationPrimitiveFunctionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocationPrimitiveFunction_3=ruleLocationPrimitiveFunction();

                    state._fsp--;


                    			current = this_LocationPrimitiveFunction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleLocationNamedFunction"


    // $ANTLR start "entryRuleMaxOneOfLocationFunction"
    // InternalBreactive.g:2125:1: entryRuleMaxOneOfLocationFunction returns [EObject current=null] : iv_ruleMaxOneOfLocationFunction= ruleMaxOneOfLocationFunction EOF ;
    public final EObject entryRuleMaxOneOfLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOneOfLocationFunction = null;


        try {
            // InternalBreactive.g:2125:65: (iv_ruleMaxOneOfLocationFunction= ruleMaxOneOfLocationFunction EOF )
            // InternalBreactive.g:2126:2: iv_ruleMaxOneOfLocationFunction= ruleMaxOneOfLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getMaxOneOfLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxOneOfLocationFunction=ruleMaxOneOfLocationFunction();

            state._fsp--;

             current =iv_ruleMaxOneOfLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxOneOfLocationFunction"


    // $ANTLR start "ruleMaxOneOfLocationFunction"
    // InternalBreactive.g:2132:1: ruleMaxOneOfLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'max-one-of' ) ) ;
    public final EObject ruleMaxOneOfLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2138:2: ( ( (lv_name_0_0= 'max-one-of' ) ) )
            // InternalBreactive.g:2139:2: ( (lv_name_0_0= 'max-one-of' ) )
            {
            // InternalBreactive.g:2139:2: ( (lv_name_0_0= 'max-one-of' ) )
            // InternalBreactive.g:2140:3: (lv_name_0_0= 'max-one-of' )
            {
            // InternalBreactive.g:2140:3: (lv_name_0_0= 'max-one-of' )
            // InternalBreactive.g:2141:4: lv_name_0_0= 'max-one-of'
            {
            lv_name_0_0=(Token)match(input,43,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMaxOneOfLocationFunctionAccess().getNameMaxOneOfKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMaxOneOfLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "max-one-of");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxOneOfLocationFunction"


    // $ANTLR start "entryRuleSelectConditionalLocationFunction"
    // InternalBreactive.g:2156:1: entryRuleSelectConditionalLocationFunction returns [EObject current=null] : iv_ruleSelectConditionalLocationFunction= ruleSelectConditionalLocationFunction EOF ;
    public final EObject entryRuleSelectConditionalLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConditionalLocationFunction = null;


        try {
            // InternalBreactive.g:2156:74: (iv_ruleSelectConditionalLocationFunction= ruleSelectConditionalLocationFunction EOF )
            // InternalBreactive.g:2157:2: iv_ruleSelectConditionalLocationFunction= ruleSelectConditionalLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getSelectConditionalLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectConditionalLocationFunction=ruleSelectConditionalLocationFunction();

            state._fsp--;

             current =iv_ruleSelectConditionalLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectConditionalLocationFunction"


    // $ANTLR start "ruleSelectConditionalLocationFunction"
    // InternalBreactive.g:2163:1: ruleSelectConditionalLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'select a location' ) ) ;
    public final EObject ruleSelectConditionalLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2169:2: ( ( (lv_name_0_0= 'select a location' ) ) )
            // InternalBreactive.g:2170:2: ( (lv_name_0_0= 'select a location' ) )
            {
            // InternalBreactive.g:2170:2: ( (lv_name_0_0= 'select a location' ) )
            // InternalBreactive.g:2171:3: (lv_name_0_0= 'select a location' )
            {
            // InternalBreactive.g:2171:3: (lv_name_0_0= 'select a location' )
            // InternalBreactive.g:2172:4: lv_name_0_0= 'select a location'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSelectConditionalLocationFunctionAccess().getNameSelectALocationKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSelectConditionalLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "select a location");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectConditionalLocationFunction"


    // $ANTLR start "entryRuleOneOfLocationFunction"
    // InternalBreactive.g:2187:1: entryRuleOneOfLocationFunction returns [EObject current=null] : iv_ruleOneOfLocationFunction= ruleOneOfLocationFunction EOF ;
    public final EObject entryRuleOneOfLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneOfLocationFunction = null;


        try {
            // InternalBreactive.g:2187:62: (iv_ruleOneOfLocationFunction= ruleOneOfLocationFunction EOF )
            // InternalBreactive.g:2188:2: iv_ruleOneOfLocationFunction= ruleOneOfLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getOneOfLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneOfLocationFunction=ruleOneOfLocationFunction();

            state._fsp--;

             current =iv_ruleOneOfLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneOfLocationFunction"


    // $ANTLR start "ruleOneOfLocationFunction"
    // InternalBreactive.g:2194:1: ruleOneOfLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'one-of' ) ) ;
    public final EObject ruleOneOfLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2200:2: ( ( (lv_name_0_0= 'one-of' ) ) )
            // InternalBreactive.g:2201:2: ( (lv_name_0_0= 'one-of' ) )
            {
            // InternalBreactive.g:2201:2: ( (lv_name_0_0= 'one-of' ) )
            // InternalBreactive.g:2202:3: (lv_name_0_0= 'one-of' )
            {
            // InternalBreactive.g:2202:3: (lv_name_0_0= 'one-of' )
            // InternalBreactive.g:2203:4: lv_name_0_0= 'one-of'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getOneOfLocationFunctionAccess().getNameOneOfKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOneOfLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "one-of");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneOfLocationFunction"


    // $ANTLR start "entryRuleLocationPrimitiveFunction"
    // InternalBreactive.g:2218:1: entryRuleLocationPrimitiveFunction returns [EObject current=null] : iv_ruleLocationPrimitiveFunction= ruleLocationPrimitiveFunction EOF ;
    public final EObject entryRuleLocationPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationPrimitiveFunction = null;


        try {
            // InternalBreactive.g:2218:66: (iv_ruleLocationPrimitiveFunction= ruleLocationPrimitiveFunction EOF )
            // InternalBreactive.g:2219:2: iv_ruleLocationPrimitiveFunction= ruleLocationPrimitiveFunction EOF
            {
             newCompositeNode(grammarAccess.getLocationPrimitiveFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationPrimitiveFunction=ruleLocationPrimitiveFunction();

            state._fsp--;

             current =iv_ruleLocationPrimitiveFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationPrimitiveFunction"


    // $ANTLR start "ruleLocationPrimitiveFunction"
    // InternalBreactive.g:2225:1: ruleLocationPrimitiveFunction returns [EObject current=null] : ( ( (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' ) ) ) ;
    public final EObject ruleLocationPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;


        	enterRule();

        try {
            // InternalBreactive.g:2231:2: ( ( ( (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' ) ) ) )
            // InternalBreactive.g:2232:2: ( ( (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' ) ) )
            {
            // InternalBreactive.g:2232:2: ( ( (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' ) ) )
            // InternalBreactive.g:2233:3: ( (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' ) )
            {
            // InternalBreactive.g:2233:3: ( (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' ) )
            // InternalBreactive.g:2234:4: (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' )
            {
            // InternalBreactive.g:2234:4: (lv_name_0_1= 'here' | lv_name_0_2= 'top' | lv_name_0_3= 'left' | lv_name_0_4= 'right' | lv_name_0_5= 'grid' | lv_name_0_6= 'bottom' | lv_name_0_7= 'neighborhood' )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt35=1;
                }
                break;
            case 47:
                {
                alt35=2;
                }
                break;
            case 48:
                {
                alt35=3;
                }
                break;
            case 49:
                {
                alt35=4;
                }
                break;
            case 50:
                {
                alt35=5;
                }
                break;
            case 51:
                {
                alt35=6;
                }
                break;
            case 52:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalBreactive.g:2235:5: lv_name_0_1= 'here'
                    {
                    lv_name_0_1=(Token)match(input,46,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getLocationPrimitiveFunctionAccess().getNameHereKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2246:5: lv_name_0_2= 'top'
                    {
                    lv_name_0_2=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getLocationPrimitiveFunctionAccess().getNameTopKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:2257:5: lv_name_0_3= 'left'
                    {
                    lv_name_0_3=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getLocationPrimitiveFunctionAccess().getNameLeftKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:2268:5: lv_name_0_4= 'right'
                    {
                    lv_name_0_4=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getLocationPrimitiveFunctionAccess().getNameRightKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalBreactive.g:2279:5: lv_name_0_5= 'grid'
                    {
                    lv_name_0_5=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_name_0_5, grammarAccess.getLocationPrimitiveFunctionAccess().getNameGridKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalBreactive.g:2290:5: lv_name_0_6= 'bottom'
                    {
                    lv_name_0_6=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(lv_name_0_6, grammarAccess.getLocationPrimitiveFunctionAccess().getNameBottomKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalBreactive.g:2301:5: lv_name_0_7= 'neighborhood'
                    {
                    lv_name_0_7=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(lv_name_0_7, grammarAccess.getLocationPrimitiveFunctionAccess().getNameNeighborhoodKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_7, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationPrimitiveFunction"


    // $ANTLR start "entryRuleLocationSetNamedFunction"
    // InternalBreactive.g:2317:1: entryRuleLocationSetNamedFunction returns [EObject current=null] : iv_ruleLocationSetNamedFunction= ruleLocationSetNamedFunction EOF ;
    public final EObject entryRuleLocationSetNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSetNamedFunction = null;


        try {
            // InternalBreactive.g:2317:65: (iv_ruleLocationSetNamedFunction= ruleLocationSetNamedFunction EOF )
            // InternalBreactive.g:2318:2: iv_ruleLocationSetNamedFunction= ruleLocationSetNamedFunction EOF
            {
             newCompositeNode(grammarAccess.getLocationSetNamedFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationSetNamedFunction=ruleLocationSetNamedFunction();

            state._fsp--;

             current =iv_ruleLocationSetNamedFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationSetNamedFunction"


    // $ANTLR start "ruleLocationSetNamedFunction"
    // InternalBreactive.g:2324:1: ruleLocationSetNamedFunction returns [EObject current=null] : (this_NeighborhoodLocationFunction_0= ruleNeighborhoodLocationFunction | this_SpaceLocationFunction_1= ruleSpaceLocationFunction | this_UnionLocationFunction_2= ruleUnionLocationFunction ) ;
    public final EObject ruleLocationSetNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject this_NeighborhoodLocationFunction_0 = null;

        EObject this_SpaceLocationFunction_1 = null;

        EObject this_UnionLocationFunction_2 = null;



        	enterRule();

        try {
            // InternalBreactive.g:2330:2: ( (this_NeighborhoodLocationFunction_0= ruleNeighborhoodLocationFunction | this_SpaceLocationFunction_1= ruleSpaceLocationFunction | this_UnionLocationFunction_2= ruleUnionLocationFunction ) )
            // InternalBreactive.g:2331:2: (this_NeighborhoodLocationFunction_0= ruleNeighborhoodLocationFunction | this_SpaceLocationFunction_1= ruleSpaceLocationFunction | this_UnionLocationFunction_2= ruleUnionLocationFunction )
            {
            // InternalBreactive.g:2331:2: (this_NeighborhoodLocationFunction_0= ruleNeighborhoodLocationFunction | this_SpaceLocationFunction_1= ruleSpaceLocationFunction | this_UnionLocationFunction_2= ruleUnionLocationFunction )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt36=1;
                }
                break;
            case 50:
                {
                alt36=2;
                }
                break;
            case 53:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalBreactive.g:2332:3: this_NeighborhoodLocationFunction_0= ruleNeighborhoodLocationFunction
                    {

                    			newCompositeNode(grammarAccess.getLocationSetNamedFunctionAccess().getNeighborhoodLocationFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NeighborhoodLocationFunction_0=ruleNeighborhoodLocationFunction();

                    state._fsp--;


                    			current = this_NeighborhoodLocationFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2341:3: this_SpaceLocationFunction_1= ruleSpaceLocationFunction
                    {

                    			newCompositeNode(grammarAccess.getLocationSetNamedFunctionAccess().getSpaceLocationFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpaceLocationFunction_1=ruleSpaceLocationFunction();

                    state._fsp--;


                    			current = this_SpaceLocationFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:2350:3: this_UnionLocationFunction_2= ruleUnionLocationFunction
                    {

                    			newCompositeNode(grammarAccess.getLocationSetNamedFunctionAccess().getUnionLocationFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnionLocationFunction_2=ruleUnionLocationFunction();

                    state._fsp--;


                    			current = this_UnionLocationFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationSetNamedFunction"


    // $ANTLR start "entryRuleNeighborhoodLocationFunction"
    // InternalBreactive.g:2362:1: entryRuleNeighborhoodLocationFunction returns [EObject current=null] : iv_ruleNeighborhoodLocationFunction= ruleNeighborhoodLocationFunction EOF ;
    public final EObject entryRuleNeighborhoodLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeighborhoodLocationFunction = null;


        try {
            // InternalBreactive.g:2362:69: (iv_ruleNeighborhoodLocationFunction= ruleNeighborhoodLocationFunction EOF )
            // InternalBreactive.g:2363:2: iv_ruleNeighborhoodLocationFunction= ruleNeighborhoodLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getNeighborhoodLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeighborhoodLocationFunction=ruleNeighborhoodLocationFunction();

            state._fsp--;

             current =iv_ruleNeighborhoodLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeighborhoodLocationFunction"


    // $ANTLR start "ruleNeighborhoodLocationFunction"
    // InternalBreactive.g:2369:1: ruleNeighborhoodLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'neighborhood' ) ) ;
    public final EObject ruleNeighborhoodLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2375:2: ( ( (lv_name_0_0= 'neighborhood' ) ) )
            // InternalBreactive.g:2376:2: ( (lv_name_0_0= 'neighborhood' ) )
            {
            // InternalBreactive.g:2376:2: ( (lv_name_0_0= 'neighborhood' ) )
            // InternalBreactive.g:2377:3: (lv_name_0_0= 'neighborhood' )
            {
            // InternalBreactive.g:2377:3: (lv_name_0_0= 'neighborhood' )
            // InternalBreactive.g:2378:4: lv_name_0_0= 'neighborhood'
            {
            lv_name_0_0=(Token)match(input,52,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNeighborhoodLocationFunctionAccess().getNameNeighborhoodKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNeighborhoodLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "neighborhood");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeighborhoodLocationFunction"


    // $ANTLR start "entryRuleSpaceLocationFunction"
    // InternalBreactive.g:2393:1: entryRuleSpaceLocationFunction returns [EObject current=null] : iv_ruleSpaceLocationFunction= ruleSpaceLocationFunction EOF ;
    public final EObject entryRuleSpaceLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceLocationFunction = null;


        try {
            // InternalBreactive.g:2393:62: (iv_ruleSpaceLocationFunction= ruleSpaceLocationFunction EOF )
            // InternalBreactive.g:2394:2: iv_ruleSpaceLocationFunction= ruleSpaceLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getSpaceLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpaceLocationFunction=ruleSpaceLocationFunction();

            state._fsp--;

             current =iv_ruleSpaceLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpaceLocationFunction"


    // $ANTLR start "ruleSpaceLocationFunction"
    // InternalBreactive.g:2400:1: ruleSpaceLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'grid' ) ) ;
    public final EObject ruleSpaceLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2406:2: ( ( (lv_name_0_0= 'grid' ) ) )
            // InternalBreactive.g:2407:2: ( (lv_name_0_0= 'grid' ) )
            {
            // InternalBreactive.g:2407:2: ( (lv_name_0_0= 'grid' ) )
            // InternalBreactive.g:2408:3: (lv_name_0_0= 'grid' )
            {
            // InternalBreactive.g:2408:3: (lv_name_0_0= 'grid' )
            // InternalBreactive.g:2409:4: lv_name_0_0= 'grid'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSpaceLocationFunctionAccess().getNameGridKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSpaceLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "grid");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpaceLocationFunction"


    // $ANTLR start "entryRuleUnionLocationFunction"
    // InternalBreactive.g:2424:1: entryRuleUnionLocationFunction returns [EObject current=null] : iv_ruleUnionLocationFunction= ruleUnionLocationFunction EOF ;
    public final EObject entryRuleUnionLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionLocationFunction = null;


        try {
            // InternalBreactive.g:2424:62: (iv_ruleUnionLocationFunction= ruleUnionLocationFunction EOF )
            // InternalBreactive.g:2425:2: iv_ruleUnionLocationFunction= ruleUnionLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getUnionLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionLocationFunction=ruleUnionLocationFunction();

            state._fsp--;

             current =iv_ruleUnionLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionLocationFunction"


    // $ANTLR start "ruleUnionLocationFunction"
    // InternalBreactive.g:2431:1: ruleUnionLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'union-location' ) ) ;
    public final EObject ruleUnionLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2437:2: ( ( (lv_name_0_0= 'union-location' ) ) )
            // InternalBreactive.g:2438:2: ( (lv_name_0_0= 'union-location' ) )
            {
            // InternalBreactive.g:2438:2: ( (lv_name_0_0= 'union-location' ) )
            // InternalBreactive.g:2439:3: (lv_name_0_0= 'union-location' )
            {
            // InternalBreactive.g:2439:3: (lv_name_0_0= 'union-location' )
            // InternalBreactive.g:2440:4: lv_name_0_0= 'union-location'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUnionLocationFunctionAccess().getNameUnionLocationKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUnionLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "union-location");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionLocationFunction"


    // $ANTLR start "entryRuleBooleanPrimitiveFunction"
    // InternalBreactive.g:2455:1: entryRuleBooleanPrimitiveFunction returns [EObject current=null] : iv_ruleBooleanPrimitiveFunction= ruleBooleanPrimitiveFunction EOF ;
    public final EObject entryRuleBooleanPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPrimitiveFunction = null;


        try {
            // InternalBreactive.g:2455:65: (iv_ruleBooleanPrimitiveFunction= ruleBooleanPrimitiveFunction EOF )
            // InternalBreactive.g:2456:2: iv_ruleBooleanPrimitiveFunction= ruleBooleanPrimitiveFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanPrimitiveFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanPrimitiveFunction=ruleBooleanPrimitiveFunction();

            state._fsp--;

             current =iv_ruleBooleanPrimitiveFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanPrimitiveFunction"


    // $ANTLR start "ruleBooleanPrimitiveFunction"
    // InternalBreactive.g:2462:1: ruleBooleanPrimitiveFunction returns [EObject current=null] : ( ( (lv_name_0_1= 'true' | lv_name_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalBreactive.g:2468:2: ( ( ( (lv_name_0_1= 'true' | lv_name_0_2= 'false' ) ) ) )
            // InternalBreactive.g:2469:2: ( ( (lv_name_0_1= 'true' | lv_name_0_2= 'false' ) ) )
            {
            // InternalBreactive.g:2469:2: ( ( (lv_name_0_1= 'true' | lv_name_0_2= 'false' ) ) )
            // InternalBreactive.g:2470:3: ( (lv_name_0_1= 'true' | lv_name_0_2= 'false' ) )
            {
            // InternalBreactive.g:2470:3: ( (lv_name_0_1= 'true' | lv_name_0_2= 'false' ) )
            // InternalBreactive.g:2471:4: (lv_name_0_1= 'true' | lv_name_0_2= 'false' )
            {
            // InternalBreactive.g:2471:4: (lv_name_0_1= 'true' | lv_name_0_2= 'false' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            else if ( (LA37_0==55) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalBreactive.g:2472:5: lv_name_0_1= 'true'
                    {
                    lv_name_0_1=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getBooleanPrimitiveFunctionAccess().getNameTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2483:5: lv_name_0_2= 'false'
                    {
                    lv_name_0_2=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getBooleanPrimitiveFunctionAccess().getNameFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanPrimitiveFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanPrimitiveFunction"


    // $ANTLR start "entryRuleBooleanSetFunction"
    // InternalBreactive.g:2499:1: entryRuleBooleanSetFunction returns [EObject current=null] : iv_ruleBooleanSetFunction= ruleBooleanSetFunction EOF ;
    public final EObject entryRuleBooleanSetFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSetFunction = null;


        try {
            // InternalBreactive.g:2499:59: (iv_ruleBooleanSetFunction= ruleBooleanSetFunction EOF )
            // InternalBreactive.g:2500:2: iv_ruleBooleanSetFunction= ruleBooleanSetFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanSetFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSetFunction=ruleBooleanSetFunction();

            state._fsp--;

             current =iv_ruleBooleanSetFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanSetFunction"


    // $ANTLR start "ruleBooleanSetFunction"
    // InternalBreactive.g:2506:1: ruleBooleanSetFunction returns [EObject current=null] : ( (lv_name_0_0= 'set' ) ) ;
    public final EObject ruleBooleanSetFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2512:2: ( ( (lv_name_0_0= 'set' ) ) )
            // InternalBreactive.g:2513:2: ( (lv_name_0_0= 'set' ) )
            {
            // InternalBreactive.g:2513:2: ( (lv_name_0_0= 'set' ) )
            // InternalBreactive.g:2514:3: (lv_name_0_0= 'set' )
            {
            // InternalBreactive.g:2514:3: (lv_name_0_0= 'set' )
            // InternalBreactive.g:2515:4: lv_name_0_0= 'set'
            {
            lv_name_0_0=(Token)match(input,56,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBooleanSetFunctionAccess().getNameSetKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanSetFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "set");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanSetFunction"


    // $ANTLR start "entryRuleBooleanGetFunction"
    // InternalBreactive.g:2530:1: entryRuleBooleanGetFunction returns [EObject current=null] : iv_ruleBooleanGetFunction= ruleBooleanGetFunction EOF ;
    public final EObject entryRuleBooleanGetFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanGetFunction = null;


        try {
            // InternalBreactive.g:2530:59: (iv_ruleBooleanGetFunction= ruleBooleanGetFunction EOF )
            // InternalBreactive.g:2531:2: iv_ruleBooleanGetFunction= ruleBooleanGetFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanGetFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanGetFunction=ruleBooleanGetFunction();

            state._fsp--;

             current =iv_ruleBooleanGetFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanGetFunction"


    // $ANTLR start "ruleBooleanGetFunction"
    // InternalBreactive.g:2537:1: ruleBooleanGetFunction returns [EObject current=null] : ( (lv_name_0_0= 'get' ) ) ;
    public final EObject ruleBooleanGetFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2543:2: ( ( (lv_name_0_0= 'get' ) ) )
            // InternalBreactive.g:2544:2: ( (lv_name_0_0= 'get' ) )
            {
            // InternalBreactive.g:2544:2: ( (lv_name_0_0= 'get' ) )
            // InternalBreactive.g:2545:3: (lv_name_0_0= 'get' )
            {
            // InternalBreactive.g:2545:3: (lv_name_0_0= 'get' )
            // InternalBreactive.g:2546:4: lv_name_0_0= 'get'
            {
            lv_name_0_0=(Token)match(input,57,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBooleanGetFunctionAccess().getNameGetKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanGetFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "get");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanGetFunction"


    // $ANTLR start "entryRuleBooleanNumericComparisonFunction"
    // InternalBreactive.g:2561:1: entryRuleBooleanNumericComparisonFunction returns [EObject current=null] : iv_ruleBooleanNumericComparisonFunction= ruleBooleanNumericComparisonFunction EOF ;
    public final EObject entryRuleBooleanNumericComparisonFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanNumericComparisonFunction = null;


        try {
            // InternalBreactive.g:2561:73: (iv_ruleBooleanNumericComparisonFunction= ruleBooleanNumericComparisonFunction EOF )
            // InternalBreactive.g:2562:2: iv_ruleBooleanNumericComparisonFunction= ruleBooleanNumericComparisonFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanNumericComparisonFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanNumericComparisonFunction=ruleBooleanNumericComparisonFunction();

            state._fsp--;

             current =iv_ruleBooleanNumericComparisonFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanNumericComparisonFunction"


    // $ANTLR start "ruleBooleanNumericComparisonFunction"
    // InternalBreactive.g:2568:1: ruleBooleanNumericComparisonFunction returns [EObject current=null] : ( ( (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' ) ) ) ;
    public final EObject ruleBooleanNumericComparisonFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;


        	enterRule();

        try {
            // InternalBreactive.g:2574:2: ( ( ( (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' ) ) ) )
            // InternalBreactive.g:2575:2: ( ( (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' ) ) )
            {
            // InternalBreactive.g:2575:2: ( ( (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' ) ) )
            // InternalBreactive.g:2576:3: ( (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' ) )
            {
            // InternalBreactive.g:2576:3: ( (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' ) )
            // InternalBreactive.g:2577:4: (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' )
            {
            // InternalBreactive.g:2577:4: (lv_name_0_1= '>=' | lv_name_0_2= '>' | lv_name_0_3= '!=' | lv_name_0_4= '<' | lv_name_0_5= '<=' | lv_name_0_6= '=' )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt38=1;
                }
                break;
            case 59:
                {
                alt38=2;
                }
                break;
            case 60:
                {
                alt38=3;
                }
                break;
            case 61:
                {
                alt38=4;
                }
                break;
            case 62:
                {
                alt38=5;
                }
                break;
            case 33:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalBreactive.g:2578:5: lv_name_0_1= '>='
                    {
                    lv_name_0_1=(Token)match(input,58,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getBooleanNumericComparisonFunctionAccess().getNameGreaterThanSignEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanNumericComparisonFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2589:5: lv_name_0_2= '>'
                    {
                    lv_name_0_2=(Token)match(input,59,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getBooleanNumericComparisonFunctionAccess().getNameGreaterThanSignKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanNumericComparisonFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:2600:5: lv_name_0_3= '!='
                    {
                    lv_name_0_3=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getBooleanNumericComparisonFunctionAccess().getNameExclamationMarkEqualsSignKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanNumericComparisonFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:2611:5: lv_name_0_4= '<'
                    {
                    lv_name_0_4=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getBooleanNumericComparisonFunctionAccess().getNameLessThanSignKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanNumericComparisonFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalBreactive.g:2622:5: lv_name_0_5= '<='
                    {
                    lv_name_0_5=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_name_0_5, grammarAccess.getBooleanNumericComparisonFunctionAccess().getNameLessThanSignEqualsSignKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanNumericComparisonFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalBreactive.g:2633:5: lv_name_0_6= '='
                    {
                    lv_name_0_6=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_name_0_6, grammarAccess.getBooleanNumericComparisonFunctionAccess().getNameEqualsSignKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanNumericComparisonFunctionRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_6, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanNumericComparisonFunction"


    // $ANTLR start "entryRuleBooleanIsOccuppiedLocationFunction"
    // InternalBreactive.g:2649:1: entryRuleBooleanIsOccuppiedLocationFunction returns [EObject current=null] : iv_ruleBooleanIsOccuppiedLocationFunction= ruleBooleanIsOccuppiedLocationFunction EOF ;
    public final EObject entryRuleBooleanIsOccuppiedLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanIsOccuppiedLocationFunction = null;


        try {
            // InternalBreactive.g:2649:75: (iv_ruleBooleanIsOccuppiedLocationFunction= ruleBooleanIsOccuppiedLocationFunction EOF )
            // InternalBreactive.g:2650:2: iv_ruleBooleanIsOccuppiedLocationFunction= ruleBooleanIsOccuppiedLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanIsOccuppiedLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanIsOccuppiedLocationFunction=ruleBooleanIsOccuppiedLocationFunction();

            state._fsp--;

             current =iv_ruleBooleanIsOccuppiedLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanIsOccuppiedLocationFunction"


    // $ANTLR start "ruleBooleanIsOccuppiedLocationFunction"
    // InternalBreactive.g:2656:1: ruleBooleanIsOccuppiedLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'occupied' ) ) ;
    public final EObject ruleBooleanIsOccuppiedLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2662:2: ( ( (lv_name_0_0= 'occupied' ) ) )
            // InternalBreactive.g:2663:2: ( (lv_name_0_0= 'occupied' ) )
            {
            // InternalBreactive.g:2663:2: ( (lv_name_0_0= 'occupied' ) )
            // InternalBreactive.g:2664:3: (lv_name_0_0= 'occupied' )
            {
            // InternalBreactive.g:2664:3: (lv_name_0_0= 'occupied' )
            // InternalBreactive.g:2665:4: lv_name_0_0= 'occupied'
            {
            lv_name_0_0=(Token)match(input,63,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBooleanIsOccuppiedLocationFunctionAccess().getNameOccupiedKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanIsOccuppiedLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "occupied");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanIsOccuppiedLocationFunction"


    // $ANTLR start "entryRuleBooleanLogicFunction"
    // InternalBreactive.g:2680:1: entryRuleBooleanLogicFunction returns [EObject current=null] : iv_ruleBooleanLogicFunction= ruleBooleanLogicFunction EOF ;
    public final EObject entryRuleBooleanLogicFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLogicFunction = null;


        try {
            // InternalBreactive.g:2680:61: (iv_ruleBooleanLogicFunction= ruleBooleanLogicFunction EOF )
            // InternalBreactive.g:2681:2: iv_ruleBooleanLogicFunction= ruleBooleanLogicFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanLogicFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLogicFunction=ruleBooleanLogicFunction();

            state._fsp--;

             current =iv_ruleBooleanLogicFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLogicFunction"


    // $ANTLR start "ruleBooleanLogicFunction"
    // InternalBreactive.g:2687:1: ruleBooleanLogicFunction returns [EObject current=null] : (this_BooleanUnaryLogicFunction_0= ruleBooleanUnaryLogicFunction | this_BooleanANDBinaryLogicFunction_1= ruleBooleanANDBinaryLogicFunction | this_BooleanORBinaryLogicFunction_2= ruleBooleanORBinaryLogicFunction ) ;
    public final EObject ruleBooleanLogicFunction() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnaryLogicFunction_0 = null;

        EObject this_BooleanANDBinaryLogicFunction_1 = null;

        EObject this_BooleanORBinaryLogicFunction_2 = null;



        	enterRule();

        try {
            // InternalBreactive.g:2693:2: ( (this_BooleanUnaryLogicFunction_0= ruleBooleanUnaryLogicFunction | this_BooleanANDBinaryLogicFunction_1= ruleBooleanANDBinaryLogicFunction | this_BooleanORBinaryLogicFunction_2= ruleBooleanORBinaryLogicFunction ) )
            // InternalBreactive.g:2694:2: (this_BooleanUnaryLogicFunction_0= ruleBooleanUnaryLogicFunction | this_BooleanANDBinaryLogicFunction_1= ruleBooleanANDBinaryLogicFunction | this_BooleanORBinaryLogicFunction_2= ruleBooleanORBinaryLogicFunction )
            {
            // InternalBreactive.g:2694:2: (this_BooleanUnaryLogicFunction_0= ruleBooleanUnaryLogicFunction | this_BooleanANDBinaryLogicFunction_1= ruleBooleanANDBinaryLogicFunction | this_BooleanORBinaryLogicFunction_2= ruleBooleanORBinaryLogicFunction )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt39=1;
                }
                break;
            case 65:
                {
                alt39=2;
                }
                break;
            case 66:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalBreactive.g:2695:3: this_BooleanUnaryLogicFunction_0= ruleBooleanUnaryLogicFunction
                    {

                    			newCompositeNode(grammarAccess.getBooleanLogicFunctionAccess().getBooleanUnaryLogicFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanUnaryLogicFunction_0=ruleBooleanUnaryLogicFunction();

                    state._fsp--;


                    			current = this_BooleanUnaryLogicFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2704:3: this_BooleanANDBinaryLogicFunction_1= ruleBooleanANDBinaryLogicFunction
                    {

                    			newCompositeNode(grammarAccess.getBooleanLogicFunctionAccess().getBooleanANDBinaryLogicFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanANDBinaryLogicFunction_1=ruleBooleanANDBinaryLogicFunction();

                    state._fsp--;


                    			current = this_BooleanANDBinaryLogicFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:2713:3: this_BooleanORBinaryLogicFunction_2= ruleBooleanORBinaryLogicFunction
                    {

                    			newCompositeNode(grammarAccess.getBooleanLogicFunctionAccess().getBooleanORBinaryLogicFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanORBinaryLogicFunction_2=ruleBooleanORBinaryLogicFunction();

                    state._fsp--;


                    			current = this_BooleanORBinaryLogicFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLogicFunction"


    // $ANTLR start "entryRuleBooleanUnaryLogicFunction"
    // InternalBreactive.g:2725:1: entryRuleBooleanUnaryLogicFunction returns [EObject current=null] : iv_ruleBooleanUnaryLogicFunction= ruleBooleanUnaryLogicFunction EOF ;
    public final EObject entryRuleBooleanUnaryLogicFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnaryLogicFunction = null;


        try {
            // InternalBreactive.g:2725:66: (iv_ruleBooleanUnaryLogicFunction= ruleBooleanUnaryLogicFunction EOF )
            // InternalBreactive.g:2726:2: iv_ruleBooleanUnaryLogicFunction= ruleBooleanUnaryLogicFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanUnaryLogicFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanUnaryLogicFunction=ruleBooleanUnaryLogicFunction();

            state._fsp--;

             current =iv_ruleBooleanUnaryLogicFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanUnaryLogicFunction"


    // $ANTLR start "ruleBooleanUnaryLogicFunction"
    // InternalBreactive.g:2732:1: ruleBooleanUnaryLogicFunction returns [EObject current=null] : ( (lv_name_0_0= 'NOT' ) ) ;
    public final EObject ruleBooleanUnaryLogicFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2738:2: ( ( (lv_name_0_0= 'NOT' ) ) )
            // InternalBreactive.g:2739:2: ( (lv_name_0_0= 'NOT' ) )
            {
            // InternalBreactive.g:2739:2: ( (lv_name_0_0= 'NOT' ) )
            // InternalBreactive.g:2740:3: (lv_name_0_0= 'NOT' )
            {
            // InternalBreactive.g:2740:3: (lv_name_0_0= 'NOT' )
            // InternalBreactive.g:2741:4: lv_name_0_0= 'NOT'
            {
            lv_name_0_0=(Token)match(input,64,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBooleanUnaryLogicFunctionAccess().getNameNOTKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanUnaryLogicFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "NOT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanUnaryLogicFunction"


    // $ANTLR start "entryRuleBooleanANDBinaryLogicFunction"
    // InternalBreactive.g:2756:1: entryRuleBooleanANDBinaryLogicFunction returns [EObject current=null] : iv_ruleBooleanANDBinaryLogicFunction= ruleBooleanANDBinaryLogicFunction EOF ;
    public final EObject entryRuleBooleanANDBinaryLogicFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanANDBinaryLogicFunction = null;


        try {
            // InternalBreactive.g:2756:70: (iv_ruleBooleanANDBinaryLogicFunction= ruleBooleanANDBinaryLogicFunction EOF )
            // InternalBreactive.g:2757:2: iv_ruleBooleanANDBinaryLogicFunction= ruleBooleanANDBinaryLogicFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanANDBinaryLogicFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanANDBinaryLogicFunction=ruleBooleanANDBinaryLogicFunction();

            state._fsp--;

             current =iv_ruleBooleanANDBinaryLogicFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanANDBinaryLogicFunction"


    // $ANTLR start "ruleBooleanANDBinaryLogicFunction"
    // InternalBreactive.g:2763:1: ruleBooleanANDBinaryLogicFunction returns [EObject current=null] : ( (lv_name_0_0= 'AND' ) ) ;
    public final EObject ruleBooleanANDBinaryLogicFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2769:2: ( ( (lv_name_0_0= 'AND' ) ) )
            // InternalBreactive.g:2770:2: ( (lv_name_0_0= 'AND' ) )
            {
            // InternalBreactive.g:2770:2: ( (lv_name_0_0= 'AND' ) )
            // InternalBreactive.g:2771:3: (lv_name_0_0= 'AND' )
            {
            // InternalBreactive.g:2771:3: (lv_name_0_0= 'AND' )
            // InternalBreactive.g:2772:4: lv_name_0_0= 'AND'
            {
            lv_name_0_0=(Token)match(input,65,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBooleanANDBinaryLogicFunctionAccess().getNameANDKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanANDBinaryLogicFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "AND");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanANDBinaryLogicFunction"


    // $ANTLR start "entryRuleBooleanORBinaryLogicFunction"
    // InternalBreactive.g:2787:1: entryRuleBooleanORBinaryLogicFunction returns [EObject current=null] : iv_ruleBooleanORBinaryLogicFunction= ruleBooleanORBinaryLogicFunction EOF ;
    public final EObject entryRuleBooleanORBinaryLogicFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanORBinaryLogicFunction = null;


        try {
            // InternalBreactive.g:2787:69: (iv_ruleBooleanORBinaryLogicFunction= ruleBooleanORBinaryLogicFunction EOF )
            // InternalBreactive.g:2788:2: iv_ruleBooleanORBinaryLogicFunction= ruleBooleanORBinaryLogicFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanORBinaryLogicFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanORBinaryLogicFunction=ruleBooleanORBinaryLogicFunction();

            state._fsp--;

             current =iv_ruleBooleanORBinaryLogicFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanORBinaryLogicFunction"


    // $ANTLR start "ruleBooleanORBinaryLogicFunction"
    // InternalBreactive.g:2794:1: ruleBooleanORBinaryLogicFunction returns [EObject current=null] : ( (lv_name_0_0= 'OR' ) ) ;
    public final EObject ruleBooleanORBinaryLogicFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2800:2: ( ( (lv_name_0_0= 'OR' ) ) )
            // InternalBreactive.g:2801:2: ( (lv_name_0_0= 'OR' ) )
            {
            // InternalBreactive.g:2801:2: ( (lv_name_0_0= 'OR' ) )
            // InternalBreactive.g:2802:3: (lv_name_0_0= 'OR' )
            {
            // InternalBreactive.g:2802:3: (lv_name_0_0= 'OR' )
            // InternalBreactive.g:2803:4: lv_name_0_0= 'OR'
            {
            lv_name_0_0=(Token)match(input,66,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBooleanORBinaryLogicFunctionAccess().getNameORKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanORBinaryLogicFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "OR");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanORBinaryLogicFunction"


    // $ANTLR start "entryRuleEntityNamedFunction"
    // InternalBreactive.g:2818:1: entryRuleEntityNamedFunction returns [EObject current=null] : iv_ruleEntityNamedFunction= ruleEntityNamedFunction EOF ;
    public final EObject entryRuleEntityNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityNamedFunction = null;


        try {
            // InternalBreactive.g:2818:60: (iv_ruleEntityNamedFunction= ruleEntityNamedFunction EOF )
            // InternalBreactive.g:2819:2: iv_ruleEntityNamedFunction= ruleEntityNamedFunction EOF
            {
             newCompositeNode(grammarAccess.getEntityNamedFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityNamedFunction=ruleEntityNamedFunction();

            state._fsp--;

             current =iv_ruleEntityNamedFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityNamedFunction"


    // $ANTLR start "ruleEntityNamedFunction"
    // InternalBreactive.g:2825:1: ruleEntityNamedFunction returns [EObject current=null] : (this_EntityOneOfFunction_0= ruleEntityOneOfFunction | this_EntityQuantifierFunction_1= ruleEntityQuantifierFunction ) ;
    public final EObject ruleEntityNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject this_EntityOneOfFunction_0 = null;

        EObject this_EntityQuantifierFunction_1 = null;



        	enterRule();

        try {
            // InternalBreactive.g:2831:2: ( (this_EntityOneOfFunction_0= ruleEntityOneOfFunction | this_EntityQuantifierFunction_1= ruleEntityQuantifierFunction ) )
            // InternalBreactive.g:2832:2: (this_EntityOneOfFunction_0= ruleEntityOneOfFunction | this_EntityQuantifierFunction_1= ruleEntityQuantifierFunction )
            {
            // InternalBreactive.g:2832:2: (this_EntityOneOfFunction_0= ruleEntityOneOfFunction | this_EntityQuantifierFunction_1= ruleEntityQuantifierFunction )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=67 && LA40_0<=68)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalBreactive.g:2833:3: this_EntityOneOfFunction_0= ruleEntityOneOfFunction
                    {

                    			newCompositeNode(grammarAccess.getEntityNamedFunctionAccess().getEntityOneOfFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityOneOfFunction_0=ruleEntityOneOfFunction();

                    state._fsp--;


                    			current = this_EntityOneOfFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2842:3: this_EntityQuantifierFunction_1= ruleEntityQuantifierFunction
                    {

                    			newCompositeNode(grammarAccess.getEntityNamedFunctionAccess().getEntityQuantifierFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityQuantifierFunction_1=ruleEntityQuantifierFunction();

                    state._fsp--;


                    			current = this_EntityQuantifierFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityNamedFunction"


    // $ANTLR start "entryRuleEntityQuantifierFunction"
    // InternalBreactive.g:2854:1: entryRuleEntityQuantifierFunction returns [EObject current=null] : iv_ruleEntityQuantifierFunction= ruleEntityQuantifierFunction EOF ;
    public final EObject entryRuleEntityQuantifierFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityQuantifierFunction = null;


        try {
            // InternalBreactive.g:2854:65: (iv_ruleEntityQuantifierFunction= ruleEntityQuantifierFunction EOF )
            // InternalBreactive.g:2855:2: iv_ruleEntityQuantifierFunction= ruleEntityQuantifierFunction EOF
            {
             newCompositeNode(grammarAccess.getEntityQuantifierFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityQuantifierFunction=ruleEntityQuantifierFunction();

            state._fsp--;

             current =iv_ruleEntityQuantifierFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityQuantifierFunction"


    // $ANTLR start "ruleEntityQuantifierFunction"
    // InternalBreactive.g:2861:1: ruleEntityQuantifierFunction returns [EObject current=null] : (this_EntityAllQuantifierFunction_0= ruleEntityAllQuantifierFunction | this_EntityAnyQuantifierFunction_1= ruleEntityAnyQuantifierFunction ) ;
    public final EObject ruleEntityQuantifierFunction() throws RecognitionException {
        EObject current = null;

        EObject this_EntityAllQuantifierFunction_0 = null;

        EObject this_EntityAnyQuantifierFunction_1 = null;



        	enterRule();

        try {
            // InternalBreactive.g:2867:2: ( (this_EntityAllQuantifierFunction_0= ruleEntityAllQuantifierFunction | this_EntityAnyQuantifierFunction_1= ruleEntityAnyQuantifierFunction ) )
            // InternalBreactive.g:2868:2: (this_EntityAllQuantifierFunction_0= ruleEntityAllQuantifierFunction | this_EntityAnyQuantifierFunction_1= ruleEntityAnyQuantifierFunction )
            {
            // InternalBreactive.g:2868:2: (this_EntityAllQuantifierFunction_0= ruleEntityAllQuantifierFunction | this_EntityAnyQuantifierFunction_1= ruleEntityAnyQuantifierFunction )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==68) ) {
                alt41=1;
            }
            else if ( (LA41_0==67) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalBreactive.g:2869:3: this_EntityAllQuantifierFunction_0= ruleEntityAllQuantifierFunction
                    {

                    			newCompositeNode(grammarAccess.getEntityQuantifierFunctionAccess().getEntityAllQuantifierFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityAllQuantifierFunction_0=ruleEntityAllQuantifierFunction();

                    state._fsp--;


                    			current = this_EntityAllQuantifierFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:2878:3: this_EntityAnyQuantifierFunction_1= ruleEntityAnyQuantifierFunction
                    {

                    			newCompositeNode(grammarAccess.getEntityQuantifierFunctionAccess().getEntityAnyQuantifierFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityAnyQuantifierFunction_1=ruleEntityAnyQuantifierFunction();

                    state._fsp--;


                    			current = this_EntityAnyQuantifierFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityQuantifierFunction"


    // $ANTLR start "entryRuleEntityAnyQuantifierFunction"
    // InternalBreactive.g:2890:1: entryRuleEntityAnyQuantifierFunction returns [EObject current=null] : iv_ruleEntityAnyQuantifierFunction= ruleEntityAnyQuantifierFunction EOF ;
    public final EObject entryRuleEntityAnyQuantifierFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityAnyQuantifierFunction = null;


        try {
            // InternalBreactive.g:2890:68: (iv_ruleEntityAnyQuantifierFunction= ruleEntityAnyQuantifierFunction EOF )
            // InternalBreactive.g:2891:2: iv_ruleEntityAnyQuantifierFunction= ruleEntityAnyQuantifierFunction EOF
            {
             newCompositeNode(grammarAccess.getEntityAnyQuantifierFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityAnyQuantifierFunction=ruleEntityAnyQuantifierFunction();

            state._fsp--;

             current =iv_ruleEntityAnyQuantifierFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityAnyQuantifierFunction"


    // $ANTLR start "ruleEntityAnyQuantifierFunction"
    // InternalBreactive.g:2897:1: ruleEntityAnyQuantifierFunction returns [EObject current=null] : ( (lv_name_0_0= 'any' ) ) ;
    public final EObject ruleEntityAnyQuantifierFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2903:2: ( ( (lv_name_0_0= 'any' ) ) )
            // InternalBreactive.g:2904:2: ( (lv_name_0_0= 'any' ) )
            {
            // InternalBreactive.g:2904:2: ( (lv_name_0_0= 'any' ) )
            // InternalBreactive.g:2905:3: (lv_name_0_0= 'any' )
            {
            // InternalBreactive.g:2905:3: (lv_name_0_0= 'any' )
            // InternalBreactive.g:2906:4: lv_name_0_0= 'any'
            {
            lv_name_0_0=(Token)match(input,67,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntityAnyQuantifierFunctionAccess().getNameAnyKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityAnyQuantifierFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "any");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityAnyQuantifierFunction"


    // $ANTLR start "entryRuleEntityAllQuantifierFunction"
    // InternalBreactive.g:2921:1: entryRuleEntityAllQuantifierFunction returns [EObject current=null] : iv_ruleEntityAllQuantifierFunction= ruleEntityAllQuantifierFunction EOF ;
    public final EObject entryRuleEntityAllQuantifierFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityAllQuantifierFunction = null;


        try {
            // InternalBreactive.g:2921:68: (iv_ruleEntityAllQuantifierFunction= ruleEntityAllQuantifierFunction EOF )
            // InternalBreactive.g:2922:2: iv_ruleEntityAllQuantifierFunction= ruleEntityAllQuantifierFunction EOF
            {
             newCompositeNode(grammarAccess.getEntityAllQuantifierFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityAllQuantifierFunction=ruleEntityAllQuantifierFunction();

            state._fsp--;

             current =iv_ruleEntityAllQuantifierFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityAllQuantifierFunction"


    // $ANTLR start "ruleEntityAllQuantifierFunction"
    // InternalBreactive.g:2928:1: ruleEntityAllQuantifierFunction returns [EObject current=null] : ( (lv_name_0_0= 'all' ) ) ;
    public final EObject ruleEntityAllQuantifierFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2934:2: ( ( (lv_name_0_0= 'all' ) ) )
            // InternalBreactive.g:2935:2: ( (lv_name_0_0= 'all' ) )
            {
            // InternalBreactive.g:2935:2: ( (lv_name_0_0= 'all' ) )
            // InternalBreactive.g:2936:3: (lv_name_0_0= 'all' )
            {
            // InternalBreactive.g:2936:3: (lv_name_0_0= 'all' )
            // InternalBreactive.g:2937:4: lv_name_0_0= 'all'
            {
            lv_name_0_0=(Token)match(input,68,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntityAllQuantifierFunctionAccess().getNameAllKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityAllQuantifierFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "all");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityAllQuantifierFunction"


    // $ANTLR start "entryRuleEntitySetCreateFunction"
    // InternalBreactive.g:2952:1: entryRuleEntitySetCreateFunction returns [EObject current=null] : iv_ruleEntitySetCreateFunction= ruleEntitySetCreateFunction EOF ;
    public final EObject entryRuleEntitySetCreateFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySetCreateFunction = null;


        try {
            // InternalBreactive.g:2952:64: (iv_ruleEntitySetCreateFunction= ruleEntitySetCreateFunction EOF )
            // InternalBreactive.g:2953:2: iv_ruleEntitySetCreateFunction= ruleEntitySetCreateFunction EOF
            {
             newCompositeNode(grammarAccess.getEntitySetCreateFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySetCreateFunction=ruleEntitySetCreateFunction();

            state._fsp--;

             current =iv_ruleEntitySetCreateFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntitySetCreateFunction"


    // $ANTLR start "ruleEntitySetCreateFunction"
    // InternalBreactive.g:2959:1: ruleEntitySetCreateFunction returns [EObject current=null] : ( (lv_name_0_0= 'Create ' ) ) ;
    public final EObject ruleEntitySetCreateFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2965:2: ( ( (lv_name_0_0= 'Create ' ) ) )
            // InternalBreactive.g:2966:2: ( (lv_name_0_0= 'Create ' ) )
            {
            // InternalBreactive.g:2966:2: ( (lv_name_0_0= 'Create ' ) )
            // InternalBreactive.g:2967:3: (lv_name_0_0= 'Create ' )
            {
            // InternalBreactive.g:2967:3: (lv_name_0_0= 'Create ' )
            // InternalBreactive.g:2968:4: lv_name_0_0= 'Create '
            {
            lv_name_0_0=(Token)match(input,69,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntitySetCreateFunctionAccess().getNameCreateKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntitySetCreateFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "Create ");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntitySetCreateFunction"


    // $ANTLR start "entryRuleEntitySetOnLocationFunction"
    // InternalBreactive.g:2983:1: entryRuleEntitySetOnLocationFunction returns [EObject current=null] : iv_ruleEntitySetOnLocationFunction= ruleEntitySetOnLocationFunction EOF ;
    public final EObject entryRuleEntitySetOnLocationFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySetOnLocationFunction = null;


        try {
            // InternalBreactive.g:2983:68: (iv_ruleEntitySetOnLocationFunction= ruleEntitySetOnLocationFunction EOF )
            // InternalBreactive.g:2984:2: iv_ruleEntitySetOnLocationFunction= ruleEntitySetOnLocationFunction EOF
            {
             newCompositeNode(grammarAccess.getEntitySetOnLocationFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySetOnLocationFunction=ruleEntitySetOnLocationFunction();

            state._fsp--;

             current =iv_ruleEntitySetOnLocationFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntitySetOnLocationFunction"


    // $ANTLR start "ruleEntitySetOnLocationFunction"
    // InternalBreactive.g:2990:1: ruleEntitySetOnLocationFunction returns [EObject current=null] : ( (lv_name_0_0= 'on' ) ) ;
    public final EObject ruleEntitySetOnLocationFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:2996:2: ( ( (lv_name_0_0= 'on' ) ) )
            // InternalBreactive.g:2997:2: ( (lv_name_0_0= 'on' ) )
            {
            // InternalBreactive.g:2997:2: ( (lv_name_0_0= 'on' ) )
            // InternalBreactive.g:2998:3: (lv_name_0_0= 'on' )
            {
            // InternalBreactive.g:2998:3: (lv_name_0_0= 'on' )
            // InternalBreactive.g:2999:4: lv_name_0_0= 'on'
            {
            lv_name_0_0=(Token)match(input,70,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntitySetOnLocationFunctionAccess().getNameOnKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntitySetOnLocationFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "on");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntitySetOnLocationFunction"


    // $ANTLR start "entryRuleSpaceInitFunction"
    // InternalBreactive.g:3014:1: entryRuleSpaceInitFunction returns [EObject current=null] : iv_ruleSpaceInitFunction= ruleSpaceInitFunction EOF ;
    public final EObject entryRuleSpaceInitFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceInitFunction = null;


        try {
            // InternalBreactive.g:3014:58: (iv_ruleSpaceInitFunction= ruleSpaceInitFunction EOF )
            // InternalBreactive.g:3015:2: iv_ruleSpaceInitFunction= ruleSpaceInitFunction EOF
            {
             newCompositeNode(grammarAccess.getSpaceInitFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpaceInitFunction=ruleSpaceInitFunction();

            state._fsp--;

             current =iv_ruleSpaceInitFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpaceInitFunction"


    // $ANTLR start "ruleSpaceInitFunction"
    // InternalBreactive.g:3021:1: ruleSpaceInitFunction returns [EObject current=null] : ( (lv_name_0_0= 'Create grid' ) ) ;
    public final EObject ruleSpaceInitFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:3027:2: ( ( (lv_name_0_0= 'Create grid' ) ) )
            // InternalBreactive.g:3028:2: ( (lv_name_0_0= 'Create grid' ) )
            {
            // InternalBreactive.g:3028:2: ( (lv_name_0_0= 'Create grid' ) )
            // InternalBreactive.g:3029:3: (lv_name_0_0= 'Create grid' )
            {
            // InternalBreactive.g:3029:3: (lv_name_0_0= 'Create grid' )
            // InternalBreactive.g:3030:4: lv_name_0_0= 'Create grid'
            {
            lv_name_0_0=(Token)match(input,71,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSpaceInitFunctionAccess().getNameCreateGridKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSpaceInitFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "Create grid");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpaceInitFunction"


    // $ANTLR start "entryRuleEntityOneOfFunction"
    // InternalBreactive.g:3045:1: entryRuleEntityOneOfFunction returns [EObject current=null] : iv_ruleEntityOneOfFunction= ruleEntityOneOfFunction EOF ;
    public final EObject entryRuleEntityOneOfFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityOneOfFunction = null;


        try {
            // InternalBreactive.g:3045:60: (iv_ruleEntityOneOfFunction= ruleEntityOneOfFunction EOF )
            // InternalBreactive.g:3046:2: iv_ruleEntityOneOfFunction= ruleEntityOneOfFunction EOF
            {
             newCompositeNode(grammarAccess.getEntityOneOfFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityOneOfFunction=ruleEntityOneOfFunction();

            state._fsp--;

             current =iv_ruleEntityOneOfFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityOneOfFunction"


    // $ANTLR start "ruleEntityOneOfFunction"
    // InternalBreactive.g:3052:1: ruleEntityOneOfFunction returns [EObject current=null] : ( (lv_name_0_0= 'one-of' ) ) ;
    public final EObject ruleEntityOneOfFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:3058:2: ( ( (lv_name_0_0= 'one-of' ) ) )
            // InternalBreactive.g:3059:2: ( (lv_name_0_0= 'one-of' ) )
            {
            // InternalBreactive.g:3059:2: ( (lv_name_0_0= 'one-of' ) )
            // InternalBreactive.g:3060:3: (lv_name_0_0= 'one-of' )
            {
            // InternalBreactive.g:3060:3: (lv_name_0_0= 'one-of' )
            // InternalBreactive.g:3061:4: lv_name_0_0= 'one-of'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntityOneOfFunctionAccess().getNameOneOfKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityOneOfFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "one-of");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityOneOfFunction"


    // $ANTLR start "entryRuleGetVariableFunction"
    // InternalBreactive.g:3076:1: entryRuleGetVariableFunction returns [EObject current=null] : iv_ruleGetVariableFunction= ruleGetVariableFunction EOF ;
    public final EObject entryRuleGetVariableFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetVariableFunction = null;


        try {
            // InternalBreactive.g:3076:60: (iv_ruleGetVariableFunction= ruleGetVariableFunction EOF )
            // InternalBreactive.g:3077:2: iv_ruleGetVariableFunction= ruleGetVariableFunction EOF
            {
             newCompositeNode(grammarAccess.getGetVariableFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetVariableFunction=ruleGetVariableFunction();

            state._fsp--;

             current =iv_ruleGetVariableFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetVariableFunction"


    // $ANTLR start "ruleGetVariableFunction"
    // InternalBreactive.g:3083:1: ruleGetVariableFunction returns [EObject current=null] : ( (lv_name_0_0= 'of' ) ) ;
    public final EObject ruleGetVariableFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:3089:2: ( ( (lv_name_0_0= 'of' ) ) )
            // InternalBreactive.g:3090:2: ( (lv_name_0_0= 'of' ) )
            {
            // InternalBreactive.g:3090:2: ( (lv_name_0_0= 'of' ) )
            // InternalBreactive.g:3091:3: (lv_name_0_0= 'of' )
            {
            // InternalBreactive.g:3091:3: (lv_name_0_0= 'of' )
            // InternalBreactive.g:3092:4: lv_name_0_0= 'of'
            {
            lv_name_0_0=(Token)match(input,72,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getGetVariableFunctionAccess().getNameOfKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGetVariableFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "of");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetVariableFunction"


    // $ANTLR start "entryRuleGetEntityNamedFunction"
    // InternalBreactive.g:3107:1: entryRuleGetEntityNamedFunction returns [EObject current=null] : iv_ruleGetEntityNamedFunction= ruleGetEntityNamedFunction EOF ;
    public final EObject entryRuleGetEntityNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetEntityNamedFunction = null;


        try {
            // InternalBreactive.g:3107:63: (iv_ruleGetEntityNamedFunction= ruleGetEntityNamedFunction EOF )
            // InternalBreactive.g:3108:2: iv_ruleGetEntityNamedFunction= ruleGetEntityNamedFunction EOF
            {
             newCompositeNode(grammarAccess.getGetEntityNamedFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetEntityNamedFunction=ruleGetEntityNamedFunction();

            state._fsp--;

             current =iv_ruleGetEntityNamedFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetEntityNamedFunction"


    // $ANTLR start "ruleGetEntityNamedFunction"
    // InternalBreactive.g:3114:1: ruleGetEntityNamedFunction returns [EObject current=null] : ( (lv_name_0_0= 'entity' ) ) ;
    public final EObject ruleGetEntityNamedFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:3120:2: ( ( (lv_name_0_0= 'entity' ) ) )
            // InternalBreactive.g:3121:2: ( (lv_name_0_0= 'entity' ) )
            {
            // InternalBreactive.g:3121:2: ( (lv_name_0_0= 'entity' ) )
            // InternalBreactive.g:3122:3: (lv_name_0_0= 'entity' )
            {
            // InternalBreactive.g:3122:3: (lv_name_0_0= 'entity' )
            // InternalBreactive.g:3123:4: lv_name_0_0= 'entity'
            {
            lv_name_0_0=(Token)match(input,73,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getGetEntityNamedFunctionAccess().getNameEntityKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGetEntityNamedFunctionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "entity");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetEntityNamedFunction"


    // $ANTLR start "entryRuleFunctionCallExpression"
    // InternalBreactive.g:3138:1: entryRuleFunctionCallExpression returns [EObject current=null] : iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF ;
    public final EObject entryRuleFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallExpression = null;


        try {
            // InternalBreactive.g:3138:63: (iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF )
            // InternalBreactive.g:3139:2: iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallExpression=ruleFunctionCallExpression();

            state._fsp--;

             current =iv_ruleFunctionCallExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallExpression"


    // $ANTLR start "ruleFunctionCallExpression"
    // InternalBreactive.g:3145:1: ruleFunctionCallExpression returns [EObject current=null] : (this_NumericNamedFCExpression_0= ruleNumericNamedFCExpression | this_LocationNamedFCExpression_1= ruleLocationNamedFCExpression | this_BooleanNamedFCExpression_2= ruleBooleanNamedFCExpression | this_EntityNamedFCExpression_3= ruleEntityNamedFCExpression | this_GetNamedFCExpression_4= ruleGetNamedFCExpression ) ;
    public final EObject ruleFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericNamedFCExpression_0 = null;

        EObject this_LocationNamedFCExpression_1 = null;

        EObject this_BooleanNamedFCExpression_2 = null;

        EObject this_EntityNamedFCExpression_3 = null;

        EObject this_GetNamedFCExpression_4 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3151:2: ( (this_NumericNamedFCExpression_0= ruleNumericNamedFCExpression | this_LocationNamedFCExpression_1= ruleLocationNamedFCExpression | this_BooleanNamedFCExpression_2= ruleBooleanNamedFCExpression | this_EntityNamedFCExpression_3= ruleEntityNamedFCExpression | this_GetNamedFCExpression_4= ruleGetNamedFCExpression ) )
            // InternalBreactive.g:3152:2: (this_NumericNamedFCExpression_0= ruleNumericNamedFCExpression | this_LocationNamedFCExpression_1= ruleLocationNamedFCExpression | this_BooleanNamedFCExpression_2= ruleBooleanNamedFCExpression | this_EntityNamedFCExpression_3= ruleEntityNamedFCExpression | this_GetNamedFCExpression_4= ruleGetNamedFCExpression )
            {
            // InternalBreactive.g:3152:2: (this_NumericNamedFCExpression_0= ruleNumericNamedFCExpression | this_LocationNamedFCExpression_1= ruleLocationNamedFCExpression | this_BooleanNamedFCExpression_2= ruleBooleanNamedFCExpression | this_EntityNamedFCExpression_3= ruleEntityNamedFCExpression | this_GetNamedFCExpression_4= ruleGetNamedFCExpression )
            int alt42=5;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalBreactive.g:3153:3: this_NumericNamedFCExpression_0= ruleNumericNamedFCExpression
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getNumericNamedFCExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericNamedFCExpression_0=ruleNumericNamedFCExpression();

                    state._fsp--;


                    			current = this_NumericNamedFCExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:3162:3: this_LocationNamedFCExpression_1= ruleLocationNamedFCExpression
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getLocationNamedFCExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocationNamedFCExpression_1=ruleLocationNamedFCExpression();

                    state._fsp--;


                    			current = this_LocationNamedFCExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:3171:3: this_BooleanNamedFCExpression_2= ruleBooleanNamedFCExpression
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getBooleanNamedFCExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanNamedFCExpression_2=ruleBooleanNamedFCExpression();

                    state._fsp--;


                    			current = this_BooleanNamedFCExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:3180:3: this_EntityNamedFCExpression_3= ruleEntityNamedFCExpression
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getEntityNamedFCExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityNamedFCExpression_3=ruleEntityNamedFCExpression();

                    state._fsp--;


                    			current = this_EntityNamedFCExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBreactive.g:3189:3: this_GetNamedFCExpression_4= ruleGetNamedFCExpression
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getGetNamedFCExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetNamedFCExpression_4=ruleGetNamedFCExpression();

                    state._fsp--;


                    			current = this_GetNamedFCExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallExpression"


    // $ANTLR start "entryRuleBooleanNamedFCExpression"
    // InternalBreactive.g:3201:1: entryRuleBooleanNamedFCExpression returns [EObject current=null] : iv_ruleBooleanNamedFCExpression= ruleBooleanNamedFCExpression EOF ;
    public final EObject entryRuleBooleanNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanNamedFCExpression = null;


        try {
            // InternalBreactive.g:3201:65: (iv_ruleBooleanNamedFCExpression= ruleBooleanNamedFCExpression EOF )
            // InternalBreactive.g:3202:2: iv_ruleBooleanNamedFCExpression= ruleBooleanNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanNamedFCExpression=ruleBooleanNamedFCExpression();

            state._fsp--;

             current =iv_ruleBooleanNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanNamedFCExpression"


    // $ANTLR start "ruleBooleanNamedFCExpression"
    // InternalBreactive.g:3208:1: ruleBooleanNamedFCExpression returns [EObject current=null] : (this_BooleanPrimitiveFCExpression_0= ruleBooleanPrimitiveFCExpression | this_BooleanSetValueFCExpression_1= ruleBooleanSetValueFCExpression | this_BooleanGetValueFCExpression_2= ruleBooleanGetValueFCExpression | this_BooleanNumericComparisonFCExpression_3= ruleBooleanNumericComparisonFCExpression | this_BooleanIsOccuppiedLocationFCExpression_4= ruleBooleanIsOccuppiedLocationFCExpression | this_BooleanQuantifiedEntitySetFCEpression_5= ruleBooleanQuantifiedEntitySetFCEpression | this_BooleanUnaryLogicFCExpression_6= ruleBooleanUnaryLogicFCExpression ) ;
    public final EObject ruleBooleanNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanPrimitiveFCExpression_0 = null;

        EObject this_BooleanSetValueFCExpression_1 = null;

        EObject this_BooleanGetValueFCExpression_2 = null;

        EObject this_BooleanNumericComparisonFCExpression_3 = null;

        EObject this_BooleanIsOccuppiedLocationFCExpression_4 = null;

        EObject this_BooleanQuantifiedEntitySetFCEpression_5 = null;

        EObject this_BooleanUnaryLogicFCExpression_6 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3214:2: ( (this_BooleanPrimitiveFCExpression_0= ruleBooleanPrimitiveFCExpression | this_BooleanSetValueFCExpression_1= ruleBooleanSetValueFCExpression | this_BooleanGetValueFCExpression_2= ruleBooleanGetValueFCExpression | this_BooleanNumericComparisonFCExpression_3= ruleBooleanNumericComparisonFCExpression | this_BooleanIsOccuppiedLocationFCExpression_4= ruleBooleanIsOccuppiedLocationFCExpression | this_BooleanQuantifiedEntitySetFCEpression_5= ruleBooleanQuantifiedEntitySetFCEpression | this_BooleanUnaryLogicFCExpression_6= ruleBooleanUnaryLogicFCExpression ) )
            // InternalBreactive.g:3215:2: (this_BooleanPrimitiveFCExpression_0= ruleBooleanPrimitiveFCExpression | this_BooleanSetValueFCExpression_1= ruleBooleanSetValueFCExpression | this_BooleanGetValueFCExpression_2= ruleBooleanGetValueFCExpression | this_BooleanNumericComparisonFCExpression_3= ruleBooleanNumericComparisonFCExpression | this_BooleanIsOccuppiedLocationFCExpression_4= ruleBooleanIsOccuppiedLocationFCExpression | this_BooleanQuantifiedEntitySetFCEpression_5= ruleBooleanQuantifiedEntitySetFCEpression | this_BooleanUnaryLogicFCExpression_6= ruleBooleanUnaryLogicFCExpression )
            {
            // InternalBreactive.g:3215:2: (this_BooleanPrimitiveFCExpression_0= ruleBooleanPrimitiveFCExpression | this_BooleanSetValueFCExpression_1= ruleBooleanSetValueFCExpression | this_BooleanGetValueFCExpression_2= ruleBooleanGetValueFCExpression | this_BooleanNumericComparisonFCExpression_3= ruleBooleanNumericComparisonFCExpression | this_BooleanIsOccuppiedLocationFCExpression_4= ruleBooleanIsOccuppiedLocationFCExpression | this_BooleanQuantifiedEntitySetFCEpression_5= ruleBooleanQuantifiedEntitySetFCEpression | this_BooleanUnaryLogicFCExpression_6= ruleBooleanUnaryLogicFCExpression )
            int alt43=7;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
                {
                alt43=1;
                }
                break;
            case 56:
                {
                alt43=2;
                }
                break;
            case 57:
                {
                alt43=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
                {
                alt43=4;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt43=5;
                }
                break;
            case 67:
            case 68:
                {
                alt43=6;
                }
                break;
            case 64:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalBreactive.g:3216:3: this_BooleanPrimitiveFCExpression_0= ruleBooleanPrimitiveFCExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanNamedFCExpressionAccess().getBooleanPrimitiveFCExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanPrimitiveFCExpression_0=ruleBooleanPrimitiveFCExpression();

                    state._fsp--;


                    			current = this_BooleanPrimitiveFCExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:3225:3: this_BooleanSetValueFCExpression_1= ruleBooleanSetValueFCExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanNamedFCExpressionAccess().getBooleanSetValueFCExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanSetValueFCExpression_1=ruleBooleanSetValueFCExpression();

                    state._fsp--;


                    			current = this_BooleanSetValueFCExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:3234:3: this_BooleanGetValueFCExpression_2= ruleBooleanGetValueFCExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanNamedFCExpressionAccess().getBooleanGetValueFCExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanGetValueFCExpression_2=ruleBooleanGetValueFCExpression();

                    state._fsp--;


                    			current = this_BooleanGetValueFCExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:3243:3: this_BooleanNumericComparisonFCExpression_3= ruleBooleanNumericComparisonFCExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanNamedFCExpressionAccess().getBooleanNumericComparisonFCExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanNumericComparisonFCExpression_3=ruleBooleanNumericComparisonFCExpression();

                    state._fsp--;


                    			current = this_BooleanNumericComparisonFCExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBreactive.g:3252:3: this_BooleanIsOccuppiedLocationFCExpression_4= ruleBooleanIsOccuppiedLocationFCExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanNamedFCExpressionAccess().getBooleanIsOccuppiedLocationFCExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanIsOccuppiedLocationFCExpression_4=ruleBooleanIsOccuppiedLocationFCExpression();

                    state._fsp--;


                    			current = this_BooleanIsOccuppiedLocationFCExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBreactive.g:3261:3: this_BooleanQuantifiedEntitySetFCEpression_5= ruleBooleanQuantifiedEntitySetFCEpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanNamedFCExpressionAccess().getBooleanQuantifiedEntitySetFCEpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanQuantifiedEntitySetFCEpression_5=ruleBooleanQuantifiedEntitySetFCEpression();

                    state._fsp--;


                    			current = this_BooleanQuantifiedEntitySetFCEpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBreactive.g:3270:3: this_BooleanUnaryLogicFCExpression_6= ruleBooleanUnaryLogicFCExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanNamedFCExpressionAccess().getBooleanUnaryLogicFCExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanUnaryLogicFCExpression_6=ruleBooleanUnaryLogicFCExpression();

                    state._fsp--;


                    			current = this_BooleanUnaryLogicFCExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanNamedFCExpression"


    // $ANTLR start "entryRuleBooleanQuantifiedEntitySetFCEpression"
    // InternalBreactive.g:3282:1: entryRuleBooleanQuantifiedEntitySetFCEpression returns [EObject current=null] : iv_ruleBooleanQuantifiedEntitySetFCEpression= ruleBooleanQuantifiedEntitySetFCEpression EOF ;
    public final EObject entryRuleBooleanQuantifiedEntitySetFCEpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanQuantifiedEntitySetFCEpression = null;


        try {
            // InternalBreactive.g:3282:78: (iv_ruleBooleanQuantifiedEntitySetFCEpression= ruleBooleanQuantifiedEntitySetFCEpression EOF )
            // InternalBreactive.g:3283:2: iv_ruleBooleanQuantifiedEntitySetFCEpression= ruleBooleanQuantifiedEntitySetFCEpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanQuantifiedEntitySetFCEpression=ruleBooleanQuantifiedEntitySetFCEpression();

            state._fsp--;

             current =iv_ruleBooleanQuantifiedEntitySetFCEpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanQuantifiedEntitySetFCEpression"


    // $ANTLR start "ruleBooleanQuantifiedEntitySetFCEpression"
    // InternalBreactive.g:3289:1: ruleBooleanQuantifiedEntitySetFCEpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleEntityQuantifierFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) otherlv_2= 'on' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= 'has' ( (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression ) ) ) ;
    public final EObject ruleBooleanQuantifiedEntitySetFCEpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3295:2: ( ( ( (lv_function_0_0= ruleEntityQuantifierFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) otherlv_2= 'on' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= 'has' ( (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression ) ) ) )
            // InternalBreactive.g:3296:2: ( ( (lv_function_0_0= ruleEntityQuantifierFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) otherlv_2= 'on' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= 'has' ( (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression ) ) )
            {
            // InternalBreactive.g:3296:2: ( ( (lv_function_0_0= ruleEntityQuantifierFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) otherlv_2= 'on' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= 'has' ( (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression ) ) )
            // InternalBreactive.g:3297:3: ( (lv_function_0_0= ruleEntityQuantifierFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) otherlv_2= 'on' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= 'has' ( (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression ) )
            {
            // InternalBreactive.g:3297:3: ( (lv_function_0_0= ruleEntityQuantifierFunction ) )
            // InternalBreactive.g:3298:4: (lv_function_0_0= ruleEntityQuantifierFunction )
            {
            // InternalBreactive.g:3298:4: (lv_function_0_0= ruleEntityQuantifierFunction )
            // InternalBreactive.g:3299:5: lv_function_0_0= ruleEntityQuantifierFunction
            {

            					newCompositeNode(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionAccess().getFunctionEntityQuantifierFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_function_0_0=ruleEntityQuantifierFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.EntityQuantifierFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:3316:3: ( (lv_arguments_1_0= ruleDeclaredEntities ) )
            // InternalBreactive.g:3317:4: (lv_arguments_1_0= ruleDeclaredEntities )
            {
            // InternalBreactive.g:3317:4: (lv_arguments_1_0= ruleDeclaredEntities )
            // InternalBreactive.g:3318:5: lv_arguments_1_0= ruleDeclaredEntities
            {

            					newCompositeNode(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_arguments_1_0=ruleDeclaredEntities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanQuantifiedEntitySetFCEpressionAccess().getOnKeyword_2());
            		
            // InternalBreactive.g:3339:3: ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) )
            // InternalBreactive.g:3340:4: (lv_arguments_3_0= ruleLocationPrimitiveFCExpression )
            {
            // InternalBreactive.g:3340:4: (lv_arguments_3_0= ruleLocationPrimitiveFCExpression )
            // InternalBreactive.g:3341:5: lv_arguments_3_0= ruleLocationPrimitiveFCExpression
            {

            					newCompositeNode(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionAccess().getArgumentsLocationPrimitiveFCExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_arguments_3_0=ruleLocationPrimitiveFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_3_0,
            						"org.cirad.dsl.xtext.Breactive.LocationPrimitiveFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,74,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getBooleanQuantifiedEntitySetFCEpressionAccess().getHasKeyword_4());
            		
            // InternalBreactive.g:3362:3: ( (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression ) )
            // InternalBreactive.g:3363:4: (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression )
            {
            // InternalBreactive.g:3363:4: (lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression )
            // InternalBreactive.g:3364:5: lv_arguments_5_0= ruleBooleanNumericComparisonFCExpression
            {

            					newCompositeNode(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionAccess().getArgumentsBooleanNumericComparisonFCExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_arguments_5_0=ruleBooleanNumericComparisonFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanQuantifiedEntitySetFCEpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_5_0,
            						"org.cirad.dsl.xtext.Breactive.BooleanNumericComparisonFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanQuantifiedEntitySetFCEpression"


    // $ANTLR start "entryRuleBooleanPrimitiveFCExpression"
    // InternalBreactive.g:3385:1: entryRuleBooleanPrimitiveFCExpression returns [EObject current=null] : iv_ruleBooleanPrimitiveFCExpression= ruleBooleanPrimitiveFCExpression EOF ;
    public final EObject entryRuleBooleanPrimitiveFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPrimitiveFCExpression = null;


        try {
            // InternalBreactive.g:3385:69: (iv_ruleBooleanPrimitiveFCExpression= ruleBooleanPrimitiveFCExpression EOF )
            // InternalBreactive.g:3386:2: iv_ruleBooleanPrimitiveFCExpression= ruleBooleanPrimitiveFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanPrimitiveFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanPrimitiveFCExpression=ruleBooleanPrimitiveFCExpression();

            state._fsp--;

             current =iv_ruleBooleanPrimitiveFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanPrimitiveFCExpression"


    // $ANTLR start "ruleBooleanPrimitiveFCExpression"
    // InternalBreactive.g:3392:1: ruleBooleanPrimitiveFCExpression returns [EObject current=null] : ( (lv_function_0_0= ruleBooleanPrimitiveFunction ) ) ;
    public final EObject ruleBooleanPrimitiveFCExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3398:2: ( ( (lv_function_0_0= ruleBooleanPrimitiveFunction ) ) )
            // InternalBreactive.g:3399:2: ( (lv_function_0_0= ruleBooleanPrimitiveFunction ) )
            {
            // InternalBreactive.g:3399:2: ( (lv_function_0_0= ruleBooleanPrimitiveFunction ) )
            // InternalBreactive.g:3400:3: (lv_function_0_0= ruleBooleanPrimitiveFunction )
            {
            // InternalBreactive.g:3400:3: (lv_function_0_0= ruleBooleanPrimitiveFunction )
            // InternalBreactive.g:3401:4: lv_function_0_0= ruleBooleanPrimitiveFunction
            {

            				newCompositeNode(grammarAccess.getBooleanPrimitiveFCExpressionAccess().getFunctionBooleanPrimitiveFunctionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_function_0_0=ruleBooleanPrimitiveFunction();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanPrimitiveFCExpressionRule());
            				}
            				set(
            					current,
            					"function",
            					lv_function_0_0,
            					"org.cirad.dsl.xtext.Breactive.BooleanPrimitiveFunction");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanPrimitiveFCExpression"


    // $ANTLR start "entryRuleBooleanSetValueFCExpression"
    // InternalBreactive.g:3421:1: entryRuleBooleanSetValueFCExpression returns [EObject current=null] : iv_ruleBooleanSetValueFCExpression= ruleBooleanSetValueFCExpression EOF ;
    public final EObject entryRuleBooleanSetValueFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSetValueFCExpression = null;


        try {
            // InternalBreactive.g:3421:68: (iv_ruleBooleanSetValueFCExpression= ruleBooleanSetValueFCExpression EOF )
            // InternalBreactive.g:3422:2: iv_ruleBooleanSetValueFCExpression= ruleBooleanSetValueFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanSetValueFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSetValueFCExpression=ruleBooleanSetValueFCExpression();

            state._fsp--;

             current =iv_ruleBooleanSetValueFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanSetValueFCExpression"


    // $ANTLR start "ruleBooleanSetValueFCExpression"
    // InternalBreactive.g:3428:1: ruleBooleanSetValueFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleBooleanSetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'as true' ) ;
    public final EObject ruleBooleanSetValueFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_1_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3434:2: ( ( ( (lv_function_0_0= ruleBooleanSetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'as true' ) )
            // InternalBreactive.g:3435:2: ( ( (lv_function_0_0= ruleBooleanSetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'as true' )
            {
            // InternalBreactive.g:3435:2: ( ( (lv_function_0_0= ruleBooleanSetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'as true' )
            // InternalBreactive.g:3436:3: ( (lv_function_0_0= ruleBooleanSetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'as true'
            {
            // InternalBreactive.g:3436:3: ( (lv_function_0_0= ruleBooleanSetFunction ) )
            // InternalBreactive.g:3437:4: (lv_function_0_0= ruleBooleanSetFunction )
            {
            // InternalBreactive.g:3437:4: (lv_function_0_0= ruleBooleanSetFunction )
            // InternalBreactive.g:3438:5: lv_function_0_0= ruleBooleanSetFunction
            {

            					newCompositeNode(grammarAccess.getBooleanSetValueFCExpressionAccess().getFunctionBooleanSetFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_function_0_0=ruleBooleanSetFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanSetValueFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.BooleanSetFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:3455:3: ( (lv_arguments_1_0= ruleDeclaredVariable ) )
            // InternalBreactive.g:3456:4: (lv_arguments_1_0= ruleDeclaredVariable )
            {
            // InternalBreactive.g:3456:4: (lv_arguments_1_0= ruleDeclaredVariable )
            // InternalBreactive.g:3457:5: lv_arguments_1_0= ruleDeclaredVariable
            {

            					newCompositeNode(grammarAccess.getBooleanSetValueFCExpressionAccess().getArgumentsDeclaredVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_arguments_1_0=ruleDeclaredVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanSetValueFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,75,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanSetValueFCExpressionAccess().getAsTrueKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanSetValueFCExpression"


    // $ANTLR start "entryRuleBooleanGetValueFCExpression"
    // InternalBreactive.g:3482:1: entryRuleBooleanGetValueFCExpression returns [EObject current=null] : iv_ruleBooleanGetValueFCExpression= ruleBooleanGetValueFCExpression EOF ;
    public final EObject entryRuleBooleanGetValueFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanGetValueFCExpression = null;


        try {
            // InternalBreactive.g:3482:68: (iv_ruleBooleanGetValueFCExpression= ruleBooleanGetValueFCExpression EOF )
            // InternalBreactive.g:3483:2: iv_ruleBooleanGetValueFCExpression= ruleBooleanGetValueFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanGetValueFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanGetValueFCExpression=ruleBooleanGetValueFCExpression();

            state._fsp--;

             current =iv_ruleBooleanGetValueFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanGetValueFCExpression"


    // $ANTLR start "ruleBooleanGetValueFCExpression"
    // InternalBreactive.g:3489:1: ruleBooleanGetValueFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleBooleanGetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'true' ) ;
    public final EObject ruleBooleanGetValueFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_1_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3495:2: ( ( ( (lv_function_0_0= ruleBooleanGetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'true' ) )
            // InternalBreactive.g:3496:2: ( ( (lv_function_0_0= ruleBooleanGetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'true' )
            {
            // InternalBreactive.g:3496:2: ( ( (lv_function_0_0= ruleBooleanGetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'true' )
            // InternalBreactive.g:3497:3: ( (lv_function_0_0= ruleBooleanGetFunction ) ) ( (lv_arguments_1_0= ruleDeclaredVariable ) ) otherlv_2= 'true'
            {
            // InternalBreactive.g:3497:3: ( (lv_function_0_0= ruleBooleanGetFunction ) )
            // InternalBreactive.g:3498:4: (lv_function_0_0= ruleBooleanGetFunction )
            {
            // InternalBreactive.g:3498:4: (lv_function_0_0= ruleBooleanGetFunction )
            // InternalBreactive.g:3499:5: lv_function_0_0= ruleBooleanGetFunction
            {

            					newCompositeNode(grammarAccess.getBooleanGetValueFCExpressionAccess().getFunctionBooleanGetFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_function_0_0=ruleBooleanGetFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanGetValueFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.BooleanGetFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:3516:3: ( (lv_arguments_1_0= ruleDeclaredVariable ) )
            // InternalBreactive.g:3517:4: (lv_arguments_1_0= ruleDeclaredVariable )
            {
            // InternalBreactive.g:3517:4: (lv_arguments_1_0= ruleDeclaredVariable )
            // InternalBreactive.g:3518:5: lv_arguments_1_0= ruleDeclaredVariable
            {

            					newCompositeNode(grammarAccess.getBooleanGetValueFCExpressionAccess().getArgumentsDeclaredVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_arguments_1_0=ruleDeclaredVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanGetValueFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanGetValueFCExpressionAccess().getTrueKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanGetValueFCExpression"


    // $ANTLR start "entryRuleBooleanNumericComparisonFCExpression"
    // InternalBreactive.g:3543:1: entryRuleBooleanNumericComparisonFCExpression returns [EObject current=null] : iv_ruleBooleanNumericComparisonFCExpression= ruleBooleanNumericComparisonFCExpression EOF ;
    public final EObject entryRuleBooleanNumericComparisonFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanNumericComparisonFCExpression = null;


        try {
            // InternalBreactive.g:3543:77: (iv_ruleBooleanNumericComparisonFCExpression= ruleBooleanNumericComparisonFCExpression EOF )
            // InternalBreactive.g:3544:2: iv_ruleBooleanNumericComparisonFCExpression= ruleBooleanNumericComparisonFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanNumericComparisonFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanNumericComparisonFCExpression=ruleBooleanNumericComparisonFCExpression();

            state._fsp--;

             current =iv_ruleBooleanNumericComparisonFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanNumericComparisonFCExpression"


    // $ANTLR start "ruleBooleanNumericComparisonFCExpression"
    // InternalBreactive.g:3550:1: ruleBooleanNumericComparisonFCExpression returns [EObject current=null] : ( ( ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) ) ) ( (lv_function_1_0= ruleBooleanNumericComparisonFunction ) ) ( ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) ) ) ) ;
    public final EObject ruleBooleanNumericComparisonFCExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_1 = null;

        EObject lv_arguments_0_2 = null;

        EObject lv_function_1_0 = null;

        EObject lv_arguments_2_1 = null;

        EObject lv_arguments_2_2 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3556:2: ( ( ( ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) ) ) ( (lv_function_1_0= ruleBooleanNumericComparisonFunction ) ) ( ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) ) ) ) )
            // InternalBreactive.g:3557:2: ( ( ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) ) ) ( (lv_function_1_0= ruleBooleanNumericComparisonFunction ) ) ( ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) ) ) )
            {
            // InternalBreactive.g:3557:2: ( ( ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) ) ) ( (lv_function_1_0= ruleBooleanNumericComparisonFunction ) ) ( ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) ) ) )
            // InternalBreactive.g:3558:3: ( ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) ) ) ( (lv_function_1_0= ruleBooleanNumericComparisonFunction ) ) ( ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) ) )
            {
            // InternalBreactive.g:3558:3: ( ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) ) )
            // InternalBreactive.g:3559:4: ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) )
            {
            // InternalBreactive.g:3559:4: ( (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression ) )
            // InternalBreactive.g:3560:5: (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression )
            {
            // InternalBreactive.g:3560:5: (lv_arguments_0_1= ruleDeclaredVariable | lv_arguments_0_2= ruleConstantExpression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_INT) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalBreactive.g:3561:6: lv_arguments_0_1= ruleDeclaredVariable
                    {

                    						newCompositeNode(grammarAccess.getBooleanNumericComparisonFCExpressionAccess().getArgumentsDeclaredVariableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_arguments_0_1=ruleDeclaredVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanNumericComparisonFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_0_1,
                    							"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:3577:6: lv_arguments_0_2= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanNumericComparisonFCExpressionAccess().getArgumentsConstantExpressionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_39);
                    lv_arguments_0_2=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanNumericComparisonFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_0_2,
                    							"org.cirad.dsl.xtext.Breactive.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalBreactive.g:3595:3: ( (lv_function_1_0= ruleBooleanNumericComparisonFunction ) )
            // InternalBreactive.g:3596:4: (lv_function_1_0= ruleBooleanNumericComparisonFunction )
            {
            // InternalBreactive.g:3596:4: (lv_function_1_0= ruleBooleanNumericComparisonFunction )
            // InternalBreactive.g:3597:5: lv_function_1_0= ruleBooleanNumericComparisonFunction
            {

            					newCompositeNode(grammarAccess.getBooleanNumericComparisonFCExpressionAccess().getFunctionBooleanNumericComparisonFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_function_1_0=ruleBooleanNumericComparisonFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanNumericComparisonFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.BooleanNumericComparisonFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:3614:3: ( ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) ) )
            // InternalBreactive.g:3615:4: ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) )
            {
            // InternalBreactive.g:3615:4: ( (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression ) )
            // InternalBreactive.g:3616:5: (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression )
            {
            // InternalBreactive.g:3616:5: (lv_arguments_2_1= ruleDeclaredVariable | lv_arguments_2_2= ruleConstantExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_INT) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalBreactive.g:3617:6: lv_arguments_2_1= ruleDeclaredVariable
                    {

                    						newCompositeNode(grammarAccess.getBooleanNumericComparisonFCExpressionAccess().getArgumentsDeclaredVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arguments_2_1=ruleDeclaredVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanNumericComparisonFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_1,
                    							"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:3633:6: lv_arguments_2_2= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanNumericComparisonFCExpressionAccess().getArgumentsConstantExpressionParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arguments_2_2=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanNumericComparisonFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_2,
                    							"org.cirad.dsl.xtext.Breactive.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanNumericComparisonFCExpression"


    // $ANTLR start "entryRuleBooleanIsOccuppiedLocationFCExpression"
    // InternalBreactive.g:3655:1: entryRuleBooleanIsOccuppiedLocationFCExpression returns [EObject current=null] : iv_ruleBooleanIsOccuppiedLocationFCExpression= ruleBooleanIsOccuppiedLocationFCExpression EOF ;
    public final EObject entryRuleBooleanIsOccuppiedLocationFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanIsOccuppiedLocationFCExpression = null;


        try {
            // InternalBreactive.g:3655:79: (iv_ruleBooleanIsOccuppiedLocationFCExpression= ruleBooleanIsOccuppiedLocationFCExpression EOF )
            // InternalBreactive.g:3656:2: iv_ruleBooleanIsOccuppiedLocationFCExpression= ruleBooleanIsOccuppiedLocationFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanIsOccuppiedLocationFCExpression=ruleBooleanIsOccuppiedLocationFCExpression();

            state._fsp--;

             current =iv_ruleBooleanIsOccuppiedLocationFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanIsOccuppiedLocationFCExpression"


    // $ANTLR start "ruleBooleanIsOccuppiedLocationFCExpression"
    // InternalBreactive.g:3662:1: ruleBooleanIsOccuppiedLocationFCExpression returns [EObject current=null] : ( () ( (lv_arguments_1_0= ruleLocationPrimitiveFCExpression ) ) otherlv_2= 'is ' ( (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression ) )? ( (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction ) ) (otherlv_5= 'by' otherlv_6= '(' ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )* otherlv_10= ')' )? ) ;
    public final EObject ruleBooleanIsOccuppiedLocationFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_function_4_0 = null;

        EObject lv_arguments_7_0 = null;

        EObject lv_arguments_9_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3668:2: ( ( () ( (lv_arguments_1_0= ruleLocationPrimitiveFCExpression ) ) otherlv_2= 'is ' ( (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression ) )? ( (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction ) ) (otherlv_5= 'by' otherlv_6= '(' ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )* otherlv_10= ')' )? ) )
            // InternalBreactive.g:3669:2: ( () ( (lv_arguments_1_0= ruleLocationPrimitiveFCExpression ) ) otherlv_2= 'is ' ( (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression ) )? ( (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction ) ) (otherlv_5= 'by' otherlv_6= '(' ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )* otherlv_10= ')' )? )
            {
            // InternalBreactive.g:3669:2: ( () ( (lv_arguments_1_0= ruleLocationPrimitiveFCExpression ) ) otherlv_2= 'is ' ( (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression ) )? ( (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction ) ) (otherlv_5= 'by' otherlv_6= '(' ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )* otherlv_10= ')' )? )
            // InternalBreactive.g:3670:3: () ( (lv_arguments_1_0= ruleLocationPrimitiveFCExpression ) ) otherlv_2= 'is ' ( (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression ) )? ( (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction ) ) (otherlv_5= 'by' otherlv_6= '(' ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )* otherlv_10= ')' )?
            {
            // InternalBreactive.g:3670:3: ()
            // InternalBreactive.g:3671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:3677:3: ( (lv_arguments_1_0= ruleLocationPrimitiveFCExpression ) )
            // InternalBreactive.g:3678:4: (lv_arguments_1_0= ruleLocationPrimitiveFCExpression )
            {
            // InternalBreactive.g:3678:4: (lv_arguments_1_0= ruleLocationPrimitiveFCExpression )
            // InternalBreactive.g:3679:5: lv_arguments_1_0= ruleLocationPrimitiveFCExpression
            {

            					newCompositeNode(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getArgumentsLocationPrimitiveFCExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_arguments_1_0=ruleLocationPrimitiveFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"org.cirad.dsl.xtext.Breactive.LocationPrimitiveFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getIsKeyword_2());
            		
            // InternalBreactive.g:3700:3: ( (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==64) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBreactive.g:3701:4: (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression )
                    {
                    // InternalBreactive.g:3701:4: (lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression )
                    // InternalBreactive.g:3702:5: lv_arguments_3_0= ruleBooleanUnaryLogicFCExpression
                    {

                    					newCompositeNode(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getArgumentsBooleanUnaryLogicFCExpressionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_arguments_3_0=ruleBooleanUnaryLogicFCExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionRule());
                    					}
                    					add(
                    						current,
                    						"arguments",
                    						lv_arguments_3_0,
                    						"org.cirad.dsl.xtext.Breactive.BooleanUnaryLogicFCExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBreactive.g:3719:3: ( (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction ) )
            // InternalBreactive.g:3720:4: (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction )
            {
            // InternalBreactive.g:3720:4: (lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction )
            // InternalBreactive.g:3721:5: lv_function_4_0= ruleBooleanIsOccuppiedLocationFunction
            {

            					newCompositeNode(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getFunctionBooleanIsOccuppiedLocationFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
            lv_function_4_0=ruleBooleanIsOccuppiedLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_4_0,
            						"org.cirad.dsl.xtext.Breactive.BooleanIsOccuppiedLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:3738:3: (otherlv_5= 'by' otherlv_6= '(' ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )* otherlv_10= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==77) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBreactive.g:3739:4: otherlv_5= 'by' otherlv_6= '(' ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getByKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,28,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBreactive.g:3747:4: ( (lv_arguments_7_0= ruleEntitySetConditionalFCExpression ) )
                    // InternalBreactive.g:3748:5: (lv_arguments_7_0= ruleEntitySetConditionalFCExpression )
                    {
                    // InternalBreactive.g:3748:5: (lv_arguments_7_0= ruleEntitySetConditionalFCExpression )
                    // InternalBreactive.g:3749:6: lv_arguments_7_0= ruleEntitySetConditionalFCExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getArgumentsEntitySetConditionalFCExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_arguments_7_0=ruleEntitySetConditionalFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_7_0,
                    							"org.cirad.dsl.xtext.Breactive.EntitySetConditionalFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:3766:4: (otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==17) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalBreactive.g:3767:5: otherlv_8= ',' ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_43); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBreactive.g:3771:5: ( (lv_arguments_9_0= ruleEntitySetConditionalFCExpression ) )
                    	    // InternalBreactive.g:3772:6: (lv_arguments_9_0= ruleEntitySetConditionalFCExpression )
                    	    {
                    	    // InternalBreactive.g:3772:6: (lv_arguments_9_0= ruleEntitySetConditionalFCExpression )
                    	    // InternalBreactive.g:3773:7: lv_arguments_9_0= ruleEntitySetConditionalFCExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getArgumentsEntitySetConditionalFCExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_arguments_9_0=ruleEntitySetConditionalFCExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBooleanIsOccuppiedLocationFCExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_9_0,
                    	    								"org.cirad.dsl.xtext.Breactive.EntitySetConditionalFCExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getBooleanIsOccuppiedLocationFCExpressionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanIsOccuppiedLocationFCExpression"


    // $ANTLR start "entryRuleBooleanLogicFCExpression"
    // InternalBreactive.g:3800:1: entryRuleBooleanLogicFCExpression returns [EObject current=null] : iv_ruleBooleanLogicFCExpression= ruleBooleanLogicFCExpression EOF ;
    public final EObject entryRuleBooleanLogicFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLogicFCExpression = null;


        try {
            // InternalBreactive.g:3800:65: (iv_ruleBooleanLogicFCExpression= ruleBooleanLogicFCExpression EOF )
            // InternalBreactive.g:3801:2: iv_ruleBooleanLogicFCExpression= ruleBooleanLogicFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanLogicFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLogicFCExpression=ruleBooleanLogicFCExpression();

            state._fsp--;

             current =iv_ruleBooleanLogicFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLogicFCExpression"


    // $ANTLR start "ruleBooleanLogicFCExpression"
    // InternalBreactive.g:3807:1: ruleBooleanLogicFCExpression returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleBooleanLogicFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3813:2: (this_OrExpr_0= ruleOrExpr )
            // InternalBreactive.g:3814:2: this_OrExpr_0= ruleOrExpr
            {

            		newCompositeNode(grammarAccess.getBooleanLogicFCExpressionAccess().getOrExprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;


            		current = this_OrExpr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLogicFCExpression"


    // $ANTLR start "entryRuleAndExpr"
    // InternalBreactive.g:3825:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalBreactive.g:3825:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalBreactive.g:3826:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalBreactive.g:3832:1: ruleAndExpr returns [EObject current=null] : (this_PrimaryBooleanExpression_0= rulePrimaryBooleanExpression ( () ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) ) ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryBooleanExpression_0 = null;

        EObject lv_function_2_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3838:2: ( (this_PrimaryBooleanExpression_0= rulePrimaryBooleanExpression ( () ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) ) ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) ) )* ) )
            // InternalBreactive.g:3839:2: (this_PrimaryBooleanExpression_0= rulePrimaryBooleanExpression ( () ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) ) ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) ) )* )
            {
            // InternalBreactive.g:3839:2: (this_PrimaryBooleanExpression_0= rulePrimaryBooleanExpression ( () ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) ) ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) ) )* )
            // InternalBreactive.g:3840:3: this_PrimaryBooleanExpression_0= rulePrimaryBooleanExpression ( () ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) ) ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExprAccess().getPrimaryBooleanExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_PrimaryBooleanExpression_0=rulePrimaryBooleanExpression();

            state._fsp--;


            			current = this_PrimaryBooleanExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBreactive.g:3848:3: ( () ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) ) ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==65) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBreactive.g:3849:4: () ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) ) ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) )
            	    {
            	    // InternalBreactive.g:3849:4: ()
            	    // InternalBreactive.g:3850:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExprAccess().getFunctionCallExpressionArgumentsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBreactive.g:3856:4: ( (lv_function_2_0= ruleBooleanANDBinaryLogicFunction ) )
            	    // InternalBreactive.g:3857:5: (lv_function_2_0= ruleBooleanANDBinaryLogicFunction )
            	    {
            	    // InternalBreactive.g:3857:5: (lv_function_2_0= ruleBooleanANDBinaryLogicFunction )
            	    // InternalBreactive.g:3858:6: lv_function_2_0= ruleBooleanANDBinaryLogicFunction
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getFunctionBooleanANDBinaryLogicFunctionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_function_2_0=ruleBooleanANDBinaryLogicFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"function",
            	    							lv_function_2_0,
            	    							"org.cirad.dsl.xtext.Breactive.BooleanANDBinaryLogicFunction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBreactive.g:3875:4: ( (lv_arguments_3_0= rulePrimaryBooleanExpression ) )
            	    // InternalBreactive.g:3876:5: (lv_arguments_3_0= rulePrimaryBooleanExpression )
            	    {
            	    // InternalBreactive.g:3876:5: (lv_arguments_3_0= rulePrimaryBooleanExpression )
            	    // InternalBreactive.g:3877:6: lv_arguments_3_0= rulePrimaryBooleanExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getArgumentsPrimaryBooleanExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_arguments_3_0=rulePrimaryBooleanExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"org.cirad.dsl.xtext.Breactive.PrimaryBooleanExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalBreactive.g:3899:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalBreactive.g:3899:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalBreactive.g:3900:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalBreactive.g:3906:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) ) ( (lv_arguments_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpr_0 = null;

        EObject lv_function_2_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3912:2: ( (this_AndExpr_0= ruleAndExpr ( () ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) ) ( (lv_arguments_3_0= ruleAndExpr ) ) )* ) )
            // InternalBreactive.g:3913:2: (this_AndExpr_0= ruleAndExpr ( () ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) ) ( (lv_arguments_3_0= ruleAndExpr ) ) )* )
            {
            // InternalBreactive.g:3913:2: (this_AndExpr_0= ruleAndExpr ( () ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) ) ( (lv_arguments_3_0= ruleAndExpr ) ) )* )
            // InternalBreactive.g:3914:3: this_AndExpr_0= ruleAndExpr ( () ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) ) ( (lv_arguments_3_0= ruleAndExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;


            			current = this_AndExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBreactive.g:3922:3: ( () ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) ) ( (lv_arguments_3_0= ruleAndExpr ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==66) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBreactive.g:3923:4: () ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) ) ( (lv_arguments_3_0= ruleAndExpr ) )
            	    {
            	    // InternalBreactive.g:3923:4: ()
            	    // InternalBreactive.g:3924:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExprAccess().getFunctionCallExpressionArgumentsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBreactive.g:3930:4: ( (lv_function_2_0= ruleBooleanORBinaryLogicFunction ) )
            	    // InternalBreactive.g:3931:5: (lv_function_2_0= ruleBooleanORBinaryLogicFunction )
            	    {
            	    // InternalBreactive.g:3931:5: (lv_function_2_0= ruleBooleanORBinaryLogicFunction )
            	    // InternalBreactive.g:3932:6: lv_function_2_0= ruleBooleanORBinaryLogicFunction
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getFunctionBooleanORBinaryLogicFunctionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_function_2_0=ruleBooleanORBinaryLogicFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"function",
            	    							lv_function_2_0,
            	    							"org.cirad.dsl.xtext.Breactive.BooleanORBinaryLogicFunction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBreactive.g:3949:4: ( (lv_arguments_3_0= ruleAndExpr ) )
            	    // InternalBreactive.g:3950:5: (lv_arguments_3_0= ruleAndExpr )
            	    {
            	    // InternalBreactive.g:3950:5: (lv_arguments_3_0= ruleAndExpr )
            	    // InternalBreactive.g:3951:6: lv_arguments_3_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getArgumentsAndExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_arguments_3_0=ruleAndExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"org.cirad.dsl.xtext.Breactive.AndExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRulePrimaryBooleanExpression"
    // InternalBreactive.g:3973:1: entryRulePrimaryBooleanExpression returns [EObject current=null] : iv_rulePrimaryBooleanExpression= rulePrimaryBooleanExpression EOF ;
    public final EObject entryRulePrimaryBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryBooleanExpression = null;


        try {
            // InternalBreactive.g:3973:65: (iv_rulePrimaryBooleanExpression= rulePrimaryBooleanExpression EOF )
            // InternalBreactive.g:3974:2: iv_rulePrimaryBooleanExpression= rulePrimaryBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryBooleanExpression=rulePrimaryBooleanExpression();

            state._fsp--;

             current =iv_rulePrimaryBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryBooleanExpression"


    // $ANTLR start "rulePrimaryBooleanExpression"
    // InternalBreactive.g:3980:1: rulePrimaryBooleanExpression returns [EObject current=null] : (otherlv_0= '(' this_BooleanNamedFCExpression_1= ruleBooleanNamedFCExpression otherlv_2= ')' ) ;
    public final EObject rulePrimaryBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BooleanNamedFCExpression_1 = null;



        	enterRule();

        try {
            // InternalBreactive.g:3986:2: ( (otherlv_0= '(' this_BooleanNamedFCExpression_1= ruleBooleanNamedFCExpression otherlv_2= ')' ) )
            // InternalBreactive.g:3987:2: (otherlv_0= '(' this_BooleanNamedFCExpression_1= ruleBooleanNamedFCExpression otherlv_2= ')' )
            {
            // InternalBreactive.g:3987:2: (otherlv_0= '(' this_BooleanNamedFCExpression_1= ruleBooleanNamedFCExpression otherlv_2= ')' )
            // InternalBreactive.g:3988:3: otherlv_0= '(' this_BooleanNamedFCExpression_1= ruleBooleanNamedFCExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryBooleanExpressionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPrimaryBooleanExpressionAccess().getBooleanNamedFCExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_47);
            this_BooleanNamedFCExpression_1=ruleBooleanNamedFCExpression();

            state._fsp--;


            			current = this_BooleanNamedFCExpression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimaryBooleanExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryBooleanExpression"


    // $ANTLR start "entryRuleBooleanUnaryLogicFCExpression"
    // InternalBreactive.g:4008:1: entryRuleBooleanUnaryLogicFCExpression returns [EObject current=null] : iv_ruleBooleanUnaryLogicFCExpression= ruleBooleanUnaryLogicFCExpression EOF ;
    public final EObject entryRuleBooleanUnaryLogicFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnaryLogicFCExpression = null;


        try {
            // InternalBreactive.g:4008:70: (iv_ruleBooleanUnaryLogicFCExpression= ruleBooleanUnaryLogicFCExpression EOF )
            // InternalBreactive.g:4009:2: iv_ruleBooleanUnaryLogicFCExpression= ruleBooleanUnaryLogicFCExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanUnaryLogicFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanUnaryLogicFCExpression=ruleBooleanUnaryLogicFCExpression();

            state._fsp--;

             current =iv_ruleBooleanUnaryLogicFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanUnaryLogicFCExpression"


    // $ANTLR start "ruleBooleanUnaryLogicFCExpression"
    // InternalBreactive.g:4015:1: ruleBooleanUnaryLogicFCExpression returns [EObject current=null] : ( (lv_function_0_0= ruleBooleanUnaryLogicFunction ) ) ;
    public final EObject ruleBooleanUnaryLogicFCExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4021:2: ( ( (lv_function_0_0= ruleBooleanUnaryLogicFunction ) ) )
            // InternalBreactive.g:4022:2: ( (lv_function_0_0= ruleBooleanUnaryLogicFunction ) )
            {
            // InternalBreactive.g:4022:2: ( (lv_function_0_0= ruleBooleanUnaryLogicFunction ) )
            // InternalBreactive.g:4023:3: (lv_function_0_0= ruleBooleanUnaryLogicFunction )
            {
            // InternalBreactive.g:4023:3: (lv_function_0_0= ruleBooleanUnaryLogicFunction )
            // InternalBreactive.g:4024:4: lv_function_0_0= ruleBooleanUnaryLogicFunction
            {

            				newCompositeNode(grammarAccess.getBooleanUnaryLogicFCExpressionAccess().getFunctionBooleanUnaryLogicFunctionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_function_0_0=ruleBooleanUnaryLogicFunction();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanUnaryLogicFCExpressionRule());
            				}
            				set(
            					current,
            					"function",
            					lv_function_0_0,
            					"org.cirad.dsl.xtext.Breactive.BooleanUnaryLogicFunction");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanUnaryLogicFCExpression"


    // $ANTLR start "entryRuleLocationNamedFCExpression"
    // InternalBreactive.g:4044:1: entryRuleLocationNamedFCExpression returns [EObject current=null] : iv_ruleLocationNamedFCExpression= ruleLocationNamedFCExpression EOF ;
    public final EObject entryRuleLocationNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationNamedFCExpression = null;


        try {
            // InternalBreactive.g:4044:66: (iv_ruleLocationNamedFCExpression= ruleLocationNamedFCExpression EOF )
            // InternalBreactive.g:4045:2: iv_ruleLocationNamedFCExpression= ruleLocationNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getLocationNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationNamedFCExpression=ruleLocationNamedFCExpression();

            state._fsp--;

             current =iv_ruleLocationNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationNamedFCExpression"


    // $ANTLR start "ruleLocationNamedFCExpression"
    // InternalBreactive.g:4051:1: ruleLocationNamedFCExpression returns [EObject current=null] : (this_MaxOneOfLocationFCExpression_0= ruleMaxOneOfLocationFCExpression | this_SelectConditionalLocationFCExpression_1= ruleSelectConditionalLocationFCExpression | this_OneOfLocationFCExpression_2= ruleOneOfLocationFCExpression | this_LocationPrimitiveFCExpression_3= ruleLocationPrimitiveFCExpression ) ;
    public final EObject ruleLocationNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MaxOneOfLocationFCExpression_0 = null;

        EObject this_SelectConditionalLocationFCExpression_1 = null;

        EObject this_OneOfLocationFCExpression_2 = null;

        EObject this_LocationPrimitiveFCExpression_3 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4057:2: ( (this_MaxOneOfLocationFCExpression_0= ruleMaxOneOfLocationFCExpression | this_SelectConditionalLocationFCExpression_1= ruleSelectConditionalLocationFCExpression | this_OneOfLocationFCExpression_2= ruleOneOfLocationFCExpression | this_LocationPrimitiveFCExpression_3= ruleLocationPrimitiveFCExpression ) )
            // InternalBreactive.g:4058:2: (this_MaxOneOfLocationFCExpression_0= ruleMaxOneOfLocationFCExpression | this_SelectConditionalLocationFCExpression_1= ruleSelectConditionalLocationFCExpression | this_OneOfLocationFCExpression_2= ruleOneOfLocationFCExpression | this_LocationPrimitiveFCExpression_3= ruleLocationPrimitiveFCExpression )
            {
            // InternalBreactive.g:4058:2: (this_MaxOneOfLocationFCExpression_0= ruleMaxOneOfLocationFCExpression | this_SelectConditionalLocationFCExpression_1= ruleSelectConditionalLocationFCExpression | this_OneOfLocationFCExpression_2= ruleOneOfLocationFCExpression | this_LocationPrimitiveFCExpression_3= ruleLocationPrimitiveFCExpression )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt51=1;
                }
                break;
            case 44:
                {
                alt51=2;
                }
                break;
            case 45:
                {
                alt51=3;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalBreactive.g:4059:3: this_MaxOneOfLocationFCExpression_0= ruleMaxOneOfLocationFCExpression
                    {

                    			newCompositeNode(grammarAccess.getLocationNamedFCExpressionAccess().getMaxOneOfLocationFCExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxOneOfLocationFCExpression_0=ruleMaxOneOfLocationFCExpression();

                    state._fsp--;


                    			current = this_MaxOneOfLocationFCExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:4068:3: this_SelectConditionalLocationFCExpression_1= ruleSelectConditionalLocationFCExpression
                    {

                    			newCompositeNode(grammarAccess.getLocationNamedFCExpressionAccess().getSelectConditionalLocationFCExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectConditionalLocationFCExpression_1=ruleSelectConditionalLocationFCExpression();

                    state._fsp--;


                    			current = this_SelectConditionalLocationFCExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:4077:3: this_OneOfLocationFCExpression_2= ruleOneOfLocationFCExpression
                    {

                    			newCompositeNode(grammarAccess.getLocationNamedFCExpressionAccess().getOneOfLocationFCExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneOfLocationFCExpression_2=ruleOneOfLocationFCExpression();

                    state._fsp--;


                    			current = this_OneOfLocationFCExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBreactive.g:4086:3: this_LocationPrimitiveFCExpression_3= ruleLocationPrimitiveFCExpression
                    {

                    			newCompositeNode(grammarAccess.getLocationNamedFCExpressionAccess().getLocationPrimitiveFCExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocationPrimitiveFCExpression_3=ruleLocationPrimitiveFCExpression();

                    state._fsp--;


                    			current = this_LocationPrimitiveFCExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationNamedFCExpression"


    // $ANTLR start "entryRuleLocationSetNamedFCExpression"
    // InternalBreactive.g:4098:1: entryRuleLocationSetNamedFCExpression returns [EObject current=null] : iv_ruleLocationSetNamedFCExpression= ruleLocationSetNamedFCExpression EOF ;
    public final EObject entryRuleLocationSetNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSetNamedFCExpression = null;


        try {
            // InternalBreactive.g:4098:69: (iv_ruleLocationSetNamedFCExpression= ruleLocationSetNamedFCExpression EOF )
            // InternalBreactive.g:4099:2: iv_ruleLocationSetNamedFCExpression= ruleLocationSetNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getLocationSetNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationSetNamedFCExpression=ruleLocationSetNamedFCExpression();

            state._fsp--;

             current =iv_ruleLocationSetNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationSetNamedFCExpression"


    // $ANTLR start "ruleLocationSetNamedFCExpression"
    // InternalBreactive.g:4105:1: ruleLocationSetNamedFCExpression returns [EObject current=null] : (this_NeighborFCExpression_0= ruleNeighborFCExpression | this_UnionLocationFCExpression_1= ruleUnionLocationFCExpression | this_SpaceFCExpression_2= ruleSpaceFCExpression ) ;
    public final EObject ruleLocationSetNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NeighborFCExpression_0 = null;

        EObject this_UnionLocationFCExpression_1 = null;

        EObject this_SpaceFCExpression_2 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4111:2: ( (this_NeighborFCExpression_0= ruleNeighborFCExpression | this_UnionLocationFCExpression_1= ruleUnionLocationFCExpression | this_SpaceFCExpression_2= ruleSpaceFCExpression ) )
            // InternalBreactive.g:4112:2: (this_NeighborFCExpression_0= ruleNeighborFCExpression | this_UnionLocationFCExpression_1= ruleUnionLocationFCExpression | this_SpaceFCExpression_2= ruleSpaceFCExpression )
            {
            // InternalBreactive.g:4112:2: (this_NeighborFCExpression_0= ruleNeighborFCExpression | this_UnionLocationFCExpression_1= ruleUnionLocationFCExpression | this_SpaceFCExpression_2= ruleSpaceFCExpression )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt52=1;
                }
                break;
            case 53:
                {
                alt52=2;
                }
                break;
            case 50:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalBreactive.g:4113:3: this_NeighborFCExpression_0= ruleNeighborFCExpression
                    {

                    			newCompositeNode(grammarAccess.getLocationSetNamedFCExpressionAccess().getNeighborFCExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NeighborFCExpression_0=ruleNeighborFCExpression();

                    state._fsp--;


                    			current = this_NeighborFCExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:4122:3: this_UnionLocationFCExpression_1= ruleUnionLocationFCExpression
                    {

                    			newCompositeNode(grammarAccess.getLocationSetNamedFCExpressionAccess().getUnionLocationFCExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnionLocationFCExpression_1=ruleUnionLocationFCExpression();

                    state._fsp--;


                    			current = this_UnionLocationFCExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:4131:3: this_SpaceFCExpression_2= ruleSpaceFCExpression
                    {

                    			newCompositeNode(grammarAccess.getLocationSetNamedFCExpressionAccess().getSpaceFCExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpaceFCExpression_2=ruleSpaceFCExpression();

                    state._fsp--;


                    			current = this_SpaceFCExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationSetNamedFCExpression"


    // $ANTLR start "entryRuleUnionLocationFCExpression"
    // InternalBreactive.g:4143:1: entryRuleUnionLocationFCExpression returns [EObject current=null] : iv_ruleUnionLocationFCExpression= ruleUnionLocationFCExpression EOF ;
    public final EObject entryRuleUnionLocationFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionLocationFCExpression = null;


        try {
            // InternalBreactive.g:4143:66: (iv_ruleUnionLocationFCExpression= ruleUnionLocationFCExpression EOF )
            // InternalBreactive.g:4144:2: iv_ruleUnionLocationFCExpression= ruleUnionLocationFCExpression EOF
            {
             newCompositeNode(grammarAccess.getUnionLocationFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionLocationFCExpression=ruleUnionLocationFCExpression();

            state._fsp--;

             current =iv_ruleUnionLocationFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionLocationFCExpression"


    // $ANTLR start "ruleUnionLocationFCExpression"
    // InternalBreactive.g:4150:1: ruleUnionLocationFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleUnionLocationFunction ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )* otherlv_6= ')' ) ) ;
    public final EObject ruleUnionLocationFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4156:2: ( ( () ( (lv_function_1_0= ruleUnionLocationFunction ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )* otherlv_6= ')' ) ) )
            // InternalBreactive.g:4157:2: ( () ( (lv_function_1_0= ruleUnionLocationFunction ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )* otherlv_6= ')' ) )
            {
            // InternalBreactive.g:4157:2: ( () ( (lv_function_1_0= ruleUnionLocationFunction ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )* otherlv_6= ')' ) )
            // InternalBreactive.g:4158:3: () ( (lv_function_1_0= ruleUnionLocationFunction ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )* otherlv_6= ')' )
            {
            // InternalBreactive.g:4158:3: ()
            // InternalBreactive.g:4159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnionLocationFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:4165:3: ( (lv_function_1_0= ruleUnionLocationFunction ) )
            // InternalBreactive.g:4166:4: (lv_function_1_0= ruleUnionLocationFunction )
            {
            // InternalBreactive.g:4166:4: (lv_function_1_0= ruleUnionLocationFunction )
            // InternalBreactive.g:4167:5: lv_function_1_0= ruleUnionLocationFunction
            {

            					newCompositeNode(grammarAccess.getUnionLocationFCExpressionAccess().getFunctionUnionLocationFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_function_1_0=ruleUnionLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnionLocationFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.UnionLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4184:3: (otherlv_2= '(' ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )* otherlv_6= ')' )
            // InternalBreactive.g:4185:4: otherlv_2= '(' ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,28,FOLLOW_16); 

            				newLeafNode(otherlv_2, grammarAccess.getUnionLocationFCExpressionAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalBreactive.g:4189:4: ( (lv_arguments_3_0= ruleLocationNamedFCExpression ) )
            // InternalBreactive.g:4190:5: (lv_arguments_3_0= ruleLocationNamedFCExpression )
            {
            // InternalBreactive.g:4190:5: (lv_arguments_3_0= ruleLocationNamedFCExpression )
            // InternalBreactive.g:4191:6: lv_arguments_3_0= ruleLocationNamedFCExpression
            {

            						newCompositeNode(grammarAccess.getUnionLocationFCExpressionAccess().getArgumentsLocationNamedFCExpressionParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_27);
            lv_arguments_3_0=ruleLocationNamedFCExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getUnionLocationFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_3_0,
            							"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBreactive.g:4208:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==17) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalBreactive.g:4209:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_16); 

            	    					newLeafNode(otherlv_4, grammarAccess.getUnionLocationFCExpressionAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalBreactive.g:4213:5: ( (lv_arguments_5_0= ruleLocationNamedFCExpression ) )
            	    // InternalBreactive.g:4214:6: (lv_arguments_5_0= ruleLocationNamedFCExpression )
            	    {
            	    // InternalBreactive.g:4214:6: (lv_arguments_5_0= ruleLocationNamedFCExpression )
            	    // InternalBreactive.g:4215:7: lv_arguments_5_0= ruleLocationNamedFCExpression
            	    {

            	    							newCompositeNode(grammarAccess.getUnionLocationFCExpressionAccess().getArgumentsLocationNamedFCExpressionParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_arguments_5_0=ruleLocationNamedFCExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getUnionLocationFCExpressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"arguments",
            	    								lv_arguments_5_0,
            	    								"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(otherlv_6, grammarAccess.getUnionLocationFCExpressionAccess().getRightParenthesisKeyword_2_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionLocationFCExpression"


    // $ANTLR start "entryRuleNeighborFCExpression"
    // InternalBreactive.g:4242:1: entryRuleNeighborFCExpression returns [EObject current=null] : iv_ruleNeighborFCExpression= ruleNeighborFCExpression EOF ;
    public final EObject entryRuleNeighborFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeighborFCExpression = null;


        try {
            // InternalBreactive.g:4242:61: (iv_ruleNeighborFCExpression= ruleNeighborFCExpression EOF )
            // InternalBreactive.g:4243:2: iv_ruleNeighborFCExpression= ruleNeighborFCExpression EOF
            {
             newCompositeNode(grammarAccess.getNeighborFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeighborFCExpression=ruleNeighborFCExpression();

            state._fsp--;

             current =iv_ruleNeighborFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeighborFCExpression"


    // $ANTLR start "ruleNeighborFCExpression"
    // InternalBreactive.g:4249:1: ruleNeighborFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleNeighborhoodLocationFunction ) ) ) ;
    public final EObject ruleNeighborFCExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4255:2: ( ( () ( (lv_function_1_0= ruleNeighborhoodLocationFunction ) ) ) )
            // InternalBreactive.g:4256:2: ( () ( (lv_function_1_0= ruleNeighborhoodLocationFunction ) ) )
            {
            // InternalBreactive.g:4256:2: ( () ( (lv_function_1_0= ruleNeighborhoodLocationFunction ) ) )
            // InternalBreactive.g:4257:3: () ( (lv_function_1_0= ruleNeighborhoodLocationFunction ) )
            {
            // InternalBreactive.g:4257:3: ()
            // InternalBreactive.g:4258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNeighborFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:4264:3: ( (lv_function_1_0= ruleNeighborhoodLocationFunction ) )
            // InternalBreactive.g:4265:4: (lv_function_1_0= ruleNeighborhoodLocationFunction )
            {
            // InternalBreactive.g:4265:4: (lv_function_1_0= ruleNeighborhoodLocationFunction )
            // InternalBreactive.g:4266:5: lv_function_1_0= ruleNeighborhoodLocationFunction
            {

            					newCompositeNode(grammarAccess.getNeighborFCExpressionAccess().getFunctionNeighborhoodLocationFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_function_1_0=ruleNeighborhoodLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeighborFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.NeighborhoodLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeighborFCExpression"


    // $ANTLR start "entryRuleSpaceFCExpression"
    // InternalBreactive.g:4287:1: entryRuleSpaceFCExpression returns [EObject current=null] : iv_ruleSpaceFCExpression= ruleSpaceFCExpression EOF ;
    public final EObject entryRuleSpaceFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceFCExpression = null;


        try {
            // InternalBreactive.g:4287:58: (iv_ruleSpaceFCExpression= ruleSpaceFCExpression EOF )
            // InternalBreactive.g:4288:2: iv_ruleSpaceFCExpression= ruleSpaceFCExpression EOF
            {
             newCompositeNode(grammarAccess.getSpaceFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpaceFCExpression=ruleSpaceFCExpression();

            state._fsp--;

             current =iv_ruleSpaceFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpaceFCExpression"


    // $ANTLR start "ruleSpaceFCExpression"
    // InternalBreactive.g:4294:1: ruleSpaceFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleSpaceLocationFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= 'having ' otherlv_5= '(' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )* otherlv_9= ')' )? ) ;
    public final EObject ruleSpaceFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_arguments_8_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4300:2: ( ( () ( (lv_function_1_0= ruleSpaceLocationFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= 'having ' otherlv_5= '(' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )* otherlv_9= ')' )? ) )
            // InternalBreactive.g:4301:2: ( () ( (lv_function_1_0= ruleSpaceLocationFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= 'having ' otherlv_5= '(' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )* otherlv_9= ')' )? )
            {
            // InternalBreactive.g:4301:2: ( () ( (lv_function_1_0= ruleSpaceLocationFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= 'having ' otherlv_5= '(' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )* otherlv_9= ')' )? )
            // InternalBreactive.g:4302:3: () ( (lv_function_1_0= ruleSpaceLocationFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= 'having ' otherlv_5= '(' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )* otherlv_9= ')' )?
            {
            // InternalBreactive.g:4302:3: ()
            // InternalBreactive.g:4303:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpaceFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:4309:3: ( (lv_function_1_0= ruleSpaceLocationFunction ) )
            // InternalBreactive.g:4310:4: (lv_function_1_0= ruleSpaceLocationFunction )
            {
            // InternalBreactive.g:4310:4: (lv_function_1_0= ruleSpaceLocationFunction )
            // InternalBreactive.g:4311:5: lv_function_1_0= ruleSpaceLocationFunction
            {

            					newCompositeNode(grammarAccess.getSpaceFCExpressionAccess().getFunctionSpaceLocationFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_function_1_0=ruleSpaceLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpaceFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.SpaceLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4328:3: (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) )
            // InternalBreactive.g:4329:4: otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) )
            {
            otherlv_2=(Token)match(input,72,FOLLOW_15); 

            				newLeafNode(otherlv_2, grammarAccess.getSpaceFCExpressionAccess().getOfKeyword_2_0());
            			
            // InternalBreactive.g:4333:4: ( (lv_arguments_3_0= ruleDeclaredEntities ) )
            // InternalBreactive.g:4334:5: (lv_arguments_3_0= ruleDeclaredEntities )
            {
            // InternalBreactive.g:4334:5: (lv_arguments_3_0= ruleDeclaredEntities )
            // InternalBreactive.g:4335:6: lv_arguments_3_0= ruleDeclaredEntities
            {

            						newCompositeNode(grammarAccess.getSpaceFCExpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_49);
            lv_arguments_3_0=ruleDeclaredEntities();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSpaceFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_3_0,
            							"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalBreactive.g:4353:3: (otherlv_4= 'having ' otherlv_5= '(' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )* otherlv_9= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==78) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBreactive.g:4354:4: otherlv_4= 'having ' otherlv_5= '(' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpaceFCExpressionAccess().getHavingKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getSpaceFCExpressionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalBreactive.g:4362:4: ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) )
                    // InternalBreactive.g:4363:5: (lv_arguments_6_0= ruleBooleanLogicFCExpression )
                    {
                    // InternalBreactive.g:4363:5: (lv_arguments_6_0= ruleBooleanLogicFCExpression )
                    // InternalBreactive.g:4364:6: lv_arguments_6_0= ruleBooleanLogicFCExpression
                    {

                    						newCompositeNode(grammarAccess.getSpaceFCExpressionAccess().getArgumentsBooleanLogicFCExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_arguments_6_0=ruleBooleanLogicFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpaceFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_6_0,
                    							"org.cirad.dsl.xtext.Breactive.BooleanLogicFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:4381:4: (otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==17) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalBreactive.g:4382:5: otherlv_7= ',' ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_26); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSpaceFCExpressionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBreactive.g:4386:5: ( (lv_arguments_8_0= ruleBooleanLogicFCExpression ) )
                    	    // InternalBreactive.g:4387:6: (lv_arguments_8_0= ruleBooleanLogicFCExpression )
                    	    {
                    	    // InternalBreactive.g:4387:6: (lv_arguments_8_0= ruleBooleanLogicFCExpression )
                    	    // InternalBreactive.g:4388:7: lv_arguments_8_0= ruleBooleanLogicFCExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpaceFCExpressionAccess().getArgumentsBooleanLogicFCExpressionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_arguments_8_0=ruleBooleanLogicFCExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpaceFCExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_8_0,
                    	    								"org.cirad.dsl.xtext.Breactive.BooleanLogicFCExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getSpaceFCExpressionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpaceFCExpression"


    // $ANTLR start "entryRuleSpaceInitFCExpression"
    // InternalBreactive.g:4415:1: entryRuleSpaceInitFCExpression returns [EObject current=null] : iv_ruleSpaceInitFCExpression= ruleSpaceInitFCExpression EOF ;
    public final EObject entryRuleSpaceInitFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceInitFCExpression = null;


        try {
            // InternalBreactive.g:4415:62: (iv_ruleSpaceInitFCExpression= ruleSpaceInitFCExpression EOF )
            // InternalBreactive.g:4416:2: iv_ruleSpaceInitFCExpression= ruleSpaceInitFCExpression EOF
            {
             newCompositeNode(grammarAccess.getSpaceInitFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpaceInitFCExpression=ruleSpaceInitFCExpression();

            state._fsp--;

             current =iv_ruleSpaceInitFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpaceInitFCExpression"


    // $ANTLR start "ruleSpaceInitFCExpression"
    // InternalBreactive.g:4422:1: ruleSpaceInitFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleSpaceInitFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= '(' ( (lv_arguments_5_0= ruleConstantExpression ) ) otherlv_6= ',' ( (lv_arguments_7_0= ruleConstantExpression ) ) otherlv_8= ')' ) ) ;
    public final EObject ruleSpaceInitFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4428:2: ( ( () ( (lv_function_1_0= ruleSpaceInitFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= '(' ( (lv_arguments_5_0= ruleConstantExpression ) ) otherlv_6= ',' ( (lv_arguments_7_0= ruleConstantExpression ) ) otherlv_8= ')' ) ) )
            // InternalBreactive.g:4429:2: ( () ( (lv_function_1_0= ruleSpaceInitFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= '(' ( (lv_arguments_5_0= ruleConstantExpression ) ) otherlv_6= ',' ( (lv_arguments_7_0= ruleConstantExpression ) ) otherlv_8= ')' ) )
            {
            // InternalBreactive.g:4429:2: ( () ( (lv_function_1_0= ruleSpaceInitFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= '(' ( (lv_arguments_5_0= ruleConstantExpression ) ) otherlv_6= ',' ( (lv_arguments_7_0= ruleConstantExpression ) ) otherlv_8= ')' ) )
            // InternalBreactive.g:4430:3: () ( (lv_function_1_0= ruleSpaceInitFunction ) ) (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) ) (otherlv_4= '(' ( (lv_arguments_5_0= ruleConstantExpression ) ) otherlv_6= ',' ( (lv_arguments_7_0= ruleConstantExpression ) ) otherlv_8= ')' )
            {
            // InternalBreactive.g:4430:3: ()
            // InternalBreactive.g:4431:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpaceInitFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:4437:3: ( (lv_function_1_0= ruleSpaceInitFunction ) )
            // InternalBreactive.g:4438:4: (lv_function_1_0= ruleSpaceInitFunction )
            {
            // InternalBreactive.g:4438:4: (lv_function_1_0= ruleSpaceInitFunction )
            // InternalBreactive.g:4439:5: lv_function_1_0= ruleSpaceInitFunction
            {

            					newCompositeNode(grammarAccess.getSpaceInitFCExpressionAccess().getFunctionSpaceInitFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_function_1_0=ruleSpaceInitFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpaceInitFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.SpaceInitFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4456:3: (otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) ) )
            // InternalBreactive.g:4457:4: otherlv_2= 'of' ( (lv_arguments_3_0= ruleDeclaredEntities ) )
            {
            otherlv_2=(Token)match(input,72,FOLLOW_15); 

            				newLeafNode(otherlv_2, grammarAccess.getSpaceInitFCExpressionAccess().getOfKeyword_2_0());
            			
            // InternalBreactive.g:4461:4: ( (lv_arguments_3_0= ruleDeclaredEntities ) )
            // InternalBreactive.g:4462:5: (lv_arguments_3_0= ruleDeclaredEntities )
            {
            // InternalBreactive.g:4462:5: (lv_arguments_3_0= ruleDeclaredEntities )
            // InternalBreactive.g:4463:6: lv_arguments_3_0= ruleDeclaredEntities
            {

            						newCompositeNode(grammarAccess.getSpaceInitFCExpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_26);
            lv_arguments_3_0=ruleDeclaredEntities();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSpaceInitFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_3_0,
            							"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalBreactive.g:4481:3: (otherlv_4= '(' ( (lv_arguments_5_0= ruleConstantExpression ) ) otherlv_6= ',' ( (lv_arguments_7_0= ruleConstantExpression ) ) otherlv_8= ')' )
            // InternalBreactive.g:4482:4: otherlv_4= '(' ( (lv_arguments_5_0= ruleConstantExpression ) ) otherlv_6= ',' ( (lv_arguments_7_0= ruleConstantExpression ) ) otherlv_8= ')'
            {
            otherlv_4=(Token)match(input,28,FOLLOW_34); 

            				newLeafNode(otherlv_4, grammarAccess.getSpaceInitFCExpressionAccess().getLeftParenthesisKeyword_3_0());
            			
            // InternalBreactive.g:4486:4: ( (lv_arguments_5_0= ruleConstantExpression ) )
            // InternalBreactive.g:4487:5: (lv_arguments_5_0= ruleConstantExpression )
            {
            // InternalBreactive.g:4487:5: (lv_arguments_5_0= ruleConstantExpression )
            // InternalBreactive.g:4488:6: lv_arguments_5_0= ruleConstantExpression
            {

            						newCompositeNode(grammarAccess.getSpaceInitFCExpressionAccess().getArgumentsConstantExpressionParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_50);
            lv_arguments_5_0=ruleConstantExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSpaceInitFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_5_0,
            							"org.cirad.dsl.xtext.Breactive.ConstantExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_34); 

            				newLeafNode(otherlv_6, grammarAccess.getSpaceInitFCExpressionAccess().getCommaKeyword_3_2());
            			
            // InternalBreactive.g:4509:4: ( (lv_arguments_7_0= ruleConstantExpression ) )
            // InternalBreactive.g:4510:5: (lv_arguments_7_0= ruleConstantExpression )
            {
            // InternalBreactive.g:4510:5: (lv_arguments_7_0= ruleConstantExpression )
            // InternalBreactive.g:4511:6: lv_arguments_7_0= ruleConstantExpression
            {

            						newCompositeNode(grammarAccess.getSpaceInitFCExpressionAccess().getArgumentsConstantExpressionParserRuleCall_3_3_0());
            					
            pushFollow(FOLLOW_47);
            lv_arguments_7_0=ruleConstantExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSpaceInitFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_7_0,
            							"org.cirad.dsl.xtext.Breactive.ConstantExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(otherlv_8, grammarAccess.getSpaceInitFCExpressionAccess().getRightParenthesisKeyword_3_4());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpaceInitFCExpression"


    // $ANTLR start "entryRuleEntityNamedFCExpression"
    // InternalBreactive.g:4537:1: entryRuleEntityNamedFCExpression returns [EObject current=null] : iv_ruleEntityNamedFCExpression= ruleEntityNamedFCExpression EOF ;
    public final EObject entryRuleEntityNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityNamedFCExpression = null;


        try {
            // InternalBreactive.g:4537:64: (iv_ruleEntityNamedFCExpression= ruleEntityNamedFCExpression EOF )
            // InternalBreactive.g:4538:2: iv_ruleEntityNamedFCExpression= ruleEntityNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getEntityNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityNamedFCExpression=ruleEntityNamedFCExpression();

            state._fsp--;

             current =iv_ruleEntityNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityNamedFCExpression"


    // $ANTLR start "ruleEntityNamedFCExpression"
    // InternalBreactive.g:4544:1: ruleEntityNamedFCExpression returns [EObject current=null] : this_EntityOneOfFCExpression_0= ruleEntityOneOfFCExpression ;
    public final EObject ruleEntityNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EntityOneOfFCExpression_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4550:2: (this_EntityOneOfFCExpression_0= ruleEntityOneOfFCExpression )
            // InternalBreactive.g:4551:2: this_EntityOneOfFCExpression_0= ruleEntityOneOfFCExpression
            {

            		newCompositeNode(grammarAccess.getEntityNamedFCExpressionAccess().getEntityOneOfFCExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EntityOneOfFCExpression_0=ruleEntityOneOfFCExpression();

            state._fsp--;


            		current = this_EntityOneOfFCExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityNamedFCExpression"


    // $ANTLR start "entryRuleEntitySetCreateFCExpression"
    // InternalBreactive.g:4562:1: entryRuleEntitySetCreateFCExpression returns [EObject current=null] : iv_ruleEntitySetCreateFCExpression= ruleEntitySetCreateFCExpression EOF ;
    public final EObject entryRuleEntitySetCreateFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySetCreateFCExpression = null;


        try {
            // InternalBreactive.g:4562:68: (iv_ruleEntitySetCreateFCExpression= ruleEntitySetCreateFCExpression EOF )
            // InternalBreactive.g:4563:2: iv_ruleEntitySetCreateFCExpression= ruleEntitySetCreateFCExpression EOF
            {
             newCompositeNode(grammarAccess.getEntitySetCreateFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySetCreateFCExpression=ruleEntitySetCreateFCExpression();

            state._fsp--;

             current =iv_ruleEntitySetCreateFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntitySetCreateFCExpression"


    // $ANTLR start "ruleEntitySetCreateFCExpression"
    // InternalBreactive.g:4569:1: ruleEntitySetCreateFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleEntitySetCreateFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleConstantExpression ) ) ) ;
    public final EObject ruleEntitySetCreateFCExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;

        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4575:2: ( ( ( (lv_function_0_0= ruleEntitySetCreateFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleConstantExpression ) ) ) )
            // InternalBreactive.g:4576:2: ( ( (lv_function_0_0= ruleEntitySetCreateFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleConstantExpression ) ) )
            {
            // InternalBreactive.g:4576:2: ( ( (lv_function_0_0= ruleEntitySetCreateFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleConstantExpression ) ) )
            // InternalBreactive.g:4577:3: ( (lv_function_0_0= ruleEntitySetCreateFunction ) ) ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleConstantExpression ) )
            {
            // InternalBreactive.g:4577:3: ( (lv_function_0_0= ruleEntitySetCreateFunction ) )
            // InternalBreactive.g:4578:4: (lv_function_0_0= ruleEntitySetCreateFunction )
            {
            // InternalBreactive.g:4578:4: (lv_function_0_0= ruleEntitySetCreateFunction )
            // InternalBreactive.g:4579:5: lv_function_0_0= ruleEntitySetCreateFunction
            {

            					newCompositeNode(grammarAccess.getEntitySetCreateFCExpressionAccess().getFunctionEntitySetCreateFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_function_0_0=ruleEntitySetCreateFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitySetCreateFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.EntitySetCreateFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4596:3: ( (lv_arguments_1_0= ruleDeclaredEntities ) )
            // InternalBreactive.g:4597:4: (lv_arguments_1_0= ruleDeclaredEntities )
            {
            // InternalBreactive.g:4597:4: (lv_arguments_1_0= ruleDeclaredEntities )
            // InternalBreactive.g:4598:5: lv_arguments_1_0= ruleDeclaredEntities
            {

            					newCompositeNode(grammarAccess.getEntitySetCreateFCExpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_arguments_1_0=ruleDeclaredEntities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitySetCreateFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4615:3: ( (lv_arguments_2_0= ruleConstantExpression ) )
            // InternalBreactive.g:4616:4: (lv_arguments_2_0= ruleConstantExpression )
            {
            // InternalBreactive.g:4616:4: (lv_arguments_2_0= ruleConstantExpression )
            // InternalBreactive.g:4617:5: lv_arguments_2_0= ruleConstantExpression
            {

            					newCompositeNode(grammarAccess.getEntitySetCreateFCExpressionAccess().getArgumentsConstantExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_arguments_2_0=ruleConstantExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitySetCreateFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_2_0,
            						"org.cirad.dsl.xtext.Breactive.ConstantExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntitySetCreateFCExpression"


    // $ANTLR start "entryRuleEntityOneOfFCExpression"
    // InternalBreactive.g:4638:1: entryRuleEntityOneOfFCExpression returns [EObject current=null] : iv_ruleEntityOneOfFCExpression= ruleEntityOneOfFCExpression EOF ;
    public final EObject entryRuleEntityOneOfFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityOneOfFCExpression = null;


        try {
            // InternalBreactive.g:4638:64: (iv_ruleEntityOneOfFCExpression= ruleEntityOneOfFCExpression EOF )
            // InternalBreactive.g:4639:2: iv_ruleEntityOneOfFCExpression= ruleEntityOneOfFCExpression EOF
            {
             newCompositeNode(grammarAccess.getEntityOneOfFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityOneOfFCExpression=ruleEntityOneOfFCExpression();

            state._fsp--;

             current =iv_ruleEntityOneOfFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityOneOfFCExpression"


    // $ANTLR start "ruleEntityOneOfFCExpression"
    // InternalBreactive.g:4645:1: ruleEntityOneOfFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleEntityOneOfFunction ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredEntities ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) ) ) (otherlv_5= 'having ' otherlv_6= '(' ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )* otherlv_10= ')' )? otherlv_11= ')' ) ;
    public final EObject ruleEntityOneOfFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_7_0 = null;

        EObject lv_arguments_9_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4651:2: ( ( ( (lv_function_0_0= ruleEntityOneOfFunction ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredEntities ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) ) ) (otherlv_5= 'having ' otherlv_6= '(' ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )* otherlv_10= ')' )? otherlv_11= ')' ) )
            // InternalBreactive.g:4652:2: ( ( (lv_function_0_0= ruleEntityOneOfFunction ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredEntities ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) ) ) (otherlv_5= 'having ' otherlv_6= '(' ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )* otherlv_10= ')' )? otherlv_11= ')' )
            {
            // InternalBreactive.g:4652:2: ( ( (lv_function_0_0= ruleEntityOneOfFunction ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredEntities ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) ) ) (otherlv_5= 'having ' otherlv_6= '(' ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )* otherlv_10= ')' )? otherlv_11= ')' )
            // InternalBreactive.g:4653:3: ( (lv_function_0_0= ruleEntityOneOfFunction ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredEntities ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) ) ) (otherlv_5= 'having ' otherlv_6= '(' ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )* otherlv_10= ')' )? otherlv_11= ')'
            {
            // InternalBreactive.g:4653:3: ( (lv_function_0_0= ruleEntityOneOfFunction ) )
            // InternalBreactive.g:4654:4: (lv_function_0_0= ruleEntityOneOfFunction )
            {
            // InternalBreactive.g:4654:4: (lv_function_0_0= ruleEntityOneOfFunction )
            // InternalBreactive.g:4655:5: lv_function_0_0= ruleEntityOneOfFunction
            {

            					newCompositeNode(grammarAccess.getEntityOneOfFCExpressionAccess().getFunctionEntityOneOfFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_function_0_0=ruleEntityOneOfFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityOneOfFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.EntityOneOfFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4672:3: (otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredEntities ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) ) )
            // InternalBreactive.g:4673:4: otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredEntities ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )
            {
            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            				newLeafNode(otherlv_1, grammarAccess.getEntityOneOfFCExpressionAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalBreactive.g:4677:4: ( (lv_arguments_2_0= ruleDeclaredEntities ) )
            // InternalBreactive.g:4678:5: (lv_arguments_2_0= ruleDeclaredEntities )
            {
            // InternalBreactive.g:4678:5: (lv_arguments_2_0= ruleDeclaredEntities )
            // InternalBreactive.g:4679:6: lv_arguments_2_0= ruleDeclaredEntities
            {

            						newCompositeNode(grammarAccess.getEntityOneOfFCExpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_51);
            lv_arguments_2_0=ruleDeclaredEntities();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEntityOneOfFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_2_0,
            							"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBreactive.g:4696:4: (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )
            // InternalBreactive.g:4697:5: otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) )
            {
            otherlv_3=(Token)match(input,79,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getEntityOneOfFCExpressionAccess().getFromKeyword_1_2_0());
            				
            // InternalBreactive.g:4701:5: ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) )
            // InternalBreactive.g:4702:6: (lv_arguments_4_0= ruleLocationNamedFCExpression )
            {
            // InternalBreactive.g:4702:6: (lv_arguments_4_0= ruleLocationNamedFCExpression )
            // InternalBreactive.g:4703:7: lv_arguments_4_0= ruleLocationNamedFCExpression
            {

            							newCompositeNode(grammarAccess.getEntityOneOfFCExpressionAccess().getArgumentsLocationNamedFCExpressionParserRuleCall_1_2_1_0());
            						
            pushFollow(FOLLOW_52);
            lv_arguments_4_0=ruleLocationNamedFCExpression();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getEntityOneOfFCExpressionRule());
            							}
            							add(
            								current,
            								"arguments",
            								lv_arguments_4_0,
            								"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
            							afterParserOrEnumRuleCall();
            						

            }


            }


            }


            }

            // InternalBreactive.g:4722:3: (otherlv_5= 'having ' otherlv_6= '(' ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )* otherlv_10= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==78) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBreactive.g:4723:4: otherlv_5= 'having ' otherlv_6= '(' ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) ) (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityOneOfFCExpressionAccess().getHavingKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityOneOfFCExpressionAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalBreactive.g:4731:4: ( (lv_arguments_7_0= ruleBooleanLogicFCExpression ) )
                    // InternalBreactive.g:4732:5: (lv_arguments_7_0= ruleBooleanLogicFCExpression )
                    {
                    // InternalBreactive.g:4732:5: (lv_arguments_7_0= ruleBooleanLogicFCExpression )
                    // InternalBreactive.g:4733:6: lv_arguments_7_0= ruleBooleanLogicFCExpression
                    {

                    						newCompositeNode(grammarAccess.getEntityOneOfFCExpressionAccess().getArgumentsBooleanLogicFCExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_arguments_7_0=ruleBooleanLogicFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityOneOfFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_7_0,
                    							"org.cirad.dsl.xtext.Breactive.BooleanLogicFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:4750:4: (otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==17) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalBreactive.g:4751:5: otherlv_8= ',' ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_26); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEntityOneOfFCExpressionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalBreactive.g:4755:5: ( (lv_arguments_9_0= ruleBooleanLogicFCExpression ) )
                    	    // InternalBreactive.g:4756:6: (lv_arguments_9_0= ruleBooleanLogicFCExpression )
                    	    {
                    	    // InternalBreactive.g:4756:6: (lv_arguments_9_0= ruleBooleanLogicFCExpression )
                    	    // InternalBreactive.g:4757:7: lv_arguments_9_0= ruleBooleanLogicFCExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityOneOfFCExpressionAccess().getArgumentsBooleanLogicFCExpressionParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_arguments_9_0=ruleBooleanLogicFCExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityOneOfFCExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_9_0,
                    	    								"org.cirad.dsl.xtext.Breactive.BooleanLogicFCExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_47); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityOneOfFCExpressionAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEntityOneOfFCExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityOneOfFCExpression"


    // $ANTLR start "entryRuleEntitySetOnLocationFCExpression"
    // InternalBreactive.g:4788:1: entryRuleEntitySetOnLocationFCExpression returns [EObject current=null] : iv_ruleEntitySetOnLocationFCExpression= ruleEntitySetOnLocationFCExpression EOF ;
    public final EObject entryRuleEntitySetOnLocationFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySetOnLocationFCExpression = null;


        try {
            // InternalBreactive.g:4788:72: (iv_ruleEntitySetOnLocationFCExpression= ruleEntitySetOnLocationFCExpression EOF )
            // InternalBreactive.g:4789:2: iv_ruleEntitySetOnLocationFCExpression= ruleEntitySetOnLocationFCExpression EOF
            {
             newCompositeNode(grammarAccess.getEntitySetOnLocationFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySetOnLocationFCExpression=ruleEntitySetOnLocationFCExpression();

            state._fsp--;

             current =iv_ruleEntitySetOnLocationFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntitySetOnLocationFCExpression"


    // $ANTLR start "ruleEntitySetOnLocationFCExpression"
    // InternalBreactive.g:4795:1: ruleEntitySetOnLocationFCExpression returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleDeclaredEntities ) ) ( (lv_function_1_0= ruleEntitySetOnLocationFunction ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) ) ;
    public final EObject ruleEntitySetOnLocationFCExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4801:2: ( ( ( (lv_arguments_0_0= ruleDeclaredEntities ) ) ( (lv_function_1_0= ruleEntitySetOnLocationFunction ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) ) )
            // InternalBreactive.g:4802:2: ( ( (lv_arguments_0_0= ruleDeclaredEntities ) ) ( (lv_function_1_0= ruleEntitySetOnLocationFunction ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) )
            {
            // InternalBreactive.g:4802:2: ( ( (lv_arguments_0_0= ruleDeclaredEntities ) ) ( (lv_function_1_0= ruleEntitySetOnLocationFunction ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) )
            // InternalBreactive.g:4803:3: ( (lv_arguments_0_0= ruleDeclaredEntities ) ) ( (lv_function_1_0= ruleEntitySetOnLocationFunction ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) )
            {
            // InternalBreactive.g:4803:3: ( (lv_arguments_0_0= ruleDeclaredEntities ) )
            // InternalBreactive.g:4804:4: (lv_arguments_0_0= ruleDeclaredEntities )
            {
            // InternalBreactive.g:4804:4: (lv_arguments_0_0= ruleDeclaredEntities )
            // InternalBreactive.g:4805:5: lv_arguments_0_0= ruleDeclaredEntities
            {

            					newCompositeNode(grammarAccess.getEntitySetOnLocationFCExpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_arguments_0_0=ruleDeclaredEntities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitySetOnLocationFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_0_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4822:3: ( (lv_function_1_0= ruleEntitySetOnLocationFunction ) )
            // InternalBreactive.g:4823:4: (lv_function_1_0= ruleEntitySetOnLocationFunction )
            {
            // InternalBreactive.g:4823:4: (lv_function_1_0= ruleEntitySetOnLocationFunction )
            // InternalBreactive.g:4824:5: lv_function_1_0= ruleEntitySetOnLocationFunction
            {

            					newCompositeNode(grammarAccess.getEntitySetOnLocationFCExpressionAccess().getFunctionEntitySetOnLocationFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_function_1_0=ruleEntitySetOnLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitySetOnLocationFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.EntitySetOnLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:4841:3: ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) )
            // InternalBreactive.g:4842:4: (lv_arguments_2_0= ruleLocationPrimitiveFCExpression )
            {
            // InternalBreactive.g:4842:4: (lv_arguments_2_0= ruleLocationPrimitiveFCExpression )
            // InternalBreactive.g:4843:5: lv_arguments_2_0= ruleLocationPrimitiveFCExpression
            {

            					newCompositeNode(grammarAccess.getEntitySetOnLocationFCExpressionAccess().getArgumentsLocationPrimitiveFCExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_arguments_2_0=ruleLocationPrimitiveFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitySetOnLocationFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_2_0,
            						"org.cirad.dsl.xtext.Breactive.LocationPrimitiveFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntitySetOnLocationFCExpression"


    // $ANTLR start "entryRuleEntitySetConditionalFCExpression"
    // InternalBreactive.g:4864:1: entryRuleEntitySetConditionalFCExpression returns [EObject current=null] : iv_ruleEntitySetConditionalFCExpression= ruleEntitySetConditionalFCExpression EOF ;
    public final EObject entryRuleEntitySetConditionalFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySetConditionalFCExpression = null;


        try {
            // InternalBreactive.g:4864:73: (iv_ruleEntitySetConditionalFCExpression= ruleEntitySetConditionalFCExpression EOF )
            // InternalBreactive.g:4865:2: iv_ruleEntitySetConditionalFCExpression= ruleEntitySetConditionalFCExpression EOF
            {
             newCompositeNode(grammarAccess.getEntitySetConditionalFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySetConditionalFCExpression=ruleEntitySetConditionalFCExpression();

            state._fsp--;

             current =iv_ruleEntitySetConditionalFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntitySetConditionalFCExpression"


    // $ANTLR start "ruleEntitySetConditionalFCExpression"
    // InternalBreactive.g:4871:1: ruleEntitySetConditionalFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleEntityNamedFunction ) )? ( ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) ) (otherlv_3= 'having ' ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) ) )? ) ;
    public final EObject ruleEntitySetConditionalFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4877:2: ( ( ( (lv_function_0_0= ruleEntityNamedFunction ) )? ( ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) ) (otherlv_3= 'having ' ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) ) )? ) )
            // InternalBreactive.g:4878:2: ( ( (lv_function_0_0= ruleEntityNamedFunction ) )? ( ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) ) (otherlv_3= 'having ' ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) ) )? )
            {
            // InternalBreactive.g:4878:2: ( ( (lv_function_0_0= ruleEntityNamedFunction ) )? ( ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) ) (otherlv_3= 'having ' ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) ) )? )
            // InternalBreactive.g:4879:3: ( (lv_function_0_0= ruleEntityNamedFunction ) )? ( ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) ) (otherlv_3= 'having ' ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) ) )?
            {
            // InternalBreactive.g:4879:3: ( (lv_function_0_0= ruleEntityNamedFunction ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==45||(LA58_0>=67 && LA58_0<=68)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBreactive.g:4880:4: (lv_function_0_0= ruleEntityNamedFunction )
                    {
                    // InternalBreactive.g:4880:4: (lv_function_0_0= ruleEntityNamedFunction )
                    // InternalBreactive.g:4881:5: lv_function_0_0= ruleEntityNamedFunction
                    {

                    					newCompositeNode(grammarAccess.getEntitySetConditionalFCExpressionAccess().getFunctionEntityNamedFunctionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_function_0_0=ruleEntityNamedFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntitySetConditionalFCExpressionRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_0_0,
                    						"org.cirad.dsl.xtext.Breactive.EntityNamedFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBreactive.g:4898:3: ( ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) ) )
            // InternalBreactive.g:4899:4: ( (lv_arguments_1_0= ruleDeclaredEntities ) ) ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) )
            {
            // InternalBreactive.g:4899:4: ( (lv_arguments_1_0= ruleDeclaredEntities ) )
            // InternalBreactive.g:4900:5: (lv_arguments_1_0= ruleDeclaredEntities )
            {
            // InternalBreactive.g:4900:5: (lv_arguments_1_0= ruleDeclaredEntities )
            // InternalBreactive.g:4901:6: lv_arguments_1_0= ruleDeclaredEntities
            {

            						newCompositeNode(grammarAccess.getEntitySetConditionalFCExpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_16);
            lv_arguments_1_0=ruleDeclaredEntities();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEntitySetConditionalFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_1_0,
            							"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBreactive.g:4918:4: ( (lv_arguments_2_0= ruleLocationPrimitiveFCExpression ) )
            // InternalBreactive.g:4919:5: (lv_arguments_2_0= ruleLocationPrimitiveFCExpression )
            {
            // InternalBreactive.g:4919:5: (lv_arguments_2_0= ruleLocationPrimitiveFCExpression )
            // InternalBreactive.g:4920:6: lv_arguments_2_0= ruleLocationPrimitiveFCExpression
            {

            						newCompositeNode(grammarAccess.getEntitySetConditionalFCExpressionAccess().getArgumentsLocationPrimitiveFCExpressionParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_49);
            lv_arguments_2_0=ruleLocationPrimitiveFCExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEntitySetConditionalFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_2_0,
            							"org.cirad.dsl.xtext.Breactive.LocationPrimitiveFCExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalBreactive.g:4938:3: (otherlv_3= 'having ' ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==78) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBreactive.g:4939:4: otherlv_3= 'having ' ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntitySetConditionalFCExpressionAccess().getHavingKeyword_2_0());
                    			
                    // InternalBreactive.g:4943:4: ( (lv_arguments_4_0= ruleBooleanLogicFCExpression ) )
                    // InternalBreactive.g:4944:5: (lv_arguments_4_0= ruleBooleanLogicFCExpression )
                    {
                    // InternalBreactive.g:4944:5: (lv_arguments_4_0= ruleBooleanLogicFCExpression )
                    // InternalBreactive.g:4945:6: lv_arguments_4_0= ruleBooleanLogicFCExpression
                    {

                    						newCompositeNode(grammarAccess.getEntitySetConditionalFCExpressionAccess().getArgumentsBooleanLogicFCExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arguments_4_0=ruleBooleanLogicFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntitySetConditionalFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"org.cirad.dsl.xtext.Breactive.BooleanLogicFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntitySetConditionalFCExpression"


    // $ANTLR start "entryRuleNumericNamedFCExpression"
    // InternalBreactive.g:4967:1: entryRuleNumericNamedFCExpression returns [EObject current=null] : iv_ruleNumericNamedFCExpression= ruleNumericNamedFCExpression EOF ;
    public final EObject entryRuleNumericNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericNamedFCExpression = null;


        try {
            // InternalBreactive.g:4967:65: (iv_ruleNumericNamedFCExpression= ruleNumericNamedFCExpression EOF )
            // InternalBreactive.g:4968:2: iv_ruleNumericNamedFCExpression= ruleNumericNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericNamedFCExpression=ruleNumericNamedFCExpression();

            state._fsp--;

             current =iv_ruleNumericNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericNamedFCExpression"


    // $ANTLR start "ruleNumericNamedFCExpression"
    // InternalBreactive.g:4974:1: ruleNumericNamedFCExpression returns [EObject current=null] : (this_ArithmeticFCExpression_0= ruleArithmeticFCExpression | this_MathFCExpression_1= ruleMathFCExpression | this_CountFCExpression_2= ruleCountFCExpression ) ;
    public final EObject ruleNumericNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticFCExpression_0 = null;

        EObject this_MathFCExpression_1 = null;

        EObject this_CountFCExpression_2 = null;



        	enterRule();

        try {
            // InternalBreactive.g:4980:2: ( (this_ArithmeticFCExpression_0= ruleArithmeticFCExpression | this_MathFCExpression_1= ruleMathFCExpression | this_CountFCExpression_2= ruleCountFCExpression ) )
            // InternalBreactive.g:4981:2: (this_ArithmeticFCExpression_0= ruleArithmeticFCExpression | this_MathFCExpression_1= ruleMathFCExpression | this_CountFCExpression_2= ruleCountFCExpression )
            {
            // InternalBreactive.g:4981:2: (this_ArithmeticFCExpression_0= ruleArithmeticFCExpression | this_MathFCExpression_1= ruleMathFCExpression | this_CountFCExpression_2= ruleCountFCExpression )
            int alt60=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case 28:
            case 35:
                {
                alt60=1;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt60=2;
                }
                break;
            case 42:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalBreactive.g:4982:3: this_ArithmeticFCExpression_0= ruleArithmeticFCExpression
                    {

                    			newCompositeNode(grammarAccess.getNumericNamedFCExpressionAccess().getArithmeticFCExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticFCExpression_0=ruleArithmeticFCExpression();

                    state._fsp--;


                    			current = this_ArithmeticFCExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:4991:3: this_MathFCExpression_1= ruleMathFCExpression
                    {

                    			newCompositeNode(grammarAccess.getNumericNamedFCExpressionAccess().getMathFCExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MathFCExpression_1=ruleMathFCExpression();

                    state._fsp--;


                    			current = this_MathFCExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBreactive.g:5000:3: this_CountFCExpression_2= ruleCountFCExpression
                    {

                    			newCompositeNode(grammarAccess.getNumericNamedFCExpressionAccess().getCountFCExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountFCExpression_2=ruleCountFCExpression();

                    state._fsp--;


                    			current = this_CountFCExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericNamedFCExpression"


    // $ANTLR start "entryRuleArithmeticFCExpression"
    // InternalBreactive.g:5012:1: entryRuleArithmeticFCExpression returns [EObject current=null] : iv_ruleArithmeticFCExpression= ruleArithmeticFCExpression EOF ;
    public final EObject entryRuleArithmeticFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticFCExpression = null;


        try {
            // InternalBreactive.g:5012:63: (iv_ruleArithmeticFCExpression= ruleArithmeticFCExpression EOF )
            // InternalBreactive.g:5013:2: iv_ruleArithmeticFCExpression= ruleArithmeticFCExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticFCExpression=ruleArithmeticFCExpression();

            state._fsp--;

             current =iv_ruleArithmeticFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticFCExpression"


    // $ANTLR start "ruleArithmeticFCExpression"
    // InternalBreactive.g:5019:1: ruleArithmeticFCExpression returns [EObject current=null] : ( (otherlv_0= '-' )? this_Addition_1= ruleAddition ) ;
    public final EObject ruleArithmeticFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Addition_1 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5025:2: ( ( (otherlv_0= '-' )? this_Addition_1= ruleAddition ) )
            // InternalBreactive.g:5026:2: ( (otherlv_0= '-' )? this_Addition_1= ruleAddition )
            {
            // InternalBreactive.g:5026:2: ( (otherlv_0= '-' )? this_Addition_1= ruleAddition )
            // InternalBreactive.g:5027:3: (otherlv_0= '-' )? this_Addition_1= ruleAddition
            {
            // InternalBreactive.g:5027:3: (otherlv_0= '-' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==35) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBreactive.g:5028:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_0, grammarAccess.getArithmeticFCExpressionAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getArithmeticFCExpressionAccess().getAdditionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Addition_1=ruleAddition();

            state._fsp--;


            			current = this_Addition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticFCExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalBreactive.g:5045:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalBreactive.g:5045:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalBreactive.g:5046:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalBreactive.g:5052:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( (lv_function_2_0= ruleArithmeticFunctionPlus ) ) ( (lv_arguments_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_function_2_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5058:2: ( (this_Multiplication_0= ruleMultiplication ( () ( (lv_function_2_0= ruleArithmeticFunctionPlus ) ) ( (lv_arguments_3_0= ruleMultiplication ) ) )* ) )
            // InternalBreactive.g:5059:2: (this_Multiplication_0= ruleMultiplication ( () ( (lv_function_2_0= ruleArithmeticFunctionPlus ) ) ( (lv_arguments_3_0= ruleMultiplication ) ) )* )
            {
            // InternalBreactive.g:5059:2: (this_Multiplication_0= ruleMultiplication ( () ( (lv_function_2_0= ruleArithmeticFunctionPlus ) ) ( (lv_arguments_3_0= ruleMultiplication ) ) )* )
            // InternalBreactive.g:5060:3: this_Multiplication_0= ruleMultiplication ( () ( (lv_function_2_0= ruleArithmeticFunctionPlus ) ) ( (lv_arguments_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBreactive.g:5068:3: ( () ( (lv_function_2_0= ruleArithmeticFunctionPlus ) ) ( (lv_arguments_3_0= ruleMultiplication ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=36 && LA62_0<=37)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalBreactive.g:5069:4: () ( (lv_function_2_0= ruleArithmeticFunctionPlus ) ) ( (lv_arguments_3_0= ruleMultiplication ) )
            	    {
            	    // InternalBreactive.g:5069:4: ()
            	    // InternalBreactive.g:5070:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditionAccess().getFunctionCallExpressionArgumentsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBreactive.g:5076:4: ( (lv_function_2_0= ruleArithmeticFunctionPlus ) )
            	    // InternalBreactive.g:5077:5: (lv_function_2_0= ruleArithmeticFunctionPlus )
            	    {
            	    // InternalBreactive.g:5077:5: (lv_function_2_0= ruleArithmeticFunctionPlus )
            	    // InternalBreactive.g:5078:6: lv_function_2_0= ruleArithmeticFunctionPlus
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getFunctionArithmeticFunctionPlusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_function_2_0=ruleArithmeticFunctionPlus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"function",
            	    							lv_function_2_0,
            	    							"org.cirad.dsl.xtext.Breactive.ArithmeticFunctionPlus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBreactive.g:5095:4: ( (lv_arguments_3_0= ruleMultiplication ) )
            	    // InternalBreactive.g:5096:5: (lv_arguments_3_0= ruleMultiplication )
            	    {
            	    // InternalBreactive.g:5096:5: (lv_arguments_3_0= ruleMultiplication )
            	    // InternalBreactive.g:5097:6: lv_arguments_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getArgumentsMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_arguments_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"org.cirad.dsl.xtext.Breactive.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalBreactive.g:5119:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalBreactive.g:5119:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalBreactive.g:5120:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalBreactive.g:5126:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryArithmeticExpression_0= rulePrimaryArithmeticExpression ( () ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) ) ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryArithmeticExpression_0 = null;

        EObject lv_function_2_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5132:2: ( (this_PrimaryArithmeticExpression_0= rulePrimaryArithmeticExpression ( () ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) ) ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) ) )* ) )
            // InternalBreactive.g:5133:2: (this_PrimaryArithmeticExpression_0= rulePrimaryArithmeticExpression ( () ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) ) ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) ) )* )
            {
            // InternalBreactive.g:5133:2: (this_PrimaryArithmeticExpression_0= rulePrimaryArithmeticExpression ( () ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) ) ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) ) )* )
            // InternalBreactive.g:5134:3: this_PrimaryArithmeticExpression_0= rulePrimaryArithmeticExpression ( () ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) ) ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryArithmeticExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_PrimaryArithmeticExpression_0=rulePrimaryArithmeticExpression();

            state._fsp--;


            			current = this_PrimaryArithmeticExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBreactive.g:5142:3: ( () ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) ) ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=34 && LA63_0<=35)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalBreactive.g:5143:4: () ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) ) ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) )
            	    {
            	    // InternalBreactive.g:5143:4: ()
            	    // InternalBreactive.g:5144:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicationAccess().getFunctionCallExpressionArgumentsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBreactive.g:5150:4: ( (lv_function_2_0= ruleArithmeticFunctionMultiplication ) )
            	    // InternalBreactive.g:5151:5: (lv_function_2_0= ruleArithmeticFunctionMultiplication )
            	    {
            	    // InternalBreactive.g:5151:5: (lv_function_2_0= ruleArithmeticFunctionMultiplication )
            	    // InternalBreactive.g:5152:6: lv_function_2_0= ruleArithmeticFunctionMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getFunctionArithmeticFunctionMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_function_2_0=ruleArithmeticFunctionMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"function",
            	    							lv_function_2_0,
            	    							"org.cirad.dsl.xtext.Breactive.ArithmeticFunctionMultiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBreactive.g:5169:4: ( (lv_arguments_3_0= rulePrimaryArithmeticExpression ) )
            	    // InternalBreactive.g:5170:5: (lv_arguments_3_0= rulePrimaryArithmeticExpression )
            	    {
            	    // InternalBreactive.g:5170:5: (lv_arguments_3_0= rulePrimaryArithmeticExpression )
            	    // InternalBreactive.g:5171:6: lv_arguments_3_0= rulePrimaryArithmeticExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getArgumentsPrimaryArithmeticExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_arguments_3_0=rulePrimaryArithmeticExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"org.cirad.dsl.xtext.Breactive.PrimaryArithmeticExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryArithmeticExpression"
    // InternalBreactive.g:5193:1: entryRulePrimaryArithmeticExpression returns [EObject current=null] : iv_rulePrimaryArithmeticExpression= rulePrimaryArithmeticExpression EOF ;
    public final EObject entryRulePrimaryArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryArithmeticExpression = null;


        try {
            // InternalBreactive.g:5193:68: (iv_rulePrimaryArithmeticExpression= rulePrimaryArithmeticExpression EOF )
            // InternalBreactive.g:5194:2: iv_rulePrimaryArithmeticExpression= rulePrimaryArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryArithmeticExpression=rulePrimaryArithmeticExpression();

            state._fsp--;

             current =iv_rulePrimaryArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryArithmeticExpression"


    // $ANTLR start "rulePrimaryArithmeticExpression"
    // InternalBreactive.g:5200:1: rulePrimaryArithmeticExpression returns [EObject current=null] : ( (otherlv_0= '(' this_NumericNamedFCExpression_1= ruleNumericNamedFCExpression otherlv_2= ')' ) | ( (lv_arguments_3_0= ruleDeclaredVariable ) ) | ( (lv_arguments_4_0= ruleConstantExpression ) ) ) ;
    public final EObject rulePrimaryArithmeticExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_NumericNamedFCExpression_1 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5206:2: ( ( (otherlv_0= '(' this_NumericNamedFCExpression_1= ruleNumericNamedFCExpression otherlv_2= ')' ) | ( (lv_arguments_3_0= ruleDeclaredVariable ) ) | ( (lv_arguments_4_0= ruleConstantExpression ) ) ) )
            // InternalBreactive.g:5207:2: ( (otherlv_0= '(' this_NumericNamedFCExpression_1= ruleNumericNamedFCExpression otherlv_2= ')' ) | ( (lv_arguments_3_0= ruleDeclaredVariable ) ) | ( (lv_arguments_4_0= ruleConstantExpression ) ) )
            {
            // InternalBreactive.g:5207:2: ( (otherlv_0= '(' this_NumericNamedFCExpression_1= ruleNumericNamedFCExpression otherlv_2= ')' ) | ( (lv_arguments_3_0= ruleDeclaredVariable ) ) | ( (lv_arguments_4_0= ruleConstantExpression ) ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt64=1;
                }
                break;
            case RULE_ID:
                {
                alt64=2;
                }
                break;
            case RULE_INT:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalBreactive.g:5208:3: (otherlv_0= '(' this_NumericNamedFCExpression_1= ruleNumericNamedFCExpression otherlv_2= ')' )
                    {
                    // InternalBreactive.g:5208:3: (otherlv_0= '(' this_NumericNamedFCExpression_1= ruleNumericNamedFCExpression otherlv_2= ')' )
                    // InternalBreactive.g:5209:4: otherlv_0= '(' this_NumericNamedFCExpression_1= ruleNumericNamedFCExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_55); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryArithmeticExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryArithmeticExpressionAccess().getNumericNamedFCExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_47);
                    this_NumericNamedFCExpression_1=ruleNumericNamedFCExpression();

                    state._fsp--;


                    				current = this_NumericNamedFCExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryArithmeticExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBreactive.g:5227:3: ( (lv_arguments_3_0= ruleDeclaredVariable ) )
                    {
                    // InternalBreactive.g:5227:3: ( (lv_arguments_3_0= ruleDeclaredVariable ) )
                    // InternalBreactive.g:5228:4: (lv_arguments_3_0= ruleDeclaredVariable )
                    {
                    // InternalBreactive.g:5228:4: (lv_arguments_3_0= ruleDeclaredVariable )
                    // InternalBreactive.g:5229:5: lv_arguments_3_0= ruleDeclaredVariable
                    {

                    					newCompositeNode(grammarAccess.getPrimaryArithmeticExpressionAccess().getArgumentsDeclaredVariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_arguments_3_0=ruleDeclaredVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryArithmeticExpressionRule());
                    					}
                    					add(
                    						current,
                    						"arguments",
                    						lv_arguments_3_0,
                    						"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBreactive.g:5247:3: ( (lv_arguments_4_0= ruleConstantExpression ) )
                    {
                    // InternalBreactive.g:5247:3: ( (lv_arguments_4_0= ruleConstantExpression ) )
                    // InternalBreactive.g:5248:4: (lv_arguments_4_0= ruleConstantExpression )
                    {
                    // InternalBreactive.g:5248:4: (lv_arguments_4_0= ruleConstantExpression )
                    // InternalBreactive.g:5249:5: lv_arguments_4_0= ruleConstantExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryArithmeticExpressionAccess().getArgumentsConstantExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_arguments_4_0=ruleConstantExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryArithmeticExpressionRule());
                    					}
                    					add(
                    						current,
                    						"arguments",
                    						lv_arguments_4_0,
                    						"org.cirad.dsl.xtext.Breactive.ConstantExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryArithmeticExpression"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalBreactive.g:5270:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalBreactive.g:5270:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalBreactive.g:5271:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // InternalBreactive.g:5277:1: ruleConstantExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleFloat ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5283:2: ( ( () ( (lv_value_1_0= ruleFloat ) ) ) )
            // InternalBreactive.g:5284:2: ( () ( (lv_value_1_0= ruleFloat ) ) )
            {
            // InternalBreactive.g:5284:2: ( () ( (lv_value_1_0= ruleFloat ) ) )
            // InternalBreactive.g:5285:3: () ( (lv_value_1_0= ruleFloat ) )
            {
            // InternalBreactive.g:5285:3: ()
            // InternalBreactive.g:5286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantExpressionAccess().getConstantExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:5292:3: ( (lv_value_1_0= ruleFloat ) )
            // InternalBreactive.g:5293:4: (lv_value_1_0= ruleFloat )
            {
            // InternalBreactive.g:5293:4: (lv_value_1_0= ruleFloat )
            // InternalBreactive.g:5294:5: lv_value_1_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getConstantExpressionAccess().getValueFloatParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.cirad.dsl.xtext.Breactive.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleCountFCExpression"
    // InternalBreactive.g:5315:1: entryRuleCountFCExpression returns [EObject current=null] : iv_ruleCountFCExpression= ruleCountFCExpression EOF ;
    public final EObject entryRuleCountFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountFCExpression = null;


        try {
            // InternalBreactive.g:5315:58: (iv_ruleCountFCExpression= ruleCountFCExpression EOF )
            // InternalBreactive.g:5316:2: iv_ruleCountFCExpression= ruleCountFCExpression EOF
            {
             newCompositeNode(grammarAccess.getCountFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountFCExpression=ruleCountFCExpression();

            state._fsp--;

             current =iv_ruleCountFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountFCExpression"


    // $ANTLR start "ruleCountFCExpression"
    // InternalBreactive.g:5322:1: ruleCountFCExpression returns [EObject current=null] : (this_CountVariableFCExpression_0= ruleCountVariableFCExpression | this_CountEntityFCExpression_1= ruleCountEntityFCExpression ) ;
    public final EObject ruleCountFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CountVariableFCExpression_0 = null;

        EObject this_CountEntityFCExpression_1 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5328:2: ( (this_CountVariableFCExpression_0= ruleCountVariableFCExpression | this_CountEntityFCExpression_1= ruleCountEntityFCExpression ) )
            // InternalBreactive.g:5329:2: (this_CountVariableFCExpression_0= ruleCountVariableFCExpression | this_CountEntityFCExpression_1= ruleCountEntityFCExpression )
            {
            // InternalBreactive.g:5329:2: (this_CountVariableFCExpression_0= ruleCountVariableFCExpression | this_CountEntityFCExpression_1= ruleCountEntityFCExpression )
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalBreactive.g:5330:3: this_CountVariableFCExpression_0= ruleCountVariableFCExpression
                    {

                    			newCompositeNode(grammarAccess.getCountFCExpressionAccess().getCountVariableFCExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountVariableFCExpression_0=ruleCountVariableFCExpression();

                    state._fsp--;


                    			current = this_CountVariableFCExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:5339:3: this_CountEntityFCExpression_1= ruleCountEntityFCExpression
                    {

                    			newCompositeNode(grammarAccess.getCountFCExpressionAccess().getCountEntityFCExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountEntityFCExpression_1=ruleCountEntityFCExpression();

                    state._fsp--;


                    			current = this_CountEntityFCExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountFCExpression"


    // $ANTLR start "entryRuleCountVariableFCExpression"
    // InternalBreactive.g:5351:1: entryRuleCountVariableFCExpression returns [EObject current=null] : iv_ruleCountVariableFCExpression= ruleCountVariableFCExpression EOF ;
    public final EObject entryRuleCountVariableFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountVariableFCExpression = null;


        try {
            // InternalBreactive.g:5351:66: (iv_ruleCountVariableFCExpression= ruleCountVariableFCExpression EOF )
            // InternalBreactive.g:5352:2: iv_ruleCountVariableFCExpression= ruleCountVariableFCExpression EOF
            {
             newCompositeNode(grammarAccess.getCountVariableFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountVariableFCExpression=ruleCountVariableFCExpression();

            state._fsp--;

             current =iv_ruleCountVariableFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountVariableFCExpression"


    // $ANTLR start "ruleCountVariableFCExpression"
    // InternalBreactive.g:5358:1: ruleCountVariableFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredVariable ) ) otherlv_3= ')' ) ;
    public final EObject ruleCountVariableFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5364:2: ( ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredVariable ) ) otherlv_3= ')' ) )
            // InternalBreactive.g:5365:2: ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredVariable ) ) otherlv_3= ')' )
            {
            // InternalBreactive.g:5365:2: ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredVariable ) ) otherlv_3= ')' )
            // InternalBreactive.g:5366:3: ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleDeclaredVariable ) ) otherlv_3= ')'
            {
            // InternalBreactive.g:5366:3: ( (lv_function_0_0= ruleCountFunction ) )
            // InternalBreactive.g:5367:4: (lv_function_0_0= ruleCountFunction )
            {
            // InternalBreactive.g:5367:4: (lv_function_0_0= ruleCountFunction )
            // InternalBreactive.g:5368:5: lv_function_0_0= ruleCountFunction
            {

            					newCompositeNode(grammarAccess.getCountVariableFCExpressionAccess().getFunctionCountFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_function_0_0=ruleCountFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountVariableFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.CountFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCountVariableFCExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBreactive.g:5389:3: ( (lv_arguments_2_0= ruleDeclaredVariable ) )
            // InternalBreactive.g:5390:4: (lv_arguments_2_0= ruleDeclaredVariable )
            {
            // InternalBreactive.g:5390:4: (lv_arguments_2_0= ruleDeclaredVariable )
            // InternalBreactive.g:5391:5: lv_arguments_2_0= ruleDeclaredVariable
            {

            					newCompositeNode(grammarAccess.getCountVariableFCExpressionAccess().getArgumentsDeclaredVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_arguments_2_0=ruleDeclaredVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountVariableFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_2_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCountVariableFCExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountVariableFCExpression"


    // $ANTLR start "entryRuleCountEntityFCExpression"
    // InternalBreactive.g:5416:1: entryRuleCountEntityFCExpression returns [EObject current=null] : iv_ruleCountEntityFCExpression= ruleCountEntityFCExpression EOF ;
    public final EObject entryRuleCountEntityFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountEntityFCExpression = null;


        try {
            // InternalBreactive.g:5416:64: (iv_ruleCountEntityFCExpression= ruleCountEntityFCExpression EOF )
            // InternalBreactive.g:5417:2: iv_ruleCountEntityFCExpression= ruleCountEntityFCExpression EOF
            {
             newCompositeNode(grammarAccess.getCountEntityFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountEntityFCExpression=ruleCountEntityFCExpression();

            state._fsp--;

             current =iv_ruleCountEntityFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountEntityFCExpression"


    // $ANTLR start "ruleCountEntityFCExpression"
    // InternalBreactive.g:5423:1: ruleCountEntityFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleEntitySetConditionalFCExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCountEntityFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5429:2: ( ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleEntitySetConditionalFCExpression ) ) otherlv_3= ')' ) )
            // InternalBreactive.g:5430:2: ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleEntitySetConditionalFCExpression ) ) otherlv_3= ')' )
            {
            // InternalBreactive.g:5430:2: ( ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleEntitySetConditionalFCExpression ) ) otherlv_3= ')' )
            // InternalBreactive.g:5431:3: ( (lv_function_0_0= ruleCountFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleEntitySetConditionalFCExpression ) ) otherlv_3= ')'
            {
            // InternalBreactive.g:5431:3: ( (lv_function_0_0= ruleCountFunction ) )
            // InternalBreactive.g:5432:4: (lv_function_0_0= ruleCountFunction )
            {
            // InternalBreactive.g:5432:4: (lv_function_0_0= ruleCountFunction )
            // InternalBreactive.g:5433:5: lv_function_0_0= ruleCountFunction
            {

            					newCompositeNode(grammarAccess.getCountEntityFCExpressionAccess().getFunctionCountFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_function_0_0=ruleCountFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountEntityFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.CountFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getCountEntityFCExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBreactive.g:5454:3: ( (lv_arguments_2_0= ruleEntitySetConditionalFCExpression ) )
            // InternalBreactive.g:5455:4: (lv_arguments_2_0= ruleEntitySetConditionalFCExpression )
            {
            // InternalBreactive.g:5455:4: (lv_arguments_2_0= ruleEntitySetConditionalFCExpression )
            // InternalBreactive.g:5456:5: lv_arguments_2_0= ruleEntitySetConditionalFCExpression
            {

            					newCompositeNode(grammarAccess.getCountEntityFCExpressionAccess().getArgumentsEntitySetConditionalFCExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_arguments_2_0=ruleEntitySetConditionalFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountEntityFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_2_0,
            						"org.cirad.dsl.xtext.Breactive.EntitySetConditionalFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCountEntityFCExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountEntityFCExpression"


    // $ANTLR start "entryRuleMathFCExpression"
    // InternalBreactive.g:5481:1: entryRuleMathFCExpression returns [EObject current=null] : iv_ruleMathFCExpression= ruleMathFCExpression EOF ;
    public final EObject entryRuleMathFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathFCExpression = null;


        try {
            // InternalBreactive.g:5481:57: (iv_ruleMathFCExpression= ruleMathFCExpression EOF )
            // InternalBreactive.g:5482:2: iv_ruleMathFCExpression= ruleMathFCExpression EOF
            {
             newCompositeNode(grammarAccess.getMathFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathFCExpression=ruleMathFCExpression();

            state._fsp--;

             current =iv_ruleMathFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathFCExpression"


    // $ANTLR start "ruleMathFCExpression"
    // InternalBreactive.g:5488:1: ruleMathFCExpression returns [EObject current=null] : ( ( (lv_function_0_0= ruleMathFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleNumericNamedFCExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleMathFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_function_0_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5494:2: ( ( ( (lv_function_0_0= ruleMathFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleNumericNamedFCExpression ) ) otherlv_3= ')' ) )
            // InternalBreactive.g:5495:2: ( ( (lv_function_0_0= ruleMathFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleNumericNamedFCExpression ) ) otherlv_3= ')' )
            {
            // InternalBreactive.g:5495:2: ( ( (lv_function_0_0= ruleMathFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleNumericNamedFCExpression ) ) otherlv_3= ')' )
            // InternalBreactive.g:5496:3: ( (lv_function_0_0= ruleMathFunction ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleNumericNamedFCExpression ) ) otherlv_3= ')'
            {
            // InternalBreactive.g:5496:3: ( (lv_function_0_0= ruleMathFunction ) )
            // InternalBreactive.g:5497:4: (lv_function_0_0= ruleMathFunction )
            {
            // InternalBreactive.g:5497:4: (lv_function_0_0= ruleMathFunction )
            // InternalBreactive.g:5498:5: lv_function_0_0= ruleMathFunction
            {

            					newCompositeNode(grammarAccess.getMathFCExpressionAccess().getFunctionMathFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_function_0_0=ruleMathFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"org.cirad.dsl.xtext.Breactive.MathFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getMathFCExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBreactive.g:5519:3: ( (lv_arguments_2_0= ruleNumericNamedFCExpression ) )
            // InternalBreactive.g:5520:4: (lv_arguments_2_0= ruleNumericNamedFCExpression )
            {
            // InternalBreactive.g:5520:4: (lv_arguments_2_0= ruleNumericNamedFCExpression )
            // InternalBreactive.g:5521:5: lv_arguments_2_0= ruleNumericNamedFCExpression
            {

            					newCompositeNode(grammarAccess.getMathFCExpressionAccess().getArgumentsNumericNamedFCExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_arguments_2_0=ruleNumericNamedFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_2_0,
            						"org.cirad.dsl.xtext.Breactive.NumericNamedFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMathFCExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathFCExpression"


    // $ANTLR start "entryRuleGetNamedFCExpression"
    // InternalBreactive.g:5546:1: entryRuleGetNamedFCExpression returns [EObject current=null] : iv_ruleGetNamedFCExpression= ruleGetNamedFCExpression EOF ;
    public final EObject entryRuleGetNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetNamedFCExpression = null;


        try {
            // InternalBreactive.g:5546:61: (iv_ruleGetNamedFCExpression= ruleGetNamedFCExpression EOF )
            // InternalBreactive.g:5547:2: iv_ruleGetNamedFCExpression= ruleGetNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getGetNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetNamedFCExpression=ruleGetNamedFCExpression();

            state._fsp--;

             current =iv_ruleGetNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetNamedFCExpression"


    // $ANTLR start "ruleGetNamedFCExpression"
    // InternalBreactive.g:5553:1: ruleGetNamedFCExpression returns [EObject current=null] : this_GetAttributeFromEntityFCExpression_0= ruleGetAttributeFromEntityFCExpression ;
    public final EObject ruleGetNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GetAttributeFromEntityFCExpression_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5559:2: (this_GetAttributeFromEntityFCExpression_0= ruleGetAttributeFromEntityFCExpression )
            // InternalBreactive.g:5560:2: this_GetAttributeFromEntityFCExpression_0= ruleGetAttributeFromEntityFCExpression
            {

            		newCompositeNode(grammarAccess.getGetNamedFCExpressionAccess().getGetAttributeFromEntityFCExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_GetAttributeFromEntityFCExpression_0=ruleGetAttributeFromEntityFCExpression();

            state._fsp--;


            		current = this_GetAttributeFromEntityFCExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetNamedFCExpression"


    // $ANTLR start "entryRuleGetAttributeFromEntityFCExpression"
    // InternalBreactive.g:5571:1: entryRuleGetAttributeFromEntityFCExpression returns [EObject current=null] : iv_ruleGetAttributeFromEntityFCExpression= ruleGetAttributeFromEntityFCExpression EOF ;
    public final EObject entryRuleGetAttributeFromEntityFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeFromEntityFCExpression = null;


        try {
            // InternalBreactive.g:5571:75: (iv_ruleGetAttributeFromEntityFCExpression= ruleGetAttributeFromEntityFCExpression EOF )
            // InternalBreactive.g:5572:2: iv_ruleGetAttributeFromEntityFCExpression= ruleGetAttributeFromEntityFCExpression EOF
            {
             newCompositeNode(grammarAccess.getGetAttributeFromEntityFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetAttributeFromEntityFCExpression=ruleGetAttributeFromEntityFCExpression();

            state._fsp--;

             current =iv_ruleGetAttributeFromEntityFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetAttributeFromEntityFCExpression"


    // $ANTLR start "ruleGetAttributeFromEntityFCExpression"
    // InternalBreactive.g:5578:1: ruleGetAttributeFromEntityFCExpression returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleDeclaredVariable ) ) ( (lv_function_1_0= ruleGetVariableFunction ) ) ( ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )? ) ;
    public final EObject ruleGetAttributeFromEntityFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_arguments_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_arguments_2_1 = null;

        EObject lv_arguments_2_2 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5584:2: ( ( ( (lv_arguments_0_0= ruleDeclaredVariable ) ) ( (lv_function_1_0= ruleGetVariableFunction ) ) ( ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )? ) )
            // InternalBreactive.g:5585:2: ( ( (lv_arguments_0_0= ruleDeclaredVariable ) ) ( (lv_function_1_0= ruleGetVariableFunction ) ) ( ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )? )
            {
            // InternalBreactive.g:5585:2: ( ( (lv_arguments_0_0= ruleDeclaredVariable ) ) ( (lv_function_1_0= ruleGetVariableFunction ) ) ( ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )? )
            // InternalBreactive.g:5586:3: ( (lv_arguments_0_0= ruleDeclaredVariable ) ) ( (lv_function_1_0= ruleGetVariableFunction ) ) ( ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) ) ) (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )?
            {
            // InternalBreactive.g:5586:3: ( (lv_arguments_0_0= ruleDeclaredVariable ) )
            // InternalBreactive.g:5587:4: (lv_arguments_0_0= ruleDeclaredVariable )
            {
            // InternalBreactive.g:5587:4: (lv_arguments_0_0= ruleDeclaredVariable )
            // InternalBreactive.g:5588:5: lv_arguments_0_0= ruleDeclaredVariable
            {

            					newCompositeNode(grammarAccess.getGetAttributeFromEntityFCExpressionAccess().getArgumentsDeclaredVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
            lv_arguments_0_0=ruleDeclaredVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetAttributeFromEntityFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_0_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:5605:3: ( (lv_function_1_0= ruleGetVariableFunction ) )
            // InternalBreactive.g:5606:4: (lv_function_1_0= ruleGetVariableFunction )
            {
            // InternalBreactive.g:5606:4: (lv_function_1_0= ruleGetVariableFunction )
            // InternalBreactive.g:5607:5: lv_function_1_0= ruleGetVariableFunction
            {

            					newCompositeNode(grammarAccess.getGetAttributeFromEntityFCExpressionAccess().getFunctionGetVariableFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_56);
            lv_function_1_0=ruleGetVariableFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetAttributeFromEntityFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.GetVariableFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:5624:3: ( ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) ) )
            // InternalBreactive.g:5625:4: ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) )
            {
            // InternalBreactive.g:5625:4: ( (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities ) )
            // InternalBreactive.g:5626:5: (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities )
            {
            // InternalBreactive.g:5626:5: (lv_arguments_2_1= ruleEntityNamedFCExpression | lv_arguments_2_2= ruleDeclaredEntities )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==45) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalBreactive.g:5627:6: lv_arguments_2_1= ruleEntityNamedFCExpression
                    {

                    						newCompositeNode(grammarAccess.getGetAttributeFromEntityFCExpressionAccess().getArgumentsEntityNamedFCExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_arguments_2_1=ruleEntityNamedFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGetAttributeFromEntityFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_1,
                    							"org.cirad.dsl.xtext.Breactive.EntityNamedFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:5643:6: lv_arguments_2_2= ruleDeclaredEntities
                    {

                    						newCompositeNode(grammarAccess.getGetAttributeFromEntityFCExpressionAccess().getArgumentsDeclaredEntitiesParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_57);
                    lv_arguments_2_2=ruleDeclaredEntities();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGetAttributeFromEntityFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_2,
                    							"org.cirad.dsl.xtext.Breactive.DeclaredEntities");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalBreactive.g:5661:3: (otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==79) ) {
                int LA67_1 = input.LA(2);

                if ( ((LA67_1>=43 && LA67_1<=52)) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalBreactive.g:5662:4: otherlv_3= 'from ' ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) )
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getGetAttributeFromEntityFCExpressionAccess().getFromKeyword_3_0());
                    			
                    // InternalBreactive.g:5666:4: ( (lv_arguments_4_0= ruleLocationNamedFCExpression ) )
                    // InternalBreactive.g:5667:5: (lv_arguments_4_0= ruleLocationNamedFCExpression )
                    {
                    // InternalBreactive.g:5667:5: (lv_arguments_4_0= ruleLocationNamedFCExpression )
                    // InternalBreactive.g:5668:6: lv_arguments_4_0= ruleLocationNamedFCExpression
                    {

                    						newCompositeNode(grammarAccess.getGetAttributeFromEntityFCExpressionAccess().getArgumentsLocationNamedFCExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arguments_4_0=ruleLocationNamedFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGetAttributeFromEntityFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetAttributeFromEntityFCExpression"


    // $ANTLR start "entryRuleMaxOneOfLocationFCExpression"
    // InternalBreactive.g:5690:1: entryRuleMaxOneOfLocationFCExpression returns [EObject current=null] : iv_ruleMaxOneOfLocationFCExpression= ruleMaxOneOfLocationFCExpression EOF ;
    public final EObject entryRuleMaxOneOfLocationFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOneOfLocationFCExpression = null;


        try {
            // InternalBreactive.g:5690:69: (iv_ruleMaxOneOfLocationFCExpression= ruleMaxOneOfLocationFCExpression EOF )
            // InternalBreactive.g:5691:2: iv_ruleMaxOneOfLocationFCExpression= ruleMaxOneOfLocationFCExpression EOF
            {
             newCompositeNode(grammarAccess.getMaxOneOfLocationFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxOneOfLocationFCExpression=ruleMaxOneOfLocationFCExpression();

            state._fsp--;

             current =iv_ruleMaxOneOfLocationFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxOneOfLocationFCExpression"


    // $ANTLR start "ruleMaxOneOfLocationFCExpression"
    // InternalBreactive.g:5697:1: ruleMaxOneOfLocationFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleMaxOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleDeclaredAttributes ) ) otherlv_4= ',' ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) ) ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )? otherlv_7= ']' ) ) ;
    public final EObject ruleMaxOneOfLocationFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_1 = null;

        EObject lv_arguments_5_2 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5703:2: ( ( () ( (lv_function_1_0= ruleMaxOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleDeclaredAttributes ) ) otherlv_4= ',' ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) ) ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )? otherlv_7= ']' ) ) )
            // InternalBreactive.g:5704:2: ( () ( (lv_function_1_0= ruleMaxOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleDeclaredAttributes ) ) otherlv_4= ',' ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) ) ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )? otherlv_7= ']' ) )
            {
            // InternalBreactive.g:5704:2: ( () ( (lv_function_1_0= ruleMaxOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleDeclaredAttributes ) ) otherlv_4= ',' ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) ) ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )? otherlv_7= ']' ) )
            // InternalBreactive.g:5705:3: () ( (lv_function_1_0= ruleMaxOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleDeclaredAttributes ) ) otherlv_4= ',' ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) ) ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )? otherlv_7= ']' )
            {
            // InternalBreactive.g:5705:3: ()
            // InternalBreactive.g:5706:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxOneOfLocationFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:5712:3: ( (lv_function_1_0= ruleMaxOneOfLocationFunction ) )
            // InternalBreactive.g:5713:4: (lv_function_1_0= ruleMaxOneOfLocationFunction )
            {
            // InternalBreactive.g:5713:4: (lv_function_1_0= ruleMaxOneOfLocationFunction )
            // InternalBreactive.g:5714:5: lv_function_1_0= ruleMaxOneOfLocationFunction
            {

            					newCompositeNode(grammarAccess.getMaxOneOfLocationFCExpressionAccess().getFunctionMaxOneOfLocationFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
            lv_function_1_0=ruleMaxOneOfLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxOneOfLocationFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.MaxOneOfLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:5731:3: (otherlv_2= '[' ( (lv_arguments_3_0= ruleDeclaredAttributes ) ) otherlv_4= ',' ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) ) ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )? otherlv_7= ']' )
            // InternalBreactive.g:5732:4: otherlv_2= '[' ( (lv_arguments_3_0= ruleDeclaredAttributes ) ) otherlv_4= ',' ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) ) ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )? otherlv_7= ']'
            {
            otherlv_2=(Token)match(input,80,FOLLOW_15); 

            				newLeafNode(otherlv_2, grammarAccess.getMaxOneOfLocationFCExpressionAccess().getLeftSquareBracketKeyword_2_0());
            			
            // InternalBreactive.g:5736:4: ( (lv_arguments_3_0= ruleDeclaredAttributes ) )
            // InternalBreactive.g:5737:5: (lv_arguments_3_0= ruleDeclaredAttributes )
            {
            // InternalBreactive.g:5737:5: (lv_arguments_3_0= ruleDeclaredAttributes )
            // InternalBreactive.g:5738:6: lv_arguments_3_0= ruleDeclaredAttributes
            {

            						newCompositeNode(grammarAccess.getMaxOneOfLocationFCExpressionAccess().getArgumentsDeclaredAttributesParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_50);
            lv_arguments_3_0=ruleDeclaredAttributes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMaxOneOfLocationFCExpressionRule());
            						}
            						add(
            							current,
            							"arguments",
            							lv_arguments_3_0,
            							"org.cirad.dsl.xtext.Breactive.DeclaredAttributes");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_59); 

            				newLeafNode(otherlv_4, grammarAccess.getMaxOneOfLocationFCExpressionAccess().getCommaKeyword_2_2());
            			
            // InternalBreactive.g:5759:4: ( ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) ) )
            // InternalBreactive.g:5760:5: ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) )
            {
            // InternalBreactive.g:5760:5: ( (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression ) )
            // InternalBreactive.g:5761:6: (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression )
            {
            // InternalBreactive.g:5761:6: (lv_arguments_5_1= ruleSelectConditionalLocationFCExpression | lv_arguments_5_2= ruleUnionLocationFCExpression )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==44) ) {
                alt68=1;
            }
            else if ( (LA68_0==53) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalBreactive.g:5762:7: lv_arguments_5_1= ruleSelectConditionalLocationFCExpression
                    {

                    							newCompositeNode(grammarAccess.getMaxOneOfLocationFCExpressionAccess().getArgumentsSelectConditionalLocationFCExpressionParserRuleCall_2_3_0_0());
                    						
                    pushFollow(FOLLOW_60);
                    lv_arguments_5_1=ruleSelectConditionalLocationFCExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMaxOneOfLocationFCExpressionRule());
                    							}
                    							add(
                    								current,
                    								"arguments",
                    								lv_arguments_5_1,
                    								"org.cirad.dsl.xtext.Breactive.SelectConditionalLocationFCExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }
                    break;
                case 2 :
                    // InternalBreactive.g:5778:7: lv_arguments_5_2= ruleUnionLocationFCExpression
                    {

                    							newCompositeNode(grammarAccess.getMaxOneOfLocationFCExpressionAccess().getArgumentsUnionLocationFCExpressionParserRuleCall_2_3_0_1());
                    						
                    pushFollow(FOLLOW_60);
                    lv_arguments_5_2=ruleUnionLocationFCExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMaxOneOfLocationFCExpressionRule());
                    							}
                    							add(
                    								current,
                    								"arguments",
                    								lv_arguments_5_2,
                    								"org.cirad.dsl.xtext.Breactive.UnionLocationFCExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }
                    break;

            }


            }


            }

            // InternalBreactive.g:5796:4: ( (lv_arguments_6_0= ruleUnionLocationFCExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalBreactive.g:5797:5: (lv_arguments_6_0= ruleUnionLocationFCExpression )
                    {
                    // InternalBreactive.g:5797:5: (lv_arguments_6_0= ruleUnionLocationFCExpression )
                    // InternalBreactive.g:5798:6: lv_arguments_6_0= ruleUnionLocationFCExpression
                    {

                    						newCompositeNode(grammarAccess.getMaxOneOfLocationFCExpressionAccess().getArgumentsUnionLocationFCExpressionParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_arguments_6_0=ruleUnionLocationFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaxOneOfLocationFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_6_0,
                    							"org.cirad.dsl.xtext.Breactive.UnionLocationFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,81,FOLLOW_2); 

            				newLeafNode(otherlv_7, grammarAccess.getMaxOneOfLocationFCExpressionAccess().getRightSquareBracketKeyword_2_5());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxOneOfLocationFCExpression"


    // $ANTLR start "entryRuleOneOfLocationFCExpression"
    // InternalBreactive.g:5824:1: entryRuleOneOfLocationFCExpression returns [EObject current=null] : iv_ruleOneOfLocationFCExpression= ruleOneOfLocationFCExpression EOF ;
    public final EObject entryRuleOneOfLocationFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneOfLocationFCExpression = null;


        try {
            // InternalBreactive.g:5824:66: (iv_ruleOneOfLocationFCExpression= ruleOneOfLocationFCExpression EOF )
            // InternalBreactive.g:5825:2: iv_ruleOneOfLocationFCExpression= ruleOneOfLocationFCExpression EOF
            {
             newCompositeNode(grammarAccess.getOneOfLocationFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneOfLocationFCExpression=ruleOneOfLocationFCExpression();

            state._fsp--;

             current =iv_ruleOneOfLocationFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneOfLocationFCExpression"


    // $ANTLR start "ruleOneOfLocationFCExpression"
    // InternalBreactive.g:5831:1: ruleOneOfLocationFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )? ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )? ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )? otherlv_6= ']' ) ) ;
    public final EObject ruleOneOfLocationFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5837:2: ( ( () ( (lv_function_1_0= ruleOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )? ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )? ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )? otherlv_6= ']' ) ) )
            // InternalBreactive.g:5838:2: ( () ( (lv_function_1_0= ruleOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )? ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )? ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )? otherlv_6= ']' ) )
            {
            // InternalBreactive.g:5838:2: ( () ( (lv_function_1_0= ruleOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )? ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )? ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )? otherlv_6= ']' ) )
            // InternalBreactive.g:5839:3: () ( (lv_function_1_0= ruleOneOfLocationFunction ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )? ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )? ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )? otherlv_6= ']' )
            {
            // InternalBreactive.g:5839:3: ()
            // InternalBreactive.g:5840:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOneOfLocationFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:5846:3: ( (lv_function_1_0= ruleOneOfLocationFunction ) )
            // InternalBreactive.g:5847:4: (lv_function_1_0= ruleOneOfLocationFunction )
            {
            // InternalBreactive.g:5847:4: (lv_function_1_0= ruleOneOfLocationFunction )
            // InternalBreactive.g:5848:5: lv_function_1_0= ruleOneOfLocationFunction
            {

            					newCompositeNode(grammarAccess.getOneOfLocationFCExpressionAccess().getFunctionOneOfLocationFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
            lv_function_1_0=ruleOneOfLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneOfLocationFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.OneOfLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:5865:3: (otherlv_2= '[' ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )? ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )? ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )? otherlv_6= ']' )
            // InternalBreactive.g:5866:4: otherlv_2= '[' ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )? ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )? ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )? otherlv_6= ']'
            {
            otherlv_2=(Token)match(input,80,FOLLOW_62); 

            				newLeafNode(otherlv_2, grammarAccess.getOneOfLocationFCExpressionAccess().getLeftSquareBracketKeyword_2_0());
            			
            // InternalBreactive.g:5870:4: ( (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==44) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalBreactive.g:5871:5: (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression )
                    {
                    // InternalBreactive.g:5871:5: (lv_arguments_3_0= ruleSelectConditionalLocationFCExpression )
                    // InternalBreactive.g:5872:6: lv_arguments_3_0= ruleSelectConditionalLocationFCExpression
                    {

                    						newCompositeNode(grammarAccess.getOneOfLocationFCExpressionAccess().getArgumentsSelectConditionalLocationFCExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_arguments_3_0=ruleSelectConditionalLocationFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOneOfLocationFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.cirad.dsl.xtext.Breactive.SelectConditionalLocationFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalBreactive.g:5889:4: ( (lv_arguments_4_0= ruleLocationSetNamedFCExpression ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==50||(LA71_0>=52 && LA71_0<=53)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalBreactive.g:5890:5: (lv_arguments_4_0= ruleLocationSetNamedFCExpression )
                    {
                    // InternalBreactive.g:5890:5: (lv_arguments_4_0= ruleLocationSetNamedFCExpression )
                    // InternalBreactive.g:5891:6: lv_arguments_4_0= ruleLocationSetNamedFCExpression
                    {

                    						newCompositeNode(grammarAccess.getOneOfLocationFCExpressionAccess().getArgumentsLocationSetNamedFCExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_arguments_4_0=ruleLocationSetNamedFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOneOfLocationFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"org.cirad.dsl.xtext.Breactive.LocationSetNamedFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalBreactive.g:5908:4: ( (lv_arguments_5_0= ruleDeclaredLocalVariable ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBreactive.g:5909:5: (lv_arguments_5_0= ruleDeclaredLocalVariable )
                    {
                    // InternalBreactive.g:5909:5: (lv_arguments_5_0= ruleDeclaredLocalVariable )
                    // InternalBreactive.g:5910:6: lv_arguments_5_0= ruleDeclaredLocalVariable
                    {

                    						newCompositeNode(grammarAccess.getOneOfLocationFCExpressionAccess().getArgumentsDeclaredLocalVariableParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_arguments_5_0=ruleDeclaredLocalVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOneOfLocationFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"org.cirad.dsl.xtext.Breactive.DeclaredLocalVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,81,FOLLOW_2); 

            				newLeafNode(otherlv_6, grammarAccess.getOneOfLocationFCExpressionAccess().getRightSquareBracketKeyword_2_4());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneOfLocationFCExpression"


    // $ANTLR start "entryRuleSelectConditionalLocationFCExpression"
    // InternalBreactive.g:5936:1: entryRuleSelectConditionalLocationFCExpression returns [EObject current=null] : iv_ruleSelectConditionalLocationFCExpression= ruleSelectConditionalLocationFCExpression EOF ;
    public final EObject entryRuleSelectConditionalLocationFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConditionalLocationFCExpression = null;


        try {
            // InternalBreactive.g:5936:78: (iv_ruleSelectConditionalLocationFCExpression= ruleSelectConditionalLocationFCExpression EOF )
            // InternalBreactive.g:5937:2: iv_ruleSelectConditionalLocationFCExpression= ruleSelectConditionalLocationFCExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectConditionalLocationFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectConditionalLocationFCExpression=ruleSelectConditionalLocationFCExpression();

            state._fsp--;

             current =iv_ruleSelectConditionalLocationFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectConditionalLocationFCExpression"


    // $ANTLR start "ruleSelectConditionalLocationFCExpression"
    // InternalBreactive.g:5943:1: ruleSelectConditionalLocationFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleSelectConditionalLocationFunction ) ) otherlv_2= 'from [' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= ']' otherlv_5= 'such that' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) ) ;
    public final EObject ruleSelectConditionalLocationFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:5949:2: ( ( () ( (lv_function_1_0= ruleSelectConditionalLocationFunction ) ) otherlv_2= 'from [' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= ']' otherlv_5= 'such that' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) ) )
            // InternalBreactive.g:5950:2: ( () ( (lv_function_1_0= ruleSelectConditionalLocationFunction ) ) otherlv_2= 'from [' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= ']' otherlv_5= 'such that' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) )
            {
            // InternalBreactive.g:5950:2: ( () ( (lv_function_1_0= ruleSelectConditionalLocationFunction ) ) otherlv_2= 'from [' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= ']' otherlv_5= 'such that' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) ) )
            // InternalBreactive.g:5951:3: () ( (lv_function_1_0= ruleSelectConditionalLocationFunction ) ) otherlv_2= 'from [' ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) ) otherlv_4= ']' otherlv_5= 'such that' ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) )
            {
            // InternalBreactive.g:5951:3: ()
            // InternalBreactive.g:5952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectConditionalLocationFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:5958:3: ( (lv_function_1_0= ruleSelectConditionalLocationFunction ) )
            // InternalBreactive.g:5959:4: (lv_function_1_0= ruleSelectConditionalLocationFunction )
            {
            // InternalBreactive.g:5959:4: (lv_function_1_0= ruleSelectConditionalLocationFunction )
            // InternalBreactive.g:5960:5: lv_function_1_0= ruleSelectConditionalLocationFunction
            {

            					newCompositeNode(grammarAccess.getSelectConditionalLocationFCExpressionAccess().getFunctionSelectConditionalLocationFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
            lv_function_1_0=ruleSelectConditionalLocationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectConditionalLocationFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.SelectConditionalLocationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,82,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectConditionalLocationFCExpressionAccess().getFromKeyword_2());
            		
            // InternalBreactive.g:5981:3: ( (lv_arguments_3_0= ruleLocationPrimitiveFCExpression ) )
            // InternalBreactive.g:5982:4: (lv_arguments_3_0= ruleLocationPrimitiveFCExpression )
            {
            // InternalBreactive.g:5982:4: (lv_arguments_3_0= ruleLocationPrimitiveFCExpression )
            // InternalBreactive.g:5983:5: lv_arguments_3_0= ruleLocationPrimitiveFCExpression
            {

            					newCompositeNode(grammarAccess.getSelectConditionalLocationFCExpressionAccess().getArgumentsLocationPrimitiveFCExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_61);
            lv_arguments_3_0=ruleLocationPrimitiveFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectConditionalLocationFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_3_0,
            						"org.cirad.dsl.xtext.Breactive.LocationPrimitiveFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,81,FOLLOW_65); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectConditionalLocationFCExpressionAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,83,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getSelectConditionalLocationFCExpressionAccess().getSuchThatKeyword_5());
            		
            // InternalBreactive.g:6008:3: ( (lv_arguments_6_0= ruleBooleanLogicFCExpression ) )
            // InternalBreactive.g:6009:4: (lv_arguments_6_0= ruleBooleanLogicFCExpression )
            {
            // InternalBreactive.g:6009:4: (lv_arguments_6_0= ruleBooleanLogicFCExpression )
            // InternalBreactive.g:6010:5: lv_arguments_6_0= ruleBooleanLogicFCExpression
            {

            					newCompositeNode(grammarAccess.getSelectConditionalLocationFCExpressionAccess().getArgumentsBooleanLogicFCExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_arguments_6_0=ruleBooleanLogicFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectConditionalLocationFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_6_0,
            						"org.cirad.dsl.xtext.Breactive.BooleanLogicFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectConditionalLocationFCExpression"


    // $ANTLR start "entryRuleLocationPrimitiveFCExpression"
    // InternalBreactive.g:6031:1: entryRuleLocationPrimitiveFCExpression returns [EObject current=null] : iv_ruleLocationPrimitiveFCExpression= ruleLocationPrimitiveFCExpression EOF ;
    public final EObject entryRuleLocationPrimitiveFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationPrimitiveFCExpression = null;


        try {
            // InternalBreactive.g:6031:70: (iv_ruleLocationPrimitiveFCExpression= ruleLocationPrimitiveFCExpression EOF )
            // InternalBreactive.g:6032:2: iv_ruleLocationPrimitiveFCExpression= ruleLocationPrimitiveFCExpression EOF
            {
             newCompositeNode(grammarAccess.getLocationPrimitiveFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationPrimitiveFCExpression=ruleLocationPrimitiveFCExpression();

            state._fsp--;

             current =iv_ruleLocationPrimitiveFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationPrimitiveFCExpression"


    // $ANTLR start "ruleLocationPrimitiveFCExpression"
    // InternalBreactive.g:6038:1: ruleLocationPrimitiveFCExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleLocationPrimitiveFunction ) ) ) ;
    public final EObject ruleLocationPrimitiveFCExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6044:2: ( ( () ( (lv_function_1_0= ruleLocationPrimitiveFunction ) ) ) )
            // InternalBreactive.g:6045:2: ( () ( (lv_function_1_0= ruleLocationPrimitiveFunction ) ) )
            {
            // InternalBreactive.g:6045:2: ( () ( (lv_function_1_0= ruleLocationPrimitiveFunction ) ) )
            // InternalBreactive.g:6046:3: () ( (lv_function_1_0= ruleLocationPrimitiveFunction ) )
            {
            // InternalBreactive.g:6046:3: ()
            // InternalBreactive.g:6047:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationPrimitiveFCExpressionAccess().getFunctionCallExpressionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6053:3: ( (lv_function_1_0= ruleLocationPrimitiveFunction ) )
            // InternalBreactive.g:6054:4: (lv_function_1_0= ruleLocationPrimitiveFunction )
            {
            // InternalBreactive.g:6054:4: (lv_function_1_0= ruleLocationPrimitiveFunction )
            // InternalBreactive.g:6055:5: lv_function_1_0= ruleLocationPrimitiveFunction
            {

            					newCompositeNode(grammarAccess.getLocationPrimitiveFCExpressionAccess().getFunctionLocationPrimitiveFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_function_1_0=ruleLocationPrimitiveFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationPrimitiveFCExpressionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.cirad.dsl.xtext.Breactive.LocationPrimitiveFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationPrimitiveFCExpression"


    // $ANTLR start "entryRuleSetAttributeNamedFCExpression"
    // InternalBreactive.g:6076:1: entryRuleSetAttributeNamedFCExpression returns [EObject current=null] : iv_ruleSetAttributeNamedFCExpression= ruleSetAttributeNamedFCExpression EOF ;
    public final EObject entryRuleSetAttributeNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAttributeNamedFCExpression = null;


        try {
            // InternalBreactive.g:6076:70: (iv_ruleSetAttributeNamedFCExpression= ruleSetAttributeNamedFCExpression EOF )
            // InternalBreactive.g:6077:2: iv_ruleSetAttributeNamedFCExpression= ruleSetAttributeNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getSetAttributeNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetAttributeNamedFCExpression=ruleSetAttributeNamedFCExpression();

            state._fsp--;

             current =iv_ruleSetAttributeNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetAttributeNamedFCExpression"


    // $ANTLR start "ruleSetAttributeNamedFCExpression"
    // InternalBreactive.g:6083:1: ruleSetAttributeNamedFCExpression returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleConstantExpression ) ) | this_STRING_3= RULE_STRING ) otherlv_4= ')' ) ;
    public final EObject ruleSetAttributeNamedFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        EObject lv_arguments_0_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6089:2: ( ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleConstantExpression ) ) | this_STRING_3= RULE_STRING ) otherlv_4= ')' ) )
            // InternalBreactive.g:6090:2: ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleConstantExpression ) ) | this_STRING_3= RULE_STRING ) otherlv_4= ')' )
            {
            // InternalBreactive.g:6090:2: ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleConstantExpression ) ) | this_STRING_3= RULE_STRING ) otherlv_4= ')' )
            // InternalBreactive.g:6091:3: ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleConstantExpression ) ) | this_STRING_3= RULE_STRING ) otherlv_4= ')'
            {
            // InternalBreactive.g:6091:3: ( (lv_arguments_0_0= ruleDeclaredAttributes ) )
            // InternalBreactive.g:6092:4: (lv_arguments_0_0= ruleDeclaredAttributes )
            {
            // InternalBreactive.g:6092:4: (lv_arguments_0_0= ruleDeclaredAttributes )
            // InternalBreactive.g:6093:5: lv_arguments_0_0= ruleDeclaredAttributes
            {

            					newCompositeNode(grammarAccess.getSetAttributeNamedFCExpressionAccess().getArgumentsDeclaredAttributesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_arguments_0_0=ruleDeclaredAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetAttributeNamedFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_0_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAttributeNamedFCExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBreactive.g:6114:3: ( ( (lv_arguments_2_0= ruleConstantExpression ) ) | this_STRING_3= RULE_STRING )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_STRING) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalBreactive.g:6115:4: ( (lv_arguments_2_0= ruleConstantExpression ) )
                    {
                    // InternalBreactive.g:6115:4: ( (lv_arguments_2_0= ruleConstantExpression ) )
                    // InternalBreactive.g:6116:5: (lv_arguments_2_0= ruleConstantExpression )
                    {
                    // InternalBreactive.g:6116:5: (lv_arguments_2_0= ruleConstantExpression )
                    // InternalBreactive.g:6117:6: lv_arguments_2_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getSetAttributeNamedFCExpressionAccess().getArgumentsConstantExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_arguments_2_0=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetAttributeNamedFCExpressionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"org.cirad.dsl.xtext.Breactive.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBreactive.g:6135:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_47); 

                    				newLeafNode(this_STRING_3, grammarAccess.getSetAttributeNamedFCExpressionAccess().getSTRINGTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSetAttributeNamedFCExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetAttributeNamedFCExpression"


    // $ANTLR start "entryRuleSetLocationNamedFCExpression"
    // InternalBreactive.g:6148:1: entryRuleSetLocationNamedFCExpression returns [EObject current=null] : iv_ruleSetLocationNamedFCExpression= ruleSetLocationNamedFCExpression EOF ;
    public final EObject entryRuleSetLocationNamedFCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLocationNamedFCExpression = null;


        try {
            // InternalBreactive.g:6148:69: (iv_ruleSetLocationNamedFCExpression= ruleSetLocationNamedFCExpression EOF )
            // InternalBreactive.g:6149:2: iv_ruleSetLocationNamedFCExpression= ruleSetLocationNamedFCExpression EOF
            {
             newCompositeNode(grammarAccess.getSetLocationNamedFCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetLocationNamedFCExpression=ruleSetLocationNamedFCExpression();

            state._fsp--;

             current =iv_ruleSetLocationNamedFCExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLocationNamedFCExpression"


    // $ANTLR start "ruleSetLocationNamedFCExpression"
    // InternalBreactive.g:6155:1: ruleSetLocationNamedFCExpression returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleLocationNamedFCExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetLocationNamedFCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_0_0 = null;

        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6161:2: ( ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleLocationNamedFCExpression ) ) otherlv_3= ')' ) )
            // InternalBreactive.g:6162:2: ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleLocationNamedFCExpression ) ) otherlv_3= ')' )
            {
            // InternalBreactive.g:6162:2: ( ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleLocationNamedFCExpression ) ) otherlv_3= ')' )
            // InternalBreactive.g:6163:3: ( (lv_arguments_0_0= ruleDeclaredAttributes ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleLocationNamedFCExpression ) ) otherlv_3= ')'
            {
            // InternalBreactive.g:6163:3: ( (lv_arguments_0_0= ruleDeclaredAttributes ) )
            // InternalBreactive.g:6164:4: (lv_arguments_0_0= ruleDeclaredAttributes )
            {
            // InternalBreactive.g:6164:4: (lv_arguments_0_0= ruleDeclaredAttributes )
            // InternalBreactive.g:6165:5: lv_arguments_0_0= ruleDeclaredAttributes
            {

            					newCompositeNode(grammarAccess.getSetLocationNamedFCExpressionAccess().getArgumentsDeclaredAttributesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_arguments_0_0=ruleDeclaredAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetLocationNamedFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_0_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSetLocationNamedFCExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBreactive.g:6186:3: ( (lv_arguments_2_0= ruleLocationNamedFCExpression ) )
            // InternalBreactive.g:6187:4: (lv_arguments_2_0= ruleLocationNamedFCExpression )
            {
            // InternalBreactive.g:6187:4: (lv_arguments_2_0= ruleLocationNamedFCExpression )
            // InternalBreactive.g:6188:5: lv_arguments_2_0= ruleLocationNamedFCExpression
            {

            					newCompositeNode(grammarAccess.getSetLocationNamedFCExpressionAccess().getArgumentsLocationNamedFCExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_arguments_2_0=ruleLocationNamedFCExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetLocationNamedFCExpressionRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_2_0,
            						"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSetLocationNamedFCExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLocationNamedFCExpression"


    // $ANTLR start "entryRuleDeclaredLocalVariable"
    // InternalBreactive.g:6213:1: entryRuleDeclaredLocalVariable returns [EObject current=null] : iv_ruleDeclaredLocalVariable= ruleDeclaredLocalVariable EOF ;
    public final EObject entryRuleDeclaredLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredLocalVariable = null;


        try {
            // InternalBreactive.g:6213:62: (iv_ruleDeclaredLocalVariable= ruleDeclaredLocalVariable EOF )
            // InternalBreactive.g:6214:2: iv_ruleDeclaredLocalVariable= ruleDeclaredLocalVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaredLocalVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredLocalVariable=ruleDeclaredLocalVariable();

            state._fsp--;

             current =iv_ruleDeclaredLocalVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredLocalVariable"


    // $ANTLR start "ruleDeclaredLocalVariable"
    // InternalBreactive.g:6220:1: ruleDeclaredLocalVariable returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredLocalVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBreactive.g:6226:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBreactive.g:6227:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBreactive.g:6227:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalBreactive.g:6228:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalBreactive.g:6228:3: ()
            // InternalBreactive.g:6229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclaredLocalVariableAccess().getDeclaredLocalVariableAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6235:3: ( (otherlv_1= RULE_ID ) )
            // InternalBreactive.g:6236:4: (otherlv_1= RULE_ID )
            {
            // InternalBreactive.g:6236:4: (otherlv_1= RULE_ID )
            // InternalBreactive.g:6237:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaredLocalVariableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDeclaredLocalVariableAccess().getLocalvariableLocalVariableCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredLocalVariable"


    // $ANTLR start "entryRuleDeclaredAttributes"
    // InternalBreactive.g:6252:1: entryRuleDeclaredAttributes returns [EObject current=null] : iv_ruleDeclaredAttributes= ruleDeclaredAttributes EOF ;
    public final EObject entryRuleDeclaredAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredAttributes = null;


        try {
            // InternalBreactive.g:6252:59: (iv_ruleDeclaredAttributes= ruleDeclaredAttributes EOF )
            // InternalBreactive.g:6253:2: iv_ruleDeclaredAttributes= ruleDeclaredAttributes EOF
            {
             newCompositeNode(grammarAccess.getDeclaredAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredAttributes=ruleDeclaredAttributes();

            state._fsp--;

             current =iv_ruleDeclaredAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredAttributes"


    // $ANTLR start "ruleDeclaredAttributes"
    // InternalBreactive.g:6259:1: ruleDeclaredAttributes returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleDeclaredAttributes() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBreactive.g:6265:2: ( ( ( ruleQualifiedName ) ) )
            // InternalBreactive.g:6266:2: ( ( ruleQualifiedName ) )
            {
            // InternalBreactive.g:6266:2: ( ( ruleQualifiedName ) )
            // InternalBreactive.g:6267:3: ( ruleQualifiedName )
            {
            // InternalBreactive.g:6267:3: ( ruleQualifiedName )
            // InternalBreactive.g:6268:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeclaredAttributesRule());
            				}
            			

            				newCompositeNode(grammarAccess.getDeclaredAttributesAccess().getAttributeclassAttributeClassCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredAttributes"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalBreactive.g:6285:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // InternalBreactive.g:6285:58: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // InternalBreactive.g:6286:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
             newCompositeNode(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();

            state._fsp--;

             current =iv_ruleDeclaredParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalBreactive.g:6292:1: ruleDeclaredParameter returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBreactive.g:6298:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalBreactive.g:6299:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalBreactive.g:6299:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalBreactive.g:6300:3: () ( ( ruleQualifiedName ) )
            {
            // InternalBreactive.g:6300:3: ()
            // InternalBreactive.g:6301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclaredParameterAccess().getDeclaredParameterAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6307:3: ( ( ruleQualifiedName ) )
            // InternalBreactive.g:6308:4: ( ruleQualifiedName )
            {
            // InternalBreactive.g:6308:4: ( ruleQualifiedName )
            // InternalBreactive.g:6309:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaredParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeclaredParameterAccess().getParameterclassParameterClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleDeclaredVariable"
    // InternalBreactive.g:6327:1: entryRuleDeclaredVariable returns [EObject current=null] : iv_ruleDeclaredVariable= ruleDeclaredVariable EOF ;
    public final EObject entryRuleDeclaredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVariable = null;


        try {
            // InternalBreactive.g:6327:57: (iv_ruleDeclaredVariable= ruleDeclaredVariable EOF )
            // InternalBreactive.g:6328:2: iv_ruleDeclaredVariable= ruleDeclaredVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaredVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredVariable=ruleDeclaredVariable();

            state._fsp--;

             current =iv_ruleDeclaredVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredVariable"


    // $ANTLR start "ruleDeclaredVariable"
    // InternalBreactive.g:6334:1: ruleDeclaredVariable returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDeclaredVariable() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBreactive.g:6340:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalBreactive.g:6341:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalBreactive.g:6341:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalBreactive.g:6342:3: () ( ( ruleQualifiedName ) )
            {
            // InternalBreactive.g:6342:3: ()
            // InternalBreactive.g:6343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclaredVariableAccess().getDeclaredVariableAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6349:3: ( ( ruleQualifiedName ) )
            // InternalBreactive.g:6350:4: ( ruleQualifiedName )
            {
            // InternalBreactive.g:6350:4: ( ruleQualifiedName )
            // InternalBreactive.g:6351:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaredVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeclaredVariableAccess().getVariableclassVariableClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredVariable"


    // $ANTLR start "entryRuleDeclaredEntities"
    // InternalBreactive.g:6369:1: entryRuleDeclaredEntities returns [EObject current=null] : iv_ruleDeclaredEntities= ruleDeclaredEntities EOF ;
    public final EObject entryRuleDeclaredEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredEntities = null;


        try {
            // InternalBreactive.g:6369:57: (iv_ruleDeclaredEntities= ruleDeclaredEntities EOF )
            // InternalBreactive.g:6370:2: iv_ruleDeclaredEntities= ruleDeclaredEntities EOF
            {
             newCompositeNode(grammarAccess.getDeclaredEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredEntities=ruleDeclaredEntities();

            state._fsp--;

             current =iv_ruleDeclaredEntities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredEntities"


    // $ANTLR start "ruleDeclaredEntities"
    // InternalBreactive.g:6376:1: ruleDeclaredEntities returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleDeclaredEntities() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBreactive.g:6382:2: ( ( ( ruleQualifiedName ) ) )
            // InternalBreactive.g:6383:2: ( ( ruleQualifiedName ) )
            {
            // InternalBreactive.g:6383:2: ( ( ruleQualifiedName ) )
            // InternalBreactive.g:6384:3: ( ruleQualifiedName )
            {
            // InternalBreactive.g:6384:3: ( ruleQualifiedName )
            // InternalBreactive.g:6385:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeclaredEntitiesRule());
            				}
            			

            				newCompositeNode(grammarAccess.getDeclaredEntitiesAccess().getEntityEntityCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredEntities"


    // $ANTLR start "entryRuleFloat"
    // InternalBreactive.g:6402:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalBreactive.g:6402:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalBreactive.g:6403:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalBreactive.g:6409:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalBreactive.g:6415:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalBreactive.g:6416:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalBreactive.g:6416:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalBreactive.g:6417:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalBreactive.g:6424:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==25) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalBreactive.g:6425:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,25,FOLLOW_67); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleStart"
    // InternalBreactive.g:6442:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalBreactive.g:6442:46: (iv_ruleStart= ruleStart EOF )
            // InternalBreactive.g:6443:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalBreactive.g:6449:1: ruleStart returns [EObject current=null] : ( () ( (lv_name_1_0= 'Start' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_outcome_edge_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6455:2: ( ( () ( (lv_name_1_0= 'Start' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) ) )
            // InternalBreactive.g:6456:2: ( () ( (lv_name_1_0= 'Start' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) )
            {
            // InternalBreactive.g:6456:2: ( () ( (lv_name_1_0= 'Start' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) )
            // InternalBreactive.g:6457:3: () ( (lv_name_1_0= 'Start' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )
            {
            // InternalBreactive.g:6457:3: ()
            // InternalBreactive.g:6458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartAccess().getStartAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6464:3: ( (lv_name_1_0= 'Start' ) )
            // InternalBreactive.g:6465:4: (lv_name_1_0= 'Start' )
            {
            // InternalBreactive.g:6465:4: (lv_name_1_0= 'Start' )
            // InternalBreactive.g:6466:5: lv_name_1_0= 'Start'
            {
            lv_name_1_0=(Token)match(input,84,FOLLOW_68); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStartAccess().getNameStartKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Start");
            				

            }


            }

            // InternalBreactive.g:6478:3: ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:6479:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:6479:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            // InternalBreactive.g:6480:5: lv_outcome_edge_2_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getStartAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_outcome_edge_2_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_2_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleEnd"
    // InternalBreactive.g:6501:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalBreactive.g:6501:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalBreactive.g:6502:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalBreactive.g:6508:1: ruleEnd returns [EObject current=null] : ( () ( (lv_name_1_0= 'End' ) ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBreactive.g:6514:2: ( ( () ( (lv_name_1_0= 'End' ) ) ) )
            // InternalBreactive.g:6515:2: ( () ( (lv_name_1_0= 'End' ) ) )
            {
            // InternalBreactive.g:6515:2: ( () ( (lv_name_1_0= 'End' ) ) )
            // InternalBreactive.g:6516:3: () ( (lv_name_1_0= 'End' ) )
            {
            // InternalBreactive.g:6516:3: ()
            // InternalBreactive.g:6517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndAccess().getEndAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6523:3: ( (lv_name_1_0= 'End' ) )
            // InternalBreactive.g:6524:4: (lv_name_1_0= 'End' )
            {
            // InternalBreactive.g:6524:4: (lv_name_1_0= 'End' )
            // InternalBreactive.g:6525:5: lv_name_1_0= 'End'
            {
            lv_name_1_0=(Token)match(input,85,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndAccess().getNameEndKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "End");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleDeclaredBehavior"
    // InternalBreactive.g:6541:1: entryRuleDeclaredBehavior returns [EObject current=null] : iv_ruleDeclaredBehavior= ruleDeclaredBehavior EOF ;
    public final EObject entryRuleDeclaredBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredBehavior = null;


        try {
            // InternalBreactive.g:6541:57: (iv_ruleDeclaredBehavior= ruleDeclaredBehavior EOF )
            // InternalBreactive.g:6542:2: iv_ruleDeclaredBehavior= ruleDeclaredBehavior EOF
            {
             newCompositeNode(grammarAccess.getDeclaredBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredBehavior=ruleDeclaredBehavior();

            state._fsp--;

             current =iv_ruleDeclaredBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredBehavior"


    // $ANTLR start "ruleDeclaredBehavior"
    // InternalBreactive.g:6548:1: ruleDeclaredBehavior returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_outcome_edge_1_0= ruleUnconditionedEdge ) ) ) ;
    public final EObject ruleDeclaredBehavior() throws RecognitionException {
        EObject current = null;

        EObject lv_outcome_edge_1_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6554:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_outcome_edge_1_0= ruleUnconditionedEdge ) ) ) )
            // InternalBreactive.g:6555:2: ( ( ( ruleQualifiedName ) ) ( (lv_outcome_edge_1_0= ruleUnconditionedEdge ) ) )
            {
            // InternalBreactive.g:6555:2: ( ( ( ruleQualifiedName ) ) ( (lv_outcome_edge_1_0= ruleUnconditionedEdge ) ) )
            // InternalBreactive.g:6556:3: ( ( ruleQualifiedName ) ) ( (lv_outcome_edge_1_0= ruleUnconditionedEdge ) )
            {
            // InternalBreactive.g:6556:3: ( ( ruleQualifiedName ) )
            // InternalBreactive.g:6557:4: ( ruleQualifiedName )
            {
            // InternalBreactive.g:6557:4: ( ruleQualifiedName )
            // InternalBreactive.g:6558:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaredBehaviorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeclaredBehaviorAccess().getBehaviorBehaviorCrossReference_0_0());
            				
            pushFollow(FOLLOW_68);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:6572:3: ( (lv_outcome_edge_1_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:6573:4: (lv_outcome_edge_1_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:6573:4: (lv_outcome_edge_1_0= ruleUnconditionedEdge )
            // InternalBreactive.g:6574:5: lv_outcome_edge_1_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getDeclaredBehaviorAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_outcome_edge_1_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclaredBehaviorRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_1_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredBehavior"


    // $ANTLR start "entryRuleUnconditionedEdge"
    // InternalBreactive.g:6595:1: entryRuleUnconditionedEdge returns [EObject current=null] : iv_ruleUnconditionedEdge= ruleUnconditionedEdge EOF ;
    public final EObject entryRuleUnconditionedEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnconditionedEdge = null;


        try {
            // InternalBreactive.g:6595:58: (iv_ruleUnconditionedEdge= ruleUnconditionedEdge EOF )
            // InternalBreactive.g:6596:2: iv_ruleUnconditionedEdge= ruleUnconditionedEdge EOF
            {
             newCompositeNode(grammarAccess.getUnconditionedEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnconditionedEdge=ruleUnconditionedEdge();

            state._fsp--;

             current =iv_ruleUnconditionedEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnconditionedEdge"


    // $ANTLR start "ruleUnconditionedEdge"
    // InternalBreactive.g:6602:1: ruleUnconditionedEdge returns [EObject current=null] : ( () ( (lv_name_1_0= '->' ) ) ( ( (lv_target_node_2_0= ruleDeclaredBehavior ) ) | ( (lv_target_node_3_0= ruleEnd ) ) | ( (lv_target_node_4_0= ruleDecision ) ) | ( (lv_target_node_5_0= ruleFork ) ) | ( (lv_target_node_6_0= ruleMerge ) ) | ( (lv_target_node_7_0= ruleJoin ) ) | ( (lv_target_node_8_0= rulePrimitiveActivities ) ) ) ) ;
    public final EObject ruleUnconditionedEdge() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_target_node_2_0 = null;

        EObject lv_target_node_3_0 = null;

        EObject lv_target_node_4_0 = null;

        EObject lv_target_node_5_0 = null;

        EObject lv_target_node_6_0 = null;

        EObject lv_target_node_7_0 = null;

        EObject lv_target_node_8_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6608:2: ( ( () ( (lv_name_1_0= '->' ) ) ( ( (lv_target_node_2_0= ruleDeclaredBehavior ) ) | ( (lv_target_node_3_0= ruleEnd ) ) | ( (lv_target_node_4_0= ruleDecision ) ) | ( (lv_target_node_5_0= ruleFork ) ) | ( (lv_target_node_6_0= ruleMerge ) ) | ( (lv_target_node_7_0= ruleJoin ) ) | ( (lv_target_node_8_0= rulePrimitiveActivities ) ) ) ) )
            // InternalBreactive.g:6609:2: ( () ( (lv_name_1_0= '->' ) ) ( ( (lv_target_node_2_0= ruleDeclaredBehavior ) ) | ( (lv_target_node_3_0= ruleEnd ) ) | ( (lv_target_node_4_0= ruleDecision ) ) | ( (lv_target_node_5_0= ruleFork ) ) | ( (lv_target_node_6_0= ruleMerge ) ) | ( (lv_target_node_7_0= ruleJoin ) ) | ( (lv_target_node_8_0= rulePrimitiveActivities ) ) ) )
            {
            // InternalBreactive.g:6609:2: ( () ( (lv_name_1_0= '->' ) ) ( ( (lv_target_node_2_0= ruleDeclaredBehavior ) ) | ( (lv_target_node_3_0= ruleEnd ) ) | ( (lv_target_node_4_0= ruleDecision ) ) | ( (lv_target_node_5_0= ruleFork ) ) | ( (lv_target_node_6_0= ruleMerge ) ) | ( (lv_target_node_7_0= ruleJoin ) ) | ( (lv_target_node_8_0= rulePrimitiveActivities ) ) ) )
            // InternalBreactive.g:6610:3: () ( (lv_name_1_0= '->' ) ) ( ( (lv_target_node_2_0= ruleDeclaredBehavior ) ) | ( (lv_target_node_3_0= ruleEnd ) ) | ( (lv_target_node_4_0= ruleDecision ) ) | ( (lv_target_node_5_0= ruleFork ) ) | ( (lv_target_node_6_0= ruleMerge ) ) | ( (lv_target_node_7_0= ruleJoin ) ) | ( (lv_target_node_8_0= rulePrimitiveActivities ) ) )
            {
            // InternalBreactive.g:6610:3: ()
            // InternalBreactive.g:6611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnconditionedEdgeAccess().getUnconditionedEdgeAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6617:3: ( (lv_name_1_0= '->' ) )
            // InternalBreactive.g:6618:4: (lv_name_1_0= '->' )
            {
            // InternalBreactive.g:6618:4: (lv_name_1_0= '->' )
            // InternalBreactive.g:6619:5: lv_name_1_0= '->'
            {
            lv_name_1_0=(Token)match(input,86,FOLLOW_69); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUnconditionedEdgeAccess().getNameHyphenMinusGreaterThanSignKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnconditionedEdgeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "->");
            				

            }


            }

            // InternalBreactive.g:6631:3: ( ( (lv_target_node_2_0= ruleDeclaredBehavior ) ) | ( (lv_target_node_3_0= ruleEnd ) ) | ( (lv_target_node_4_0= ruleDecision ) ) | ( (lv_target_node_5_0= ruleFork ) ) | ( (lv_target_node_6_0= ruleMerge ) ) | ( (lv_target_node_7_0= ruleJoin ) ) | ( (lv_target_node_8_0= rulePrimitiveActivities ) ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt75=1;
                }
                break;
            case 85:
                {
                alt75=2;
                }
                break;
            case 89:
                {
                alt75=3;
                }
                break;
            case 93:
                {
                alt75=4;
                }
                break;
            case 94:
                {
                alt75=5;
                }
                break;
            case 91:
                {
                alt75=6;
                }
                break;
            case 95:
            case 96:
            case 97:
            case 101:
            case 103:
            case 104:
                {
                alt75=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalBreactive.g:6632:4: ( (lv_target_node_2_0= ruleDeclaredBehavior ) )
                    {
                    // InternalBreactive.g:6632:4: ( (lv_target_node_2_0= ruleDeclaredBehavior ) )
                    // InternalBreactive.g:6633:5: (lv_target_node_2_0= ruleDeclaredBehavior )
                    {
                    // InternalBreactive.g:6633:5: (lv_target_node_2_0= ruleDeclaredBehavior )
                    // InternalBreactive.g:6634:6: lv_target_node_2_0= ruleDeclaredBehavior
                    {

                    						newCompositeNode(grammarAccess.getUnconditionedEdgeAccess().getTarget_nodeDeclaredBehaviorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_node_2_0=ruleDeclaredBehavior();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnconditionedEdgeRule());
                    						}
                    						add(
                    							current,
                    							"target_node",
                    							lv_target_node_2_0,
                    							"org.cirad.dsl.xtext.Breactive.DeclaredBehavior");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBreactive.g:6652:4: ( (lv_target_node_3_0= ruleEnd ) )
                    {
                    // InternalBreactive.g:6652:4: ( (lv_target_node_3_0= ruleEnd ) )
                    // InternalBreactive.g:6653:5: (lv_target_node_3_0= ruleEnd )
                    {
                    // InternalBreactive.g:6653:5: (lv_target_node_3_0= ruleEnd )
                    // InternalBreactive.g:6654:6: lv_target_node_3_0= ruleEnd
                    {

                    						newCompositeNode(grammarAccess.getUnconditionedEdgeAccess().getTarget_nodeEndParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_node_3_0=ruleEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnconditionedEdgeRule());
                    						}
                    						add(
                    							current,
                    							"target_node",
                    							lv_target_node_3_0,
                    							"org.cirad.dsl.xtext.Breactive.End");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBreactive.g:6672:4: ( (lv_target_node_4_0= ruleDecision ) )
                    {
                    // InternalBreactive.g:6672:4: ( (lv_target_node_4_0= ruleDecision ) )
                    // InternalBreactive.g:6673:5: (lv_target_node_4_0= ruleDecision )
                    {
                    // InternalBreactive.g:6673:5: (lv_target_node_4_0= ruleDecision )
                    // InternalBreactive.g:6674:6: lv_target_node_4_0= ruleDecision
                    {

                    						newCompositeNode(grammarAccess.getUnconditionedEdgeAccess().getTarget_nodeDecisionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_node_4_0=ruleDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnconditionedEdgeRule());
                    						}
                    						add(
                    							current,
                    							"target_node",
                    							lv_target_node_4_0,
                    							"org.cirad.dsl.xtext.Breactive.Decision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBreactive.g:6692:4: ( (lv_target_node_5_0= ruleFork ) )
                    {
                    // InternalBreactive.g:6692:4: ( (lv_target_node_5_0= ruleFork ) )
                    // InternalBreactive.g:6693:5: (lv_target_node_5_0= ruleFork )
                    {
                    // InternalBreactive.g:6693:5: (lv_target_node_5_0= ruleFork )
                    // InternalBreactive.g:6694:6: lv_target_node_5_0= ruleFork
                    {

                    						newCompositeNode(grammarAccess.getUnconditionedEdgeAccess().getTarget_nodeForkParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_node_5_0=ruleFork();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnconditionedEdgeRule());
                    						}
                    						add(
                    							current,
                    							"target_node",
                    							lv_target_node_5_0,
                    							"org.cirad.dsl.xtext.Breactive.Fork");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBreactive.g:6712:4: ( (lv_target_node_6_0= ruleMerge ) )
                    {
                    // InternalBreactive.g:6712:4: ( (lv_target_node_6_0= ruleMerge ) )
                    // InternalBreactive.g:6713:5: (lv_target_node_6_0= ruleMerge )
                    {
                    // InternalBreactive.g:6713:5: (lv_target_node_6_0= ruleMerge )
                    // InternalBreactive.g:6714:6: lv_target_node_6_0= ruleMerge
                    {

                    						newCompositeNode(grammarAccess.getUnconditionedEdgeAccess().getTarget_nodeMergeParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_node_6_0=ruleMerge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnconditionedEdgeRule());
                    						}
                    						add(
                    							current,
                    							"target_node",
                    							lv_target_node_6_0,
                    							"org.cirad.dsl.xtext.Breactive.Merge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBreactive.g:6732:4: ( (lv_target_node_7_0= ruleJoin ) )
                    {
                    // InternalBreactive.g:6732:4: ( (lv_target_node_7_0= ruleJoin ) )
                    // InternalBreactive.g:6733:5: (lv_target_node_7_0= ruleJoin )
                    {
                    // InternalBreactive.g:6733:5: (lv_target_node_7_0= ruleJoin )
                    // InternalBreactive.g:6734:6: lv_target_node_7_0= ruleJoin
                    {

                    						newCompositeNode(grammarAccess.getUnconditionedEdgeAccess().getTarget_nodeJoinParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_node_7_0=ruleJoin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnconditionedEdgeRule());
                    						}
                    						add(
                    							current,
                    							"target_node",
                    							lv_target_node_7_0,
                    							"org.cirad.dsl.xtext.Breactive.Join");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBreactive.g:6752:4: ( (lv_target_node_8_0= rulePrimitiveActivities ) )
                    {
                    // InternalBreactive.g:6752:4: ( (lv_target_node_8_0= rulePrimitiveActivities ) )
                    // InternalBreactive.g:6753:5: (lv_target_node_8_0= rulePrimitiveActivities )
                    {
                    // InternalBreactive.g:6753:5: (lv_target_node_8_0= rulePrimitiveActivities )
                    // InternalBreactive.g:6754:6: lv_target_node_8_0= rulePrimitiveActivities
                    {

                    						newCompositeNode(grammarAccess.getUnconditionedEdgeAccess().getTarget_nodePrimitiveActivitiesParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_target_node_8_0=rulePrimitiveActivities();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnconditionedEdgeRule());
                    						}
                    						add(
                    							current,
                    							"target_node",
                    							lv_target_node_8_0,
                    							"org.cirad.dsl.xtext.Breactive.PrimitiveActivities");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnconditionedEdge"


    // $ANTLR start "entryRuleTrueEdge"
    // InternalBreactive.g:6776:1: entryRuleTrueEdge returns [EObject current=null] : iv_ruleTrueEdge= ruleTrueEdge EOF ;
    public final EObject entryRuleTrueEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueEdge = null;


        try {
            // InternalBreactive.g:6776:49: (iv_ruleTrueEdge= ruleTrueEdge EOF )
            // InternalBreactive.g:6777:2: iv_ruleTrueEdge= ruleTrueEdge EOF
            {
             newCompositeNode(grammarAccess.getTrueEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueEdge=ruleTrueEdge();

            state._fsp--;

             current =iv_ruleTrueEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrueEdge"


    // $ANTLR start "ruleTrueEdge"
    // InternalBreactive.g:6783:1: ruleTrueEdge returns [EObject current=null] : ( () ( (lv_name_1_0= 'then' ) ) ( (lv_target_node_2_0= ruleNode ) ) ) ;
    public final EObject ruleTrueEdge() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_target_node_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6789:2: ( ( () ( (lv_name_1_0= 'then' ) ) ( (lv_target_node_2_0= ruleNode ) ) ) )
            // InternalBreactive.g:6790:2: ( () ( (lv_name_1_0= 'then' ) ) ( (lv_target_node_2_0= ruleNode ) ) )
            {
            // InternalBreactive.g:6790:2: ( () ( (lv_name_1_0= 'then' ) ) ( (lv_target_node_2_0= ruleNode ) ) )
            // InternalBreactive.g:6791:3: () ( (lv_name_1_0= 'then' ) ) ( (lv_target_node_2_0= ruleNode ) )
            {
            // InternalBreactive.g:6791:3: ()
            // InternalBreactive.g:6792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueEdgeAccess().getIfTrueEdgeAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6798:3: ( (lv_name_1_0= 'then' ) )
            // InternalBreactive.g:6799:4: (lv_name_1_0= 'then' )
            {
            // InternalBreactive.g:6799:4: (lv_name_1_0= 'then' )
            // InternalBreactive.g:6800:5: lv_name_1_0= 'then'
            {
            lv_name_1_0=(Token)match(input,87,FOLLOW_70); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTrueEdgeAccess().getNameThenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrueEdgeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "then");
            				

            }


            }

            // InternalBreactive.g:6812:3: ( (lv_target_node_2_0= ruleNode ) )
            // InternalBreactive.g:6813:4: (lv_target_node_2_0= ruleNode )
            {
            // InternalBreactive.g:6813:4: (lv_target_node_2_0= ruleNode )
            // InternalBreactive.g:6814:5: lv_target_node_2_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getTrueEdgeAccess().getTarget_nodeNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_node_2_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrueEdgeRule());
            					}
            					add(
            						current,
            						"target_node",
            						lv_target_node_2_0,
            						"org.cirad.dsl.xtext.Breactive.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueEdge"


    // $ANTLR start "entryRuleFalseEdge"
    // InternalBreactive.g:6835:1: entryRuleFalseEdge returns [EObject current=null] : iv_ruleFalseEdge= ruleFalseEdge EOF ;
    public final EObject entryRuleFalseEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseEdge = null;


        try {
            // InternalBreactive.g:6835:50: (iv_ruleFalseEdge= ruleFalseEdge EOF )
            // InternalBreactive.g:6836:2: iv_ruleFalseEdge= ruleFalseEdge EOF
            {
             newCompositeNode(grammarAccess.getFalseEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFalseEdge=ruleFalseEdge();

            state._fsp--;

             current =iv_ruleFalseEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFalseEdge"


    // $ANTLR start "ruleFalseEdge"
    // InternalBreactive.g:6842:1: ruleFalseEdge returns [EObject current=null] : ( () ( (lv_name_1_0= 'else' ) ) ( (lv_target_node_2_0= ruleNode ) ) ) ;
    public final EObject ruleFalseEdge() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_target_node_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6848:2: ( ( () ( (lv_name_1_0= 'else' ) ) ( (lv_target_node_2_0= ruleNode ) ) ) )
            // InternalBreactive.g:6849:2: ( () ( (lv_name_1_0= 'else' ) ) ( (lv_target_node_2_0= ruleNode ) ) )
            {
            // InternalBreactive.g:6849:2: ( () ( (lv_name_1_0= 'else' ) ) ( (lv_target_node_2_0= ruleNode ) ) )
            // InternalBreactive.g:6850:3: () ( (lv_name_1_0= 'else' ) ) ( (lv_target_node_2_0= ruleNode ) )
            {
            // InternalBreactive.g:6850:3: ()
            // InternalBreactive.g:6851:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseEdgeAccess().getIfFalseEdgeAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6857:3: ( (lv_name_1_0= 'else' ) )
            // InternalBreactive.g:6858:4: (lv_name_1_0= 'else' )
            {
            // InternalBreactive.g:6858:4: (lv_name_1_0= 'else' )
            // InternalBreactive.g:6859:5: lv_name_1_0= 'else'
            {
            lv_name_1_0=(Token)match(input,88,FOLLOW_70); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFalseEdgeAccess().getNameElseKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFalseEdgeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "else");
            				

            }


            }

            // InternalBreactive.g:6871:3: ( (lv_target_node_2_0= ruleNode ) )
            // InternalBreactive.g:6872:4: (lv_target_node_2_0= ruleNode )
            {
            // InternalBreactive.g:6872:4: (lv_target_node_2_0= ruleNode )
            // InternalBreactive.g:6873:5: lv_target_node_2_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getFalseEdgeAccess().getTarget_nodeNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_node_2_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFalseEdgeRule());
            					}
            					add(
            						current,
            						"target_node",
            						lv_target_node_2_0,
            						"org.cirad.dsl.xtext.Breactive.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFalseEdge"


    // $ANTLR start "entryRuleDecision"
    // InternalBreactive.g:6894:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // InternalBreactive.g:6894:49: (iv_ruleDecision= ruleDecision EOF )
            // InternalBreactive.g:6895:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecision"


    // $ANTLR start "ruleDecision"
    // InternalBreactive.g:6901:1: ruleDecision returns [EObject current=null] : ( () ( (lv_name_1_0= 'Decide ' ) ) otherlv_2= '{' otherlv_3= 'if' otherlv_4= '(' ( ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) ) ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )* )? otherlv_7= ')' ( ( (lv_outcome_edge_8_0= ruleTrueEdge ) ) ( (lv_outcome_edge_9_0= ruleFalseEdge ) )? ) otherlv_10= '}' ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_booleanexpression_5_0 = null;

        EObject lv_booleanexpression_6_0 = null;

        EObject lv_outcome_edge_8_0 = null;

        EObject lv_outcome_edge_9_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:6907:2: ( ( () ( (lv_name_1_0= 'Decide ' ) ) otherlv_2= '{' otherlv_3= 'if' otherlv_4= '(' ( ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) ) ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )* )? otherlv_7= ')' ( ( (lv_outcome_edge_8_0= ruleTrueEdge ) ) ( (lv_outcome_edge_9_0= ruleFalseEdge ) )? ) otherlv_10= '}' ) )
            // InternalBreactive.g:6908:2: ( () ( (lv_name_1_0= 'Decide ' ) ) otherlv_2= '{' otherlv_3= 'if' otherlv_4= '(' ( ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) ) ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )* )? otherlv_7= ')' ( ( (lv_outcome_edge_8_0= ruleTrueEdge ) ) ( (lv_outcome_edge_9_0= ruleFalseEdge ) )? ) otherlv_10= '}' )
            {
            // InternalBreactive.g:6908:2: ( () ( (lv_name_1_0= 'Decide ' ) ) otherlv_2= '{' otherlv_3= 'if' otherlv_4= '(' ( ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) ) ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )* )? otherlv_7= ')' ( ( (lv_outcome_edge_8_0= ruleTrueEdge ) ) ( (lv_outcome_edge_9_0= ruleFalseEdge ) )? ) otherlv_10= '}' )
            // InternalBreactive.g:6909:3: () ( (lv_name_1_0= 'Decide ' ) ) otherlv_2= '{' otherlv_3= 'if' otherlv_4= '(' ( ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) ) ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )* )? otherlv_7= ')' ( ( (lv_outcome_edge_8_0= ruleTrueEdge ) ) ( (lv_outcome_edge_9_0= ruleFalseEdge ) )? ) otherlv_10= '}'
            {
            // InternalBreactive.g:6909:3: ()
            // InternalBreactive.g:6910:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecisionAccess().getDecisionAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:6916:3: ( (lv_name_1_0= 'Decide ' ) )
            // InternalBreactive.g:6917:4: (lv_name_1_0= 'Decide ' )
            {
            // InternalBreactive.g:6917:4: (lv_name_1_0= 'Decide ' )
            // InternalBreactive.g:6918:5: lv_name_1_0= 'Decide '
            {
            lv_name_1_0=(Token)match(input,89,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDecisionAccess().getNameDecideKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecisionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Decide ");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getDecisionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,90,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getDecisionAccess().getIfKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_72); 

            			newLeafNode(otherlv_4, grammarAccess.getDecisionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBreactive.g:6942:3: ( ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) ) ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID||LA77_0==RULE_INT||(LA77_0>=46 && LA77_0<=52)||(LA77_0>=54 && LA77_0<=57)||LA77_0==64||(LA77_0>=67 && LA77_0<=68)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalBreactive.g:6943:4: ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) ) ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )*
                    {
                    // InternalBreactive.g:6943:4: ( (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression ) )
                    // InternalBreactive.g:6944:5: (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression )
                    {
                    // InternalBreactive.g:6944:5: (lv_booleanexpression_5_0= ruleBooleanNamedFCExpression )
                    // InternalBreactive.g:6945:6: lv_booleanexpression_5_0= ruleBooleanNamedFCExpression
                    {

                    						newCompositeNode(grammarAccess.getDecisionAccess().getBooleanexpressionBooleanNamedFCExpressionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_booleanexpression_5_0=ruleBooleanNamedFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionRule());
                    						}
                    						add(
                    							current,
                    							"booleanexpression",
                    							lv_booleanexpression_5_0,
                    							"org.cirad.dsl.xtext.Breactive.BooleanNamedFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBreactive.g:6962:4: ( (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==28) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalBreactive.g:6963:5: (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression )
                    	    {
                    	    // InternalBreactive.g:6963:5: (lv_booleanexpression_6_0= ruleBooleanLogicFCExpression )
                    	    // InternalBreactive.g:6964:6: lv_booleanexpression_6_0= ruleBooleanLogicFCExpression
                    	    {

                    	    						newCompositeNode(grammarAccess.getDecisionAccess().getBooleanexpressionBooleanLogicFCExpressionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_73);
                    	    lv_booleanexpression_6_0=ruleBooleanLogicFCExpression();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDecisionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"booleanexpression",
                    	    							lv_booleanexpression_6_0,
                    	    							"org.cirad.dsl.xtext.Breactive.BooleanLogicFCExpression");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_74); 

            			newLeafNode(otherlv_7, grammarAccess.getDecisionAccess().getRightParenthesisKeyword_6());
            		
            // InternalBreactive.g:6986:3: ( ( (lv_outcome_edge_8_0= ruleTrueEdge ) ) ( (lv_outcome_edge_9_0= ruleFalseEdge ) )? )
            // InternalBreactive.g:6987:4: ( (lv_outcome_edge_8_0= ruleTrueEdge ) ) ( (lv_outcome_edge_9_0= ruleFalseEdge ) )?
            {
            // InternalBreactive.g:6987:4: ( (lv_outcome_edge_8_0= ruleTrueEdge ) )
            // InternalBreactive.g:6988:5: (lv_outcome_edge_8_0= ruleTrueEdge )
            {
            // InternalBreactive.g:6988:5: (lv_outcome_edge_8_0= ruleTrueEdge )
            // InternalBreactive.g:6989:6: lv_outcome_edge_8_0= ruleTrueEdge
            {

            						newCompositeNode(grammarAccess.getDecisionAccess().getOutcome_edgeTrueEdgeParserRuleCall_7_0_0());
            					
            pushFollow(FOLLOW_75);
            lv_outcome_edge_8_0=ruleTrueEdge();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDecisionRule());
            						}
            						add(
            							current,
            							"outcome_edge",
            							lv_outcome_edge_8_0,
            							"org.cirad.dsl.xtext.Breactive.TrueEdge");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBreactive.g:7006:4: ( (lv_outcome_edge_9_0= ruleFalseEdge ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==88) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalBreactive.g:7007:5: (lv_outcome_edge_9_0= ruleFalseEdge )
                    {
                    // InternalBreactive.g:7007:5: (lv_outcome_edge_9_0= ruleFalseEdge )
                    // InternalBreactive.g:7008:6: lv_outcome_edge_9_0= ruleFalseEdge
                    {

                    						newCompositeNode(grammarAccess.getDecisionAccess().getOutcome_edgeFalseEdgeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_outcome_edge_9_0=ruleFalseEdge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionRule());
                    						}
                    						add(
                    							current,
                    							"outcome_edge",
                    							lv_outcome_edge_9_0,
                    							"org.cirad.dsl.xtext.Breactive.FalseEdge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDecisionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecision"


    // $ANTLR start "entryRuleJoin"
    // InternalBreactive.g:7034:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalBreactive.g:7034:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalBreactive.g:7035:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalBreactive.g:7041:1: ruleJoin returns [EObject current=null] : ( () ( (lv_name_1_0= 'Join with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_outcome_edge_2_0 = null;

        EObject lv_outcome_edge_4_0 = null;

        EObject lv_outcome_edge_7_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7047:2: ( ( () ( (lv_name_1_0= 'Join with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) ) )
            // InternalBreactive.g:7048:2: ( () ( (lv_name_1_0= 'Join with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) )
            {
            // InternalBreactive.g:7048:2: ( () ( (lv_name_1_0= 'Join with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) )
            // InternalBreactive.g:7049:3: () ( (lv_name_1_0= 'Join with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) )
            {
            // InternalBreactive.g:7049:3: ()
            // InternalBreactive.g:7050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJoinAccess().getJoinAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7056:3: ( (lv_name_1_0= 'Join with (' ) )
            // InternalBreactive.g:7057:4: (lv_name_1_0= 'Join with (' )
            {
            // InternalBreactive.g:7057:4: (lv_name_1_0= 'Join with (' )
            // InternalBreactive.g:7058:5: lv_name_1_0= 'Join with ('
            {
            lv_name_1_0=(Token)match(input,91,FOLLOW_68); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJoinAccess().getNameJoinWithKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Join with (");
            				

            }


            }

            // InternalBreactive.g:7070:3: ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:7071:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:7071:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            // InternalBreactive.g:7072:5: lv_outcome_edge_2_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_outcome_edge_2_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_2_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:7089:3: (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==17) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalBreactive.g:7090:4: otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_68); 

            	    				newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBreactive.g:7094:4: ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) )
            	    // InternalBreactive.g:7095:5: (lv_outcome_edge_4_0= ruleUnconditionedEdge )
            	    {
            	    // InternalBreactive.g:7095:5: (lv_outcome_edge_4_0= ruleUnconditionedEdge )
            	    // InternalBreactive.g:7096:6: lv_outcome_edge_4_0= ruleUnconditionedEdge
            	    {

            	    						newCompositeNode(grammarAccess.getJoinAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_outcome_edge_4_0=ruleUnconditionedEdge();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJoinRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outcome_edge",
            	    							lv_outcome_edge_4_0,
            	    							"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_76); 

            			newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,92,FOLLOW_68); 

            			newLeafNode(otherlv_6, grammarAccess.getJoinAccess().getAndGoesToKeyword_5());
            		
            // InternalBreactive.g:7122:3: ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:7123:4: (lv_outcome_edge_7_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:7123:4: (lv_outcome_edge_7_0= ruleUnconditionedEdge )
            // InternalBreactive.g:7124:5: lv_outcome_edge_7_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_outcome_edge_7_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_7_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleFork"
    // InternalBreactive.g:7145:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // InternalBreactive.g:7145:45: (iv_ruleFork= ruleFork EOF )
            // InternalBreactive.g:7146:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalBreactive.g:7152:1: ruleFork returns [EObject current=null] : ( () ( (lv_name_1_0= 'Fork into (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_outcome_edge_2_0 = null;

        EObject lv_outcome_edge_4_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7158:2: ( ( () ( (lv_name_1_0= 'Fork into (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' ) )
            // InternalBreactive.g:7159:2: ( () ( (lv_name_1_0= 'Fork into (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' )
            {
            // InternalBreactive.g:7159:2: ( () ( (lv_name_1_0= 'Fork into (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' )
            // InternalBreactive.g:7160:3: () ( (lv_name_1_0= 'Fork into (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')'
            {
            // InternalBreactive.g:7160:3: ()
            // InternalBreactive.g:7161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForkAccess().getForkAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7167:3: ( (lv_name_1_0= 'Fork into (' ) )
            // InternalBreactive.g:7168:4: (lv_name_1_0= 'Fork into (' )
            {
            // InternalBreactive.g:7168:4: (lv_name_1_0= 'Fork into (' )
            // InternalBreactive.g:7169:5: lv_name_1_0= 'Fork into ('
            {
            lv_name_1_0=(Token)match(input,93,FOLLOW_68); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForkAccess().getNameForkIntoKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForkRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Fork into (");
            				

            }


            }

            // InternalBreactive.g:7181:3: ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:7182:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:7182:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            // InternalBreactive.g:7183:5: lv_outcome_edge_2_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getForkAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_outcome_edge_2_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForkRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_2_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:7200:3: (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==17) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalBreactive.g:7201:4: otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_68); 

            	    				newLeafNode(otherlv_3, grammarAccess.getForkAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBreactive.g:7205:4: ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) )
            	    // InternalBreactive.g:7206:5: (lv_outcome_edge_4_0= ruleUnconditionedEdge )
            	    {
            	    // InternalBreactive.g:7206:5: (lv_outcome_edge_4_0= ruleUnconditionedEdge )
            	    // InternalBreactive.g:7207:6: lv_outcome_edge_4_0= ruleUnconditionedEdge
            	    {

            	    						newCompositeNode(grammarAccess.getForkAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_outcome_edge_4_0=ruleUnconditionedEdge();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getForkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outcome_edge",
            	    							lv_outcome_edge_4_0,
            	    							"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getForkAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleMerge"
    // InternalBreactive.g:7233:1: entryRuleMerge returns [EObject current=null] : iv_ruleMerge= ruleMerge EOF ;
    public final EObject entryRuleMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMerge = null;


        try {
            // InternalBreactive.g:7233:46: (iv_ruleMerge= ruleMerge EOF )
            // InternalBreactive.g:7234:2: iv_ruleMerge= ruleMerge EOF
            {
             newCompositeNode(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMerge=ruleMerge();

            state._fsp--;

             current =iv_ruleMerge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMerge"


    // $ANTLR start "ruleMerge"
    // InternalBreactive.g:7240:1: ruleMerge returns [EObject current=null] : ( () ( (lv_name_1_0= 'Merge with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) ) ;
    public final EObject ruleMerge() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_outcome_edge_2_0 = null;

        EObject lv_outcome_edge_4_0 = null;

        EObject lv_outcome_edge_7_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7246:2: ( ( () ( (lv_name_1_0= 'Merge with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) ) )
            // InternalBreactive.g:7247:2: ( () ( (lv_name_1_0= 'Merge with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) )
            {
            // InternalBreactive.g:7247:2: ( () ( (lv_name_1_0= 'Merge with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) ) )
            // InternalBreactive.g:7248:3: () ( (lv_name_1_0= 'Merge with (' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) ) (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )* otherlv_5= ')' otherlv_6= 'and goes to' ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) )
            {
            // InternalBreactive.g:7248:3: ()
            // InternalBreactive.g:7249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMergeAccess().getMergeAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7255:3: ( (lv_name_1_0= 'Merge with (' ) )
            // InternalBreactive.g:7256:4: (lv_name_1_0= 'Merge with (' )
            {
            // InternalBreactive.g:7256:4: (lv_name_1_0= 'Merge with (' )
            // InternalBreactive.g:7257:5: lv_name_1_0= 'Merge with ('
            {
            lv_name_1_0=(Token)match(input,94,FOLLOW_68); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMergeAccess().getNameMergeWithKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Merge with (");
            				

            }


            }

            // InternalBreactive.g:7269:3: ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:7270:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:7270:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
            // InternalBreactive.g:7271:5: lv_outcome_edge_2_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getMergeAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_outcome_edge_2_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMergeRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_2_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:7288:3: (otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==17) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalBreactive.g:7289:4: otherlv_3= ',' ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_68); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMergeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBreactive.g:7293:4: ( (lv_outcome_edge_4_0= ruleUnconditionedEdge ) )
            	    // InternalBreactive.g:7294:5: (lv_outcome_edge_4_0= ruleUnconditionedEdge )
            	    {
            	    // InternalBreactive.g:7294:5: (lv_outcome_edge_4_0= ruleUnconditionedEdge )
            	    // InternalBreactive.g:7295:6: lv_outcome_edge_4_0= ruleUnconditionedEdge
            	    {

            	    						newCompositeNode(grammarAccess.getMergeAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_outcome_edge_4_0=ruleUnconditionedEdge();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMergeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outcome_edge",
            	    							lv_outcome_edge_4_0,
            	    							"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_76); 

            			newLeafNode(otherlv_5, grammarAccess.getMergeAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,92,FOLLOW_68); 

            			newLeafNode(otherlv_6, grammarAccess.getMergeAccess().getAndGoesToKeyword_5());
            		
            // InternalBreactive.g:7321:3: ( (lv_outcome_edge_7_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:7322:4: (lv_outcome_edge_7_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:7322:4: (lv_outcome_edge_7_0= ruleUnconditionedEdge )
            // InternalBreactive.g:7323:5: lv_outcome_edge_7_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getMergeAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_outcome_edge_7_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMergeRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_7_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMerge"


    // $ANTLR start "entryRuleMove"
    // InternalBreactive.g:7344:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalBreactive.g:7344:45: (iv_ruleMove= ruleMove EOF )
            // InternalBreactive.g:7345:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBreactive.g:7351:1: ruleMove returns [EObject current=null] : ( () ( (lv_name_1_0= 'Move to ' ) ) otherlv_2= '{' ( ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) ) | ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) ) ) otherlv_5= '}' ( (lv_outcome_edge_6_0= ruleUnconditionedEdge ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_locationexpression_3_0 = null;

        EObject lv_locationexpression_4_0 = null;

        EObject lv_outcome_edge_6_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7357:2: ( ( () ( (lv_name_1_0= 'Move to ' ) ) otherlv_2= '{' ( ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) ) | ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) ) ) otherlv_5= '}' ( (lv_outcome_edge_6_0= ruleUnconditionedEdge ) ) ) )
            // InternalBreactive.g:7358:2: ( () ( (lv_name_1_0= 'Move to ' ) ) otherlv_2= '{' ( ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) ) | ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) ) ) otherlv_5= '}' ( (lv_outcome_edge_6_0= ruleUnconditionedEdge ) ) )
            {
            // InternalBreactive.g:7358:2: ( () ( (lv_name_1_0= 'Move to ' ) ) otherlv_2= '{' ( ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) ) | ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) ) ) otherlv_5= '}' ( (lv_outcome_edge_6_0= ruleUnconditionedEdge ) ) )
            // InternalBreactive.g:7359:3: () ( (lv_name_1_0= 'Move to ' ) ) otherlv_2= '{' ( ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) ) | ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) ) ) otherlv_5= '}' ( (lv_outcome_edge_6_0= ruleUnconditionedEdge ) )
            {
            // InternalBreactive.g:7359:3: ()
            // InternalBreactive.g:7360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAccess().getMoveAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7366:3: ( (lv_name_1_0= 'Move to ' ) )
            // InternalBreactive.g:7367:4: (lv_name_1_0= 'Move to ' )
            {
            // InternalBreactive.g:7367:4: (lv_name_1_0= 'Move to ' )
            // InternalBreactive.g:7368:5: lv_name_1_0= 'Move to '
            {
            lv_name_1_0=(Token)match(input,95,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveAccess().getNameMoveToKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Move to ");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBreactive.g:7384:3: ( ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) ) | ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=43 && LA82_0<=52)) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalBreactive.g:7385:4: ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) )
                    {
                    // InternalBreactive.g:7385:4: ( (lv_locationexpression_3_0= ruleDeclaredLocalVariable ) )
                    // InternalBreactive.g:7386:5: (lv_locationexpression_3_0= ruleDeclaredLocalVariable )
                    {
                    // InternalBreactive.g:7386:5: (lv_locationexpression_3_0= ruleDeclaredLocalVariable )
                    // InternalBreactive.g:7387:6: lv_locationexpression_3_0= ruleDeclaredLocalVariable
                    {

                    						newCompositeNode(grammarAccess.getMoveAccess().getLocationexpressionDeclaredLocalVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_locationexpression_3_0=ruleDeclaredLocalVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoveRule());
                    						}
                    						set(
                    							current,
                    							"locationexpression",
                    							lv_locationexpression_3_0,
                    							"org.cirad.dsl.xtext.Breactive.DeclaredLocalVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBreactive.g:7405:4: ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) )
                    {
                    // InternalBreactive.g:7405:4: ( (lv_locationexpression_4_0= ruleLocationNamedFCExpression ) )
                    // InternalBreactive.g:7406:5: (lv_locationexpression_4_0= ruleLocationNamedFCExpression )
                    {
                    // InternalBreactive.g:7406:5: (lv_locationexpression_4_0= ruleLocationNamedFCExpression )
                    // InternalBreactive.g:7407:6: lv_locationexpression_4_0= ruleLocationNamedFCExpression
                    {

                    						newCompositeNode(grammarAccess.getMoveAccess().getLocationexpressionLocationNamedFCExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_locationexpression_4_0=ruleLocationNamedFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoveRule());
                    						}
                    						set(
                    							current,
                    							"locationexpression",
                    							lv_locationexpression_4_0,
                    							"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_68); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalBreactive.g:7429:3: ( (lv_outcome_edge_6_0= ruleUnconditionedEdge ) )
            // InternalBreactive.g:7430:4: (lv_outcome_edge_6_0= ruleUnconditionedEdge )
            {
            // InternalBreactive.g:7430:4: (lv_outcome_edge_6_0= ruleUnconditionedEdge )
            // InternalBreactive.g:7431:5: lv_outcome_edge_6_0= ruleUnconditionedEdge
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_outcome_edge_6_0=ruleUnconditionedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					add(
            						current,
            						"outcome_edge",
            						lv_outcome_edge_6_0,
            						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleDie"
    // InternalBreactive.g:7452:1: entryRuleDie returns [EObject current=null] : iv_ruleDie= ruleDie EOF ;
    public final EObject entryRuleDie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDie = null;


        try {
            // InternalBreactive.g:7452:44: (iv_ruleDie= ruleDie EOF )
            // InternalBreactive.g:7453:2: iv_ruleDie= ruleDie EOF
            {
             newCompositeNode(grammarAccess.getDieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDie=ruleDie();

            state._fsp--;

             current =iv_ruleDie; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDie"


    // $ANTLR start "ruleDie"
    // InternalBreactive.g:7459:1: ruleDie returns [EObject current=null] : ( () ( (lv_name_1_0= 'Die' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )? ) ;
    public final EObject ruleDie() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_outcome_edge_2_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7465:2: ( ( () ( (lv_name_1_0= 'Die' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )? ) )
            // InternalBreactive.g:7466:2: ( () ( (lv_name_1_0= 'Die' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )? )
            {
            // InternalBreactive.g:7466:2: ( () ( (lv_name_1_0= 'Die' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )? )
            // InternalBreactive.g:7467:3: () ( (lv_name_1_0= 'Die' ) ) ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )?
            {
            // InternalBreactive.g:7467:3: ()
            // InternalBreactive.g:7468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDieAccess().getDieAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7474:3: ( (lv_name_1_0= 'Die' ) )
            // InternalBreactive.g:7475:4: (lv_name_1_0= 'Die' )
            {
            // InternalBreactive.g:7475:4: (lv_name_1_0= 'Die' )
            // InternalBreactive.g:7476:5: lv_name_1_0= 'Die'
            {
            lv_name_1_0=(Token)match(input,96,FOLLOW_78); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDieAccess().getNameDieKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDieRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Die");
            				

            }


            }

            // InternalBreactive.g:7488:3: ( (lv_outcome_edge_2_0= ruleUnconditionedEdge ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==86) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalBreactive.g:7489:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
                    {
                    // InternalBreactive.g:7489:4: (lv_outcome_edge_2_0= ruleUnconditionedEdge )
                    // InternalBreactive.g:7490:5: lv_outcome_edge_2_0= ruleUnconditionedEdge
                    {

                    					newCompositeNode(grammarAccess.getDieAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_outcome_edge_2_0=ruleUnconditionedEdge();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDieRule());
                    					}
                    					add(
                    						current,
                    						"outcome_edge",
                    						lv_outcome_edge_2_0,
                    						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDie"


    // $ANTLR start "entryRuleReproduce"
    // InternalBreactive.g:7511:1: entryRuleReproduce returns [EObject current=null] : iv_ruleReproduce= ruleReproduce EOF ;
    public final EObject entryRuleReproduce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReproduce = null;


        try {
            // InternalBreactive.g:7511:50: (iv_ruleReproduce= ruleReproduce EOF )
            // InternalBreactive.g:7512:2: iv_ruleReproduce= ruleReproduce EOF
            {
             newCompositeNode(grammarAccess.getReproduceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReproduce=ruleReproduce();

            state._fsp--;

             current =iv_ruleReproduce; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReproduce"


    // $ANTLR start "ruleReproduce"
    // InternalBreactive.g:7518:1: ruleReproduce returns [EObject current=null] : ( () ( (lv_name_1_0= 'Reproduce' ) ) otherlv_2= '(' ( (lv_offspring_quantity_3_0= ruleConstantExpression ) ) otherlv_4= ')' (otherlv_5= 'with ' ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) ) (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )* ) (otherlv_9= 'placed on' ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) ) ) (otherlv_11= 'where' ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) ) )? ( (lv_outcome_edge_13_0= ruleUnconditionedEdge ) )? ) ;
    public final EObject ruleReproduce() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_offspring_quantity_3_0 = null;

        EObject lv_declaredattributes_6_0 = null;

        EObject lv_declaredattributes_8_0 = null;

        EObject lv_initial_location_10_0 = null;

        EObject lv_occupiedExpression_12_0 = null;

        EObject lv_outcome_edge_13_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7524:2: ( ( () ( (lv_name_1_0= 'Reproduce' ) ) otherlv_2= '(' ( (lv_offspring_quantity_3_0= ruleConstantExpression ) ) otherlv_4= ')' (otherlv_5= 'with ' ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) ) (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )* ) (otherlv_9= 'placed on' ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) ) ) (otherlv_11= 'where' ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) ) )? ( (lv_outcome_edge_13_0= ruleUnconditionedEdge ) )? ) )
            // InternalBreactive.g:7525:2: ( () ( (lv_name_1_0= 'Reproduce' ) ) otherlv_2= '(' ( (lv_offspring_quantity_3_0= ruleConstantExpression ) ) otherlv_4= ')' (otherlv_5= 'with ' ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) ) (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )* ) (otherlv_9= 'placed on' ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) ) ) (otherlv_11= 'where' ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) ) )? ( (lv_outcome_edge_13_0= ruleUnconditionedEdge ) )? )
            {
            // InternalBreactive.g:7525:2: ( () ( (lv_name_1_0= 'Reproduce' ) ) otherlv_2= '(' ( (lv_offspring_quantity_3_0= ruleConstantExpression ) ) otherlv_4= ')' (otherlv_5= 'with ' ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) ) (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )* ) (otherlv_9= 'placed on' ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) ) ) (otherlv_11= 'where' ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) ) )? ( (lv_outcome_edge_13_0= ruleUnconditionedEdge ) )? )
            // InternalBreactive.g:7526:3: () ( (lv_name_1_0= 'Reproduce' ) ) otherlv_2= '(' ( (lv_offspring_quantity_3_0= ruleConstantExpression ) ) otherlv_4= ')' (otherlv_5= 'with ' ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) ) (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )* ) (otherlv_9= 'placed on' ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) ) ) (otherlv_11= 'where' ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) ) )? ( (lv_outcome_edge_13_0= ruleUnconditionedEdge ) )?
            {
            // InternalBreactive.g:7526:3: ()
            // InternalBreactive.g:7527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReproduceAccess().getReproduceAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7533:3: ( (lv_name_1_0= 'Reproduce' ) )
            // InternalBreactive.g:7534:4: (lv_name_1_0= 'Reproduce' )
            {
            // InternalBreactive.g:7534:4: (lv_name_1_0= 'Reproduce' )
            // InternalBreactive.g:7535:5: lv_name_1_0= 'Reproduce'
            {
            lv_name_1_0=(Token)match(input,97,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReproduceAccess().getNameReproduceKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReproduceRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Reproduce");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getReproduceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBreactive.g:7551:3: ( (lv_offspring_quantity_3_0= ruleConstantExpression ) )
            // InternalBreactive.g:7552:4: (lv_offspring_quantity_3_0= ruleConstantExpression )
            {
            // InternalBreactive.g:7552:4: (lv_offspring_quantity_3_0= ruleConstantExpression )
            // InternalBreactive.g:7553:5: lv_offspring_quantity_3_0= ruleConstantExpression
            {

            					newCompositeNode(grammarAccess.getReproduceAccess().getOffspring_quantityConstantExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
            lv_offspring_quantity_3_0=ruleConstantExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReproduceRule());
            					}
            					set(
            						current,
            						"offspring_quantity",
            						lv_offspring_quantity_3_0,
            						"org.cirad.dsl.xtext.Breactive.ConstantExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_79); 

            			newLeafNode(otherlv_4, grammarAccess.getReproduceAccess().getRightParenthesisKeyword_4());
            		
            // InternalBreactive.g:7574:3: (otherlv_5= 'with ' ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) ) (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )* )
            // InternalBreactive.g:7575:4: otherlv_5= 'with ' ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) ) (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )*
            {
            otherlv_5=(Token)match(input,98,FOLLOW_15); 

            				newLeafNode(otherlv_5, grammarAccess.getReproduceAccess().getWithKeyword_5_0());
            			
            // InternalBreactive.g:7579:4: ( (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression ) )
            // InternalBreactive.g:7580:5: (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression )
            {
            // InternalBreactive.g:7580:5: (lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression )
            // InternalBreactive.g:7581:6: lv_declaredattributes_6_0= ruleSetAttributeNamedFCExpression
            {

            						newCompositeNode(grammarAccess.getReproduceAccess().getDeclaredattributesSetAttributeNamedFCExpressionParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_80);
            lv_declaredattributes_6_0=ruleSetAttributeNamedFCExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getReproduceRule());
            						}
            						add(
            							current,
            							"declaredattributes",
            							lv_declaredattributes_6_0,
            							"org.cirad.dsl.xtext.Breactive.SetAttributeNamedFCExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBreactive.g:7598:4: (otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==17) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalBreactive.g:7599:5: otherlv_7= ',' ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_15); 

            	    					newLeafNode(otherlv_7, grammarAccess.getReproduceAccess().getCommaKeyword_5_2_0());
            	    				
            	    // InternalBreactive.g:7603:5: ( (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression ) )
            	    // InternalBreactive.g:7604:6: (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression )
            	    {
            	    // InternalBreactive.g:7604:6: (lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression )
            	    // InternalBreactive.g:7605:7: lv_declaredattributes_8_0= ruleSetAttributeNamedFCExpression
            	    {

            	    							newCompositeNode(grammarAccess.getReproduceAccess().getDeclaredattributesSetAttributeNamedFCExpressionParserRuleCall_5_2_1_0());
            	    						
            	    pushFollow(FOLLOW_80);
            	    lv_declaredattributes_8_0=ruleSetAttributeNamedFCExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getReproduceRule());
            	    							}
            	    							add(
            	    								current,
            	    								"declaredattributes",
            	    								lv_declaredattributes_8_0,
            	    								"org.cirad.dsl.xtext.Breactive.SetAttributeNamedFCExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            // InternalBreactive.g:7624:3: (otherlv_9= 'placed on' ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) ) )
            // InternalBreactive.g:7625:4: otherlv_9= 'placed on' ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) )
            {
            otherlv_9=(Token)match(input,99,FOLLOW_16); 

            				newLeafNode(otherlv_9, grammarAccess.getReproduceAccess().getPlacedOnKeyword_6_0());
            			
            // InternalBreactive.g:7629:4: ( (lv_initial_location_10_0= ruleLocationNamedFCExpression ) )
            // InternalBreactive.g:7630:5: (lv_initial_location_10_0= ruleLocationNamedFCExpression )
            {
            // InternalBreactive.g:7630:5: (lv_initial_location_10_0= ruleLocationNamedFCExpression )
            // InternalBreactive.g:7631:6: lv_initial_location_10_0= ruleLocationNamedFCExpression
            {

            						newCompositeNode(grammarAccess.getReproduceAccess().getInitial_locationLocationNamedFCExpressionParserRuleCall_6_1_0());
            					
            pushFollow(FOLLOW_81);
            lv_initial_location_10_0=ruleLocationNamedFCExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getReproduceRule());
            						}
            						set(
            							current,
            							"initial_location",
            							lv_initial_location_10_0,
            							"org.cirad.dsl.xtext.Breactive.LocationNamedFCExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalBreactive.g:7649:3: (otherlv_11= 'where' ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==100) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalBreactive.g:7650:4: otherlv_11= 'where' ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) )
                    {
                    otherlv_11=(Token)match(input,100,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getReproduceAccess().getWhereKeyword_7_0());
                    			
                    // InternalBreactive.g:7654:4: ( (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression ) )
                    // InternalBreactive.g:7655:5: (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression )
                    {
                    // InternalBreactive.g:7655:5: (lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression )
                    // InternalBreactive.g:7656:6: lv_occupiedExpression_12_0= ruleBooleanIsOccuppiedLocationFCExpression
                    {

                    						newCompositeNode(grammarAccess.getReproduceAccess().getOccupiedExpressionBooleanIsOccuppiedLocationFCExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_occupiedExpression_12_0=ruleBooleanIsOccuppiedLocationFCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReproduceRule());
                    						}
                    						add(
                    							current,
                    							"occupiedExpression",
                    							lv_occupiedExpression_12_0,
                    							"org.cirad.dsl.xtext.Breactive.BooleanIsOccuppiedLocationFCExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBreactive.g:7674:3: ( (lv_outcome_edge_13_0= ruleUnconditionedEdge ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==86) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalBreactive.g:7675:4: (lv_outcome_edge_13_0= ruleUnconditionedEdge )
                    {
                    // InternalBreactive.g:7675:4: (lv_outcome_edge_13_0= ruleUnconditionedEdge )
                    // InternalBreactive.g:7676:5: lv_outcome_edge_13_0= ruleUnconditionedEdge
                    {

                    					newCompositeNode(grammarAccess.getReproduceAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_outcome_edge_13_0=ruleUnconditionedEdge();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReproduceRule());
                    					}
                    					add(
                    						current,
                    						"outcome_edge",
                    						lv_outcome_edge_13_0,
                    						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReproduce"


    // $ANTLR start "entryRuleAdd"
    // InternalBreactive.g:7697:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalBreactive.g:7697:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalBreactive.g:7698:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalBreactive.g:7704:1: ruleAdd returns [EObject current=null] : ( () ( ( (lv_name_1_0= 'Add' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'to' ) ( (lv_toAttribute_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_toAttribute_4_0 = null;

        EObject lv_outcome_edge_5_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7710:2: ( ( () ( ( (lv_name_1_0= 'Add' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'to' ) ( (lv_toAttribute_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? ) )
            // InternalBreactive.g:7711:2: ( () ( ( (lv_name_1_0= 'Add' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'to' ) ( (lv_toAttribute_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? )
            {
            // InternalBreactive.g:7711:2: ( () ( ( (lv_name_1_0= 'Add' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'to' ) ( (lv_toAttribute_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? )
            // InternalBreactive.g:7712:3: () ( ( (lv_name_1_0= 'Add' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'to' ) ( (lv_toAttribute_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )?
            {
            // InternalBreactive.g:7712:3: ()
            // InternalBreactive.g:7713:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAccess().getAddAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7719:3: ( ( (lv_name_1_0= 'Add' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'to' )
            // InternalBreactive.g:7720:4: ( (lv_name_1_0= 'Add' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'to'
            {
            // InternalBreactive.g:7720:4: ( (lv_name_1_0= 'Add' ) )
            // InternalBreactive.g:7721:5: (lv_name_1_0= 'Add' )
            {
            // InternalBreactive.g:7721:5: (lv_name_1_0= 'Add' )
            // InternalBreactive.g:7722:6: lv_name_1_0= 'Add'
            {
            lv_name_1_0=(Token)match(input,101,FOLLOW_20); 

            						newLeafNode(lv_name_1_0, grammarAccess.getAddAccess().getNameAddKeyword_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAddRule());
            						}
            						setWithLastConsumed(current, "name", lv_name_1_0, "Add");
            					

            }


            }

            // InternalBreactive.g:7734:4: ( (lv_expression_2_0= ruleFunctionCallExpression ) )
            // InternalBreactive.g:7735:5: (lv_expression_2_0= ruleFunctionCallExpression )
            {
            // InternalBreactive.g:7735:5: (lv_expression_2_0= ruleFunctionCallExpression )
            // InternalBreactive.g:7736:6: lv_expression_2_0= ruleFunctionCallExpression
            {

            						newCompositeNode(grammarAccess.getAddAccess().getExpressionFunctionCallExpressionParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_82);
            lv_expression_2_0=ruleFunctionCallExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAddRule());
            						}
            						add(
            							current,
            							"expression",
            							lv_expression_2_0,
            							"org.cirad.dsl.xtext.Breactive.FunctionCallExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,102,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getAddAccess().getToKeyword_1_2());
            			

            }

            // InternalBreactive.g:7758:3: ( (lv_toAttribute_4_0= ruleDeclaredAttributes ) )
            // InternalBreactive.g:7759:4: (lv_toAttribute_4_0= ruleDeclaredAttributes )
            {
            // InternalBreactive.g:7759:4: (lv_toAttribute_4_0= ruleDeclaredAttributes )
            // InternalBreactive.g:7760:5: lv_toAttribute_4_0= ruleDeclaredAttributes
            {

            					newCompositeNode(grammarAccess.getAddAccess().getToAttributeDeclaredAttributesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_78);
            lv_toAttribute_4_0=ruleDeclaredAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"toAttribute",
            						lv_toAttribute_4_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:7777:3: ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==86) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalBreactive.g:7778:4: (lv_outcome_edge_5_0= ruleUnconditionedEdge )
                    {
                    // InternalBreactive.g:7778:4: (lv_outcome_edge_5_0= ruleUnconditionedEdge )
                    // InternalBreactive.g:7779:5: lv_outcome_edge_5_0= ruleUnconditionedEdge
                    {

                    					newCompositeNode(grammarAccess.getAddAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_outcome_edge_5_0=ruleUnconditionedEdge();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAddRule());
                    					}
                    					add(
                    						current,
                    						"outcome_edge",
                    						lv_outcome_edge_5_0,
                    						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleRemove"
    // InternalBreactive.g:7800:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalBreactive.g:7800:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalBreactive.g:7801:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalBreactive.g:7807:1: ruleRemove returns [EObject current=null] : ( () ( ( (lv_name_1_0= 'Remove' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'from ' ) ( (lv_from_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_from_4_0 = null;

        EObject lv_outcome_edge_5_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7813:2: ( ( () ( ( (lv_name_1_0= 'Remove' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'from ' ) ( (lv_from_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? ) )
            // InternalBreactive.g:7814:2: ( () ( ( (lv_name_1_0= 'Remove' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'from ' ) ( (lv_from_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? )
            {
            // InternalBreactive.g:7814:2: ( () ( ( (lv_name_1_0= 'Remove' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'from ' ) ( (lv_from_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )? )
            // InternalBreactive.g:7815:3: () ( ( (lv_name_1_0= 'Remove' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'from ' ) ( (lv_from_4_0= ruleDeclaredAttributes ) ) ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )?
            {
            // InternalBreactive.g:7815:3: ()
            // InternalBreactive.g:7816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRemoveAccess().getRemoveAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7822:3: ( ( (lv_name_1_0= 'Remove' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'from ' )
            // InternalBreactive.g:7823:4: ( (lv_name_1_0= 'Remove' ) ) ( (lv_expression_2_0= ruleFunctionCallExpression ) ) otherlv_3= 'from '
            {
            // InternalBreactive.g:7823:4: ( (lv_name_1_0= 'Remove' ) )
            // InternalBreactive.g:7824:5: (lv_name_1_0= 'Remove' )
            {
            // InternalBreactive.g:7824:5: (lv_name_1_0= 'Remove' )
            // InternalBreactive.g:7825:6: lv_name_1_0= 'Remove'
            {
            lv_name_1_0=(Token)match(input,103,FOLLOW_20); 

            						newLeafNode(lv_name_1_0, grammarAccess.getRemoveAccess().getNameRemoveKeyword_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRemoveRule());
            						}
            						setWithLastConsumed(current, "name", lv_name_1_0, "Remove");
            					

            }


            }

            // InternalBreactive.g:7837:4: ( (lv_expression_2_0= ruleFunctionCallExpression ) )
            // InternalBreactive.g:7838:5: (lv_expression_2_0= ruleFunctionCallExpression )
            {
            // InternalBreactive.g:7838:5: (lv_expression_2_0= ruleFunctionCallExpression )
            // InternalBreactive.g:7839:6: lv_expression_2_0= ruleFunctionCallExpression
            {

            						newCompositeNode(grammarAccess.getRemoveAccess().getExpressionFunctionCallExpressionParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_51);
            lv_expression_2_0=ruleFunctionCallExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRemoveRule());
            						}
            						add(
            							current,
            							"expression",
            							lv_expression_2_0,
            							"org.cirad.dsl.xtext.Breactive.FunctionCallExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,79,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getRemoveAccess().getFromKeyword_1_2());
            			

            }

            // InternalBreactive.g:7861:3: ( (lv_from_4_0= ruleDeclaredAttributes ) )
            // InternalBreactive.g:7862:4: (lv_from_4_0= ruleDeclaredAttributes )
            {
            // InternalBreactive.g:7862:4: (lv_from_4_0= ruleDeclaredAttributes )
            // InternalBreactive.g:7863:5: lv_from_4_0= ruleDeclaredAttributes
            {

            					newCompositeNode(grammarAccess.getRemoveAccess().getFromDeclaredAttributesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_78);
            lv_from_4_0=ruleDeclaredAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_4_0,
            						"org.cirad.dsl.xtext.Breactive.DeclaredAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBreactive.g:7880:3: ( (lv_outcome_edge_5_0= ruleUnconditionedEdge ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==86) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalBreactive.g:7881:4: (lv_outcome_edge_5_0= ruleUnconditionedEdge )
                    {
                    // InternalBreactive.g:7881:4: (lv_outcome_edge_5_0= ruleUnconditionedEdge )
                    // InternalBreactive.g:7882:5: lv_outcome_edge_5_0= ruleUnconditionedEdge
                    {

                    					newCompositeNode(grammarAccess.getRemoveAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_outcome_edge_5_0=ruleUnconditionedEdge();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRemoveRule());
                    					}
                    					add(
                    						current,
                    						"outcome_edge",
                    						lv_outcome_edge_5_0,
                    						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleSet"
    // InternalBreactive.g:7903:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalBreactive.g:7903:44: (iv_ruleSet= ruleSet EOF )
            // InternalBreactive.g:7904:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalBreactive.g:7910:1: ruleSet returns [EObject current=null] : ( () ( ( (lv_name_1_0= 'Set' ) ) ( (lv_assignment_2_0= ruleAssignment ) ) ) ( (lv_outcome_edge_3_0= ruleUnconditionedEdge ) )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_assignment_2_0 = null;

        EObject lv_outcome_edge_3_0 = null;



        	enterRule();

        try {
            // InternalBreactive.g:7916:2: ( ( () ( ( (lv_name_1_0= 'Set' ) ) ( (lv_assignment_2_0= ruleAssignment ) ) ) ( (lv_outcome_edge_3_0= ruleUnconditionedEdge ) )? ) )
            // InternalBreactive.g:7917:2: ( () ( ( (lv_name_1_0= 'Set' ) ) ( (lv_assignment_2_0= ruleAssignment ) ) ) ( (lv_outcome_edge_3_0= ruleUnconditionedEdge ) )? )
            {
            // InternalBreactive.g:7917:2: ( () ( ( (lv_name_1_0= 'Set' ) ) ( (lv_assignment_2_0= ruleAssignment ) ) ) ( (lv_outcome_edge_3_0= ruleUnconditionedEdge ) )? )
            // InternalBreactive.g:7918:3: () ( ( (lv_name_1_0= 'Set' ) ) ( (lv_assignment_2_0= ruleAssignment ) ) ) ( (lv_outcome_edge_3_0= ruleUnconditionedEdge ) )?
            {
            // InternalBreactive.g:7918:3: ()
            // InternalBreactive.g:7919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetAccess().getSetVariableAction_0(),
            					current);
            			

            }

            // InternalBreactive.g:7925:3: ( ( (lv_name_1_0= 'Set' ) ) ( (lv_assignment_2_0= ruleAssignment ) ) )
            // InternalBreactive.g:7926:4: ( (lv_name_1_0= 'Set' ) ) ( (lv_assignment_2_0= ruleAssignment ) )
            {
            // InternalBreactive.g:7926:4: ( (lv_name_1_0= 'Set' ) )
            // InternalBreactive.g:7927:5: (lv_name_1_0= 'Set' )
            {
            // InternalBreactive.g:7927:5: (lv_name_1_0= 'Set' )
            // InternalBreactive.g:7928:6: lv_name_1_0= 'Set'
            {
            lv_name_1_0=(Token)match(input,104,FOLLOW_15); 

            						newLeafNode(lv_name_1_0, grammarAccess.getSetAccess().getNameSetKeyword_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSetRule());
            						}
            						setWithLastConsumed(current, "name", lv_name_1_0, "Set");
            					

            }


            }

            // InternalBreactive.g:7940:4: ( (lv_assignment_2_0= ruleAssignment ) )
            // InternalBreactive.g:7941:5: (lv_assignment_2_0= ruleAssignment )
            {
            // InternalBreactive.g:7941:5: (lv_assignment_2_0= ruleAssignment )
            // InternalBreactive.g:7942:6: lv_assignment_2_0= ruleAssignment
            {

            						newCompositeNode(grammarAccess.getSetAccess().getAssignmentAssignmentParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_78);
            lv_assignment_2_0=ruleAssignment();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSetRule());
            						}
            						set(
            							current,
            							"assignment",
            							lv_assignment_2_0,
            							"org.cirad.dsl.xtext.Breactive.Assignment");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalBreactive.g:7960:3: ( (lv_outcome_edge_3_0= ruleUnconditionedEdge ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==86) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalBreactive.g:7961:4: (lv_outcome_edge_3_0= ruleUnconditionedEdge )
                    {
                    // InternalBreactive.g:7961:4: (lv_outcome_edge_3_0= ruleUnconditionedEdge )
                    // InternalBreactive.g:7962:5: lv_outcome_edge_3_0= ruleUnconditionedEdge
                    {

                    					newCompositeNode(grammarAccess.getSetAccess().getOutcome_edgeUnconditionedEdgeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_outcome_edge_3_0=ruleUnconditionedEdge();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSetRule());
                    					}
                    					add(
                    						current,
                    						"outcome_edge",
                    						lv_outcome_edge_3_0,
                    						"org.cirad.dsl.xtext.Breactive.UnconditionedEdge");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "ruleTypeEnum"
    // InternalBreactive.g:7983:1: ruleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) | (enumLiteral_4= 'Location' ) | (enumLiteral_5= 'LocationSet' ) | (enumLiteral_6= 'Entity' ) | (enumLiteral_7= 'EntitySet' ) ) ;
    public final Enumerator ruleTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalBreactive.g:7989:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) | (enumLiteral_4= 'Location' ) | (enumLiteral_5= 'LocationSet' ) | (enumLiteral_6= 'Entity' ) | (enumLiteral_7= 'EntitySet' ) ) )
            // InternalBreactive.g:7990:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) | (enumLiteral_4= 'Location' ) | (enumLiteral_5= 'LocationSet' ) | (enumLiteral_6= 'Entity' ) | (enumLiteral_7= 'EntitySet' ) )
            {
            // InternalBreactive.g:7990:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) | (enumLiteral_4= 'Location' ) | (enumLiteral_5= 'LocationSet' ) | (enumLiteral_6= 'Entity' ) | (enumLiteral_7= 'EntitySet' ) )
            int alt90=8;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt90=1;
                }
                break;
            case 106:
                {
                alt90=2;
                }
                break;
            case 107:
                {
                alt90=3;
                }
                break;
            case 108:
                {
                alt90=4;
                }
                break;
            case 109:
                {
                alt90=5;
                }
                break;
            case 110:
                {
                alt90=6;
                }
                break;
            case 15:
                {
                alt90=7;
                }
                break;
            case 111:
                {
                alt90=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalBreactive.g:7991:3: (enumLiteral_0= 'String' )
                    {
                    // InternalBreactive.g:7991:3: (enumLiteral_0= 'String' )
                    // InternalBreactive.g:7992:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBreactive.g:7999:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalBreactive.g:7999:3: (enumLiteral_1= 'Int' )
                    // InternalBreactive.g:8000:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeEnumAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBreactive.g:8007:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalBreactive.g:8007:3: (enumLiteral_2= 'Float' )
                    // InternalBreactive.g:8008:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBreactive.g:8015:3: (enumLiteral_3= 'Boolean' )
                    {
                    // InternalBreactive.g:8015:3: (enumLiteral_3= 'Boolean' )
                    // InternalBreactive.g:8016:4: enumLiteral_3= 'Boolean'
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBreactive.g:8023:3: (enumLiteral_4= 'Location' )
                    {
                    // InternalBreactive.g:8023:3: (enumLiteral_4= 'Location' )
                    // InternalBreactive.g:8024:4: enumLiteral_4= 'Location'
                    {
                    enumLiteral_4=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getLocationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeEnumAccess().getLocationEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBreactive.g:8031:3: (enumLiteral_5= 'LocationSet' )
                    {
                    // InternalBreactive.g:8031:3: (enumLiteral_5= 'LocationSet' )
                    // InternalBreactive.g:8032:4: enumLiteral_5= 'LocationSet'
                    {
                    enumLiteral_5=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getLocationsetEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeEnumAccess().getLocationsetEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBreactive.g:8039:3: (enumLiteral_6= 'Entity' )
                    {
                    // InternalBreactive.g:8039:3: (enumLiteral_6= 'Entity' )
                    // InternalBreactive.g:8040:4: enumLiteral_6= 'Entity'
                    {
                    enumLiteral_6=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getEntityEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeEnumAccess().getEntityEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBreactive.g:8047:3: (enumLiteral_7= 'EntitySet' )
                    {
                    // InternalBreactive.g:8047:3: (enumLiteral_7= 'EntitySet' )
                    // InternalBreactive.g:8048:4: enumLiteral_7= 'EntitySet'
                    {
                    enumLiteral_7=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getTypeEnumAccess().getEntitysetEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeEnumAccess().getEntitysetEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeEnum"

    // Delegated rules


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\2\uffff\2\1\2\uffff\7\4\5\uffff\2\1";
    static final String dfa_3s = "\1\4\1\uffff\2\4\1\uffff\1\34\7\4\1\uffff\1\4\1\uffff\1\6\1\uffff\2\4";
    static final String dfa_4s = "\1\104\1\uffff\2\150\1\uffff\1\120\7\150\1\uffff\1\4\1\uffff\1\6\1\uffff\2\150";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\10\uffff\1\3\1\uffff\1\5\1\uffff\1\4\2\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\3\25\uffff\1\1\6\uffff\1\1\2\uffff\5\1\2\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\4\15\6\uffff\1\15\2\uffff\2\15",
            "",
            "\1\1\11\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\uffff\1\16\3\uffff\2\1\2\uffff\1\15\4\1\24\uffff\5\15\11\uffff\1\17\6\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\6\uffff\3\1\3\uffff\4\1",
            "\1\1\11\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\uffff\1\20\3\uffff\2\1\2\uffff\1\15\4\1\24\uffff\5\15\20\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\6\uffff\3\1\3\uffff\4\1",
            "",
            "\1\21\63\uffff\1\4",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\5\uffff\2\4\55\uffff\1\15\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff\3\4\3\uffff\4\4",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\5\uffff\2\4\55\uffff\1\15\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff\3\4\3\uffff\4\4",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\5\uffff\2\4\55\uffff\1\15\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff\3\4\3\uffff\4\4",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\5\uffff\2\4\55\uffff\1\15\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff\3\4\3\uffff\4\4",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\5\uffff\2\4\55\uffff\1\15\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff\3\4\3\uffff\4\4",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\5\uffff\2\4\55\uffff\1\15\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff\3\4\3\uffff\4\4",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\5\uffff\2\4\55\uffff\1\15\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff\3\4\3\uffff\4\4",
            "",
            "\1\22",
            "",
            "\1\23",
            "",
            "\1\1\11\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\uffff\1\16\3\uffff\2\1\2\uffff\1\15\4\1\24\uffff\5\15\11\uffff\1\17\6\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\6\uffff\3\1\3\uffff\4\1",
            "\1\1\11\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff\1\1\5\uffff\2\1\2\uffff\1\15\4\1\24\uffff\5\15\20\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\6\uffff\3\1\3\uffff\4\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3152:2: (this_NumericNamedFCExpression_0= ruleNumericNamedFCExpression | this_LocationNamedFCExpression_1= ruleLocationNamedFCExpression | this_BooleanNamedFCExpression_2= ruleBooleanNamedFCExpression | this_EntityNamedFCExpression_3= ruleEntityNamedFCExpression | this_GetNamedFCExpression_4= ruleGetNamedFCExpression )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\52\1\34\1\4\1\uffff\1\31\1\4\1\uffff\1\31";
    static final String dfa_10s = "\1\52\1\34\1\104\1\uffff\1\64\1\4\1\uffff\1\64";
    static final String dfa_11s = "\3\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\4\50\uffff\1\3\25\uffff\2\3",
            "",
            "\1\5\3\uffff\1\6\20\uffff\7\3",
            "\1\7",
            "",
            "\1\5\3\uffff\1\6\20\uffff\7\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5329:2: (this_CountVariableFCExpression_0= ruleCountVariableFCExpression | this_CountEntityFCExpression_1= ruleCountEntityFCExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000184000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004802L,0x00000000000000A0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004802L,0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000184014000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000184004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001FF80000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000104010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x03DFFFC810100050L,0x0000000000000019L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L,0x0000FE0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008804000L,0x000001A380000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000804000L,0x000001A380000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L,0x000001A380000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008800000L,0x0000000000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000810100050L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x7C00000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x83DFF80810100050L,0x0000000000000019L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000100010L,0x0000000000000018L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x03DFF80810100050L,0x0000000000000019L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000007C810100050L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000200000100010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0020100000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0034100000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000810100070L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000100010L,0x000001A3EA200000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000008900010L,0x000001A3EA300000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x03DFF80830100050L,0x0000000000000019L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000004000L,0x0000000001000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x001FF80000000010L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000020000L,0x0000000800000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000001000400000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});

}
