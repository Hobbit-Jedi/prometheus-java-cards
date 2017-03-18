/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Hobbit Jedi
 */
enum Rank {
	SIX {
		@Override
		public String toString() {
			return "6";
		}
	},
	SEVEN {
		@Override
		public String toString() {
			return "7";
		}
	},
	EIGHT {
		@Override
		public String toString() {
			return "8";
		}
	},
	NINE {
		@Override
		public String toString() {
			return "9";
		}
	},
	TEN {
		@Override
		public String toString() {
			return "10";
		}
	},
	JACK {
		@Override
		public String toString() {
			return "В";
		}
	},
	QUEEN {
		@Override
		public String toString() {
			return "Д";
		}
	},
	KING {
		@Override
		public String toString() {
			return "К";
		}
	},
	ACE {
		@Override
		public String toString() {
			return "Т";
		}
	};
}
