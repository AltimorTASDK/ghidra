/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Forces the program's compiler type to Visual Studio
//@category C++

import ghidra.app.script.GhidraScript;
import ghidra.app.util.opinion.PeLoader.CompilerOpinion.CompilerEnum;

public class ForceVisualStudio extends GhidraScript {

	@Override
	public void run() throws Exception {

		if (currentProgram == null) {
			if (!isRunningHeadless()) {
				println("There is no open program.");
			}
			return;
		}
		currentProgram.setCompiler(CompilerEnum.VisualStudio.toString());
	}
}
